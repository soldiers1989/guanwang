package com.web.server.controller.website;

import com.alibaba.fastjson.JSONObject;
import com.web.business.model.caspain.RoomAssets;
import com.web.business.page.website.DispersedRoomDetailVO;
import com.web.business.page.website.DispersedRoomieDetailVO;
import com.web.business.page.website.IndexHomeVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.DispersedDetailService;
import com.web.business.service.website.IndexService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.BaiDuMap.BaiDuMapUtils;
import com.web.common.utils.cache.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
@Controller
public class DispersedDetailController {
    @Autowired
    private DispersedDetailService dispersedDetailService;
    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "{userId}/room/{id}", method = RequestMethod.GET)
    public String getDetailInfo01(@PathVariable("id") Integer roomId, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        //获取房间具体信息
        DispersedRoomDetailVO dispersedRoomDetailVO = dispersedDetailService.findDetailInfoByRoomId(roomId);
        //查询房间具体配置
        RoomAssets roomAssets = dispersedDetailService.findRoomPlanning(roomId);
        //查询室友情况
        List<DispersedRoomieDetailVO> roomies = dispersedDetailService.findRoomieDetail(roomId);
        //查询相似房源
        List<IndexHomeVO> similarlyRooms = dispersedDetailService.findSimilarlyRooms(roomId);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("dispersedRoomDetailVO", dispersedRoomDetailVO);
        model.addAttribute("roomAssets", roomAssets);
        model.addAttribute("roomies", roomies);
        model.addAttribute("similarlyRooms", similarlyRooms);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "rooms";
    }


    //===========================正式域名访问地址=========================================//

    @RequestMapping(value = "room/{id}", method = RequestMethod.GET)
    public String getDetailInfo02(@PathVariable("id") Integer roomId, Model model) {
        String rooms = getDetailInfo01(roomId, model);
        model.addAttribute("userId", null);
        return rooms;
    }



}
