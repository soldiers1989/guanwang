package com.web.server.controller.website;

import com.alibaba.fastjson.JSONObject;
import com.web.business.model.volga.RoomAssets;
import com.web.business.page.website.ConcentratedApartmentDetailVO;
import com.web.business.page.website.ConcentratedHouseTypeVO;
import com.web.business.page.website.IndexHomeVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.ConcentratedDetailService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.cache.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
@Controller
public class ConcentratedDetailController {

    @Autowired
    private ConcentratedDetailService concentratedDetailService;

    @RequestMapping(value = "{userId}/apartment/{id}")
    public String getDetailInfo01(@PathVariable("id") Integer apartmentId, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        //集中式公寓信息
        ConcentratedApartmentDetailVO detailVO = concentratedDetailService.findApartmentDetail(apartmentId);
        //展示房型信息
        List<ConcentratedHouseTypeVO> types = concentratedDetailService.findAllHouseTypes(apartmentId);
        //查询公寓下的配置
        RoomAssets roomAssets = concentratedDetailService.findApartmentAssets(apartmentId);
        //查询与该公寓相似的房源信息(包括集中式和分散式)
        List<IndexHomeVO> indexHomeVOS = concentratedDetailService.findSimilarlyRooms(apartmentId);

        model.addAttribute("indexVO", indexVO);
        model.addAttribute("types", types);
        model.addAttribute("detailVO", detailVO);
        model.addAttribute("assets", roomAssets);
        model.addAttribute("similarlyRooms", indexHomeVOS);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "apartment";
    }


    //===========================正式域名访问地址=========================================//

    @RequestMapping(value = "apartment/{id}")
    public String getDetailInfo02(@PathVariable("id") Integer apartmentId, Model model) {
        return getDetailInfo01(apartmentId, model);
    }
}
