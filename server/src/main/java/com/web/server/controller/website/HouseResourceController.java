package com.web.server.controller.website;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.servlet.http.HttpServletResponse;

import com.web.business.model.api.HouseSearchCondition;
import com.web.business.model.api.SubwayStationVo;
import com.web.common.utils.cache.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.web.business.enums.RoomTowardEnum;
import com.web.business.model.caspain.Area;
import com.web.business.model.caspain.House;
import com.web.business.model.caspain.HouseExample;
import com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs;
import com.web.business.model.caspain.Picture;
import com.web.business.model.caspain.Room;
import com.web.business.model.caspain.SubwayInfo;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;
import com.web.business.page.website.IndexManagerModelVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.ApartmentResourceServcie;
import com.web.business.service.website.CaspainAreaService;
import com.web.business.service.website.CaspainOpenchannelsShowroomsService;
import com.web.business.service.website.CaspainPictureService;
import com.web.business.service.website.CaspainRoomService;
import com.web.business.service.website.HouseResourceService;
import com.web.business.service.website.IndexService;
import com.web.business.service.website.ManagerNavigationService;
import com.web.business.service.website.SubwayInfoService;
import com.web.common.support.DomainThreadLocal;

@Controller
public class HouseResourceController {
    @Autowired
    private HouseResourceService houseResourceService;
    @Autowired
    private ApartmentResourceServcie apartmentResourceServcie;
    @Autowired
    private ManagerNavigationService managerNavigationService;
    @Autowired
    private CaspainAreaService caspainAreaService;
    @Autowired
    private CaspainRoomService caspainRoomService;
    @Autowired
    private CaspainPictureService caspainPictureService;
    @Autowired
    private CaspainOpenchannelsShowroomsService caspainOpenchannelsShowroomsService;
    @Autowired
    private IndexService indexService;
    @Autowired
    private SubwayInfoService subwayInfoService;

    @RequestMapping(value = "{userId}/house/houseList", method = RequestMethod.GET)
    public String getHouseResource(Model model, @RequestParam(value = "city", required = false) String city) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        String currentCity = indexVO.getCities().iterator().next();
        //根据城市获取区域信息
        Map<String, List<String>> blockByDistrict = houseResourceService.getBlockByDistrict(city);
        //根据城市获取地铁信息
        Map<String, ArrayList<SubwayStationVo>> subwayLinesByCity = subwayInfoService.getSubwayLinesByCity(city);
        //获取已发(分散式)房源
        List<HouseListVo> houseList = houseResourceService.getHouseList(currentCity, managerWebId);
        //获取已发(集中式)房源
        List<ApartmentListVo> apartmentList = houseResourceService.getApartmentList(currentCity, managerWebId);
        model.addAttribute("districtList", blockByDistrict);
        model.addAttribute("houseList", houseList);
        model.addAttribute("subwayLinesByCity", subwayLinesByCity);
        model.addAttribute("apartmentList", apartmentList);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        model.addAttribute("managerWebId", managerWebId);
        model.addAttribute("indexVO",indexVO);
        return "houseList";
    }

    //模糊查询房源列表(公寓+分散)
    @RequestMapping(value = "houseList")
    public String getHouseListBySearch(Integer managerWebId, String search, String city, HttpServletResponse response) throws Exception {
        List<HouseListVo> houseListBySearch = houseResourceService.getHouseListBySearch(managerWebId, search, city);
        List<ApartmentListVo> apartmentListVos = houseResourceService.getApartmentListBySearch(managerWebId, search, city);
        Map<String,Object> houseResouce = new HashMap<String,Object>();
        houseResouce.put("houseListBySearch",houseListBySearch);
        houseResouce.put("apartmentListVos",apartmentListVos);
        System.out.println(houseResouce);
        String result = JSON.toJSONString(houseResouce);
        response.getWriter().write(result);
        return null;
    }

    //根据条件筛选房源
    @RequestMapping(value = "housecontition")
    public String getHouseListByCodition(HouseSearchCondition houseSearchCondition, HttpServletResponse response) throws Exception {
        System.out.println(houseSearchCondition);
        List<HouseListVo> housesList = houseResourceService.getHouseByCondition(houseSearchCondition);
        List<ApartmentListVo> apartmentList = houseResourceService.getApartmentByCondition(houseSearchCondition);
        Map<String,Object> houseByCodition = new HashMap<String,Object>();
        houseByCodition.put("housesList",housesList);
        houseByCodition.put("apartmentList",apartmentList);
        String result = JSON.toJSONString(houseByCodition);
        response.getWriter().write(result);
        return null;
    }

    //===========================正式域名访问地址=========================================//

    @RequestMapping(value = "/house/houseList", method = RequestMethod.GET)
    public String getHouseResource02(Model model, @RequestParam(value = "city", required = false) String city) {
        String houseList = getHouseResource(model, city);
        model.addAttribute("userId", null);
        return houseList;
    }
}
