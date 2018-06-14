package com.web.server.controller.website;

import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.EntrustRoomSubmitVO;
import com.web.business.page.website.IndexVO;
import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.business.service.website.EntrustRoomService;
import com.web.common.support.ResponseBodyVO;
import com.web.common.utils.cache.CacheUtils;
import com.web.common.utils.sms.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Sky
 * create 2018/06/10
 * email sky.li@ixiaoshuidi.com
 **/
//委托找房
@Controller
public class EntrustRoomController {

    @Value("${sms.baseUrl}")
    private String smsUrl;

    @Autowired
    private EntrustRoomService entrustRoomService;


    //===============================正式域名访问地址================================================//

    //委托找房页面跳转
    @RequestMapping(value = "entrustroom", method = RequestMethod.GET)
    public String getEntrustRoom(@RequestParam("id") String id, Model model) {
        String result = CacheUtils.getStr("managerWebIndexVO" + id);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        LinkedHashSet<String> cityArray = indexVO.getCities();
        Iterator<String> cityIterator = cityArray.iterator();
        String cities = "";
        int maxSize = cityArray.size();
        int count = 0;
        while (cityIterator.hasNext()) {
            if (count < maxSize - 1) {
                cities += cityIterator.next() + ",";
            } else {
                cities += cityIterator.next();
            }
            count++;
        }
        System.out.println(cities);
        model.addAttribute("cities", cities);
        model.addAttribute("userId", indexVO.getManagerWeb().getCreateById());
        return "entrustroom";
    }

    //根据城市查询当前区域
    @RequestMapping(value = "entrustroom/districts", method = RequestMethod.GET)
    @ResponseBody
    public String getDistricts(@RequestParam("city") String city, @RequestParam("userId") Integer userId, Model model) {
        String districts = entrustRoomService.getDistrictsByCity(city, userId);
        return districts;
    }

    //委托看房提交
    @RequestMapping(value = "entrustroom/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseBodyVO entrustRoomSubmit(EntrustRoomSubmitVO submitVO) {
        String phone = submitVO.getPhone();
        String code = submitVO.getCode();
        //验证验证码是否有效
//        boolean bool = SmsUtil.validateCode(smsUrl, phone, code);
//        if (!bool) {
//            ResponseBodyVO result = new ResponseBodyVO(-1, null, "验证码已失效,提交失败");
//            return result;
//        }
        ResponseBodyVO responseBodyVO = entrustRoomService.sendEntrustInfo(submitVO);
        return responseBodyVO;
    }


}
