package com.web.server.controller.website;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.web.business.model.api.BMapObject;
import com.web.business.model.api.HouseSearchCondition;
import com.web.business.model.api.SubwayStationVo;
import com.web.business.model.caspain.House;
import com.web.business.model.caspain.HuangheDistrict;
import com.web.business.model.volga.Apartment;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;
import com.web.business.page.website.IndexManagerModelVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.BMapSearchService;
import com.web.business.service.website.IndexService;
import com.web.business.service.website.SubwayInfoService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.cache.CacheUtils;
import com.web.common.utils.cache.enums.ExpireTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MapSearchController {
    @Autowired
    private IndexService indexService;
    @Autowired
    private BMapSearchService bMapSearchService;
    @Autowired
    private SubwayInfoService subwayInfoService;

    @RequestMapping(value = "{userId}/map", method = RequestMethod.GET)
    public String getBmp01(Model model, @RequestParam(value = "city", required = false) String city,BMapObject bMapObject) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        String currentCity = indexVO.getCities().iterator().next();
        Map<String, Object> districtMap = bMapSearchService.getDistrictByCity(managerWebId,city, bMapObject);
        List<HuangheDistrict> huangheDistricts = (List<HuangheDistrict>) districtMap.get("huangheDistricts");
        List<Map<String,Object>> districtsAndBlockList = (List<Map<String, Object>>) districtMap.get("districtsAndBlockList");
        //获取地铁信息
        Map<String, ArrayList<SubwayStationVo>> subwayInfo = subwayInfoService.getSubwayLinesByCity(city);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("huangheDistricts", huangheDistricts);
        model.addAttribute("districtsAndBlockList", districtsAndBlockList);
        model.addAttribute("managerWebId", managerWebId);
        model.addAttribute("subwayInfo", subwayInfo);
        return "map";
    }

    //===========================正式域名访问地址=========================================//

    @RequestMapping(value = "map", method = RequestMethod.GET)
    public String getBmp02(Model model, @RequestParam(value = "city", required = false) String city,BMapObject bMapObject) {
        String map = getBmp01(model, city, bMapObject);
        model.addAttribute("userId", null);
        return map;
    }


    //获取指定范围内的区级行政区列表(包含区级行政区名称，经纬坐标,房源数量)
    @RequestMapping(value = "map/getDistrict")
    public String getDistrict(Integer managerWebId, String city, BMapObject bMapObject, HttpServletResponse response) throws Exception {
        System.out.println(managerWebId);
        Map<String, Object> districtList = bMapSearchService.getDistrictByCity(managerWebId,city, bMapObject);
        List<HuangheDistrict> districts = (List<HuangheDistrict>) districtList.get("huangheDistricts");
        List<House> houses = (List<House>) districtList.get("house");
        //当前区域的房间数量
        Integer roomNum = houses.size();
        System.out.println(districtList.get("districtsAndBlockList"));
        Map<String, Object> map = new HashMap<>();
        map.put("roomNum",roomNum);
        map.put("districts",districts);
        String districtInformation = JSON.toJSONString(map);
        response.getWriter().write(districtInformation);
        return null;
    }

    //获取指定区级行政区范围内的商圈列表
    @RequestMapping(value = "map/getBlock")
    public String getBlock(@RequestParam(value = "district", required = false) String district,
                           @RequestParam(value = "city", required = false) String city,
                           @RequestParam(value = "userId") Integer managerWebId,
                           BMapObject bMapObject,
                           HttpServletResponse response) throws Exception {
        Map<String, Object> BlocktList = bMapSearchService.getBlockByDistrict(managerWebId, city, district, bMapObject);
        String block = JSON.toJSONString(BlocktList);
        response.getWriter().write(block);
        return null;
    }

    //获取地铁信息（地铁线路，以及地铁站经纬坐标）
    @RequestMapping(value = "map/getSubwayInfo")
    public String getSubwayInfo(@RequestParam(value = "city", required = false) String city, BMapObject bMapObject, HttpServletResponse response) throws Exception {
        Map<String, ArrayList<SubwayStationVo>> subwayInfo = subwayInfoService.getSubwayLinesByCity(city);
        System.out.println(subwayInfo);
        String subway = JSON.toJSONString(subwayInfo);
        response.getWriter().write(subway);
        return null;
    }

    //获取房源(分散式+集中)的信息(包含房源详情，房间详情，房源经纬度坐标)
    @RequestMapping(value = "map/getHouseInfo")
    public String getHouselist(@RequestParam(value = "city", required = false) String city,
                               @RequestBody BMapObject bMapObject,
                               @RequestParam(value = "userId") Integer managerWebId,
                               HttpServletResponse response) throws Exception {
        Integer houseLevel = 15;
        if (bMapObject.getLevel() > houseLevel) {
            bMapObject.setLevel(houseLevel);
        }
        //获取已发(分散式)房源
        List<HouseListVo> houseList = bMapSearchService.getHouseList(city, managerWebId, bMapObject);
        //获取已发(集中式)房源
        List<ApartmentListVo> apartmentList = bMapSearchService.getApartmentList(city, managerWebId, bMapObject);
        Map<String, Object> map = new HashMap<>();
        map.put("houseList", houseList);
        map.put("apartmentList", apartmentList);
        map.put("bMapObject", bMapObject);
        String houseInfo = JSON.toJSONString(map);
        response.getWriter().write(houseInfo);
        return null;
    }

    //根据商圈小区名称模糊查询房源
    @RequestMapping(value = "map/search")
    public String searchHouse(Integer managerWebId,String search, String city, HttpServletResponse response) throws Exception {
        List<House> houses = bMapSearchService.getHousesBySearch(managerWebId,search, city);
        List<Apartment> apartments = bMapSearchService.getApartmentBySearch(managerWebId,search, city);
        Map<String, Object> map = new HashMap<>();
        map.put("houses", houses);
        map.put("apartments", apartments);
        String searchHouse = JSON.toJSONString(map);
        response.getWriter().write(searchHouse);
        return null;
    }

    //条件查询房源
    @RequestMapping(value = "map/condition")
    public String getHouseByCondition(Integer userId,HouseSearchCondition houseSearchCondition, HttpServletResponse response) throws Exception {
        List<HouseListVo> houses = bMapSearchService.findHouseByCondition(userId,houseSearchCondition);
        List<ApartmentListVo> apartments = bMapSearchService.findApartmentByCondition(userId,houseSearchCondition);
        Map<String, Object> map = new HashMap<>();
        map.put("houses", houses);
        map.put("apartments", apartments);
        String searchHouse = JSON.toJSONString(map);
        response.getWriter().write(searchHouse);
        return null;
    }
}