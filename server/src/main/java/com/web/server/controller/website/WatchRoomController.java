package com.web.server.controller.website;

import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.IndexVO;
import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.business.service.website.WatchRoomServie;
import com.web.common.support.DomainThreadLocal;
import com.web.common.support.ResponseBodyVO;
import com.web.common.utils.cache.CacheUtils;
import com.web.common.utils.sms.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Set;

/**
 * @author Sky
 * create 2018/06/07
 * email sky.li@ixiaoshuidi.com
 **/
@Controller
public class WatchRoomController {

    @Value("${sms.baseUrl}")
    private String smsUrl;

    @Autowired
    private WatchRoomServie watchRoomServie;

    //===============================正式域名访问地址================================================//

    //分散式预约看房页面跳转
    @RequestMapping(value = "watchroom/disperse", method = RequestMethod.GET)
    public String getWatchRoom01(@RequestParam("id") Integer roomId, Model model) {
        model.addAttribute("roomId", roomId);
        model.addAttribute("userId", null);
        return "watchroom";
    }

    //集中式预约看房页面跳转
    @RequestMapping(value = "watchroom/concentrate", method = RequestMethod.GET)
    public String getWatchRoom02(HttpServletRequest request, Model model) {
        String apartmentName = request.getParameter("apartment");
        String storeName = request.getParameter("store");
        String layoutName = request.getParameter("layout");
        String layoutId = request.getParameter("id");
        String comment = new StringBuilder().append("客户预约了【").append(apartmentName).append("-")
                .append(storeName).append("】").append("的").append("【").append(layoutName).append("】看房").toString();
        model.addAttribute("roomId", Integer.valueOf(layoutId));
        model.addAttribute("comment", comment);
        return "watchroom";
    }

    @RequestMapping(value = "watchroom/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseBodyVO watchRoomSubmit(WatchRoomSubmitVO submitVO) {
        String phone = submitVO.getPhone();
        String code = submitVO.getCode();
        //验证验证码是否有效
        boolean bool = SmsUtil.validateCode(smsUrl, phone, code);
        if (!bool) {
            ResponseBodyVO result = new ResponseBodyVO(-1, null, "验证码已失效,提交失败");
            return result;
        }
//        增加预约记录(分散式，集中式)
        System.out.println(submitVO.getComment());
        ResponseBodyVO result = watchRoomServie.sendOrdersInfo(submitVO);
        return result;
    }
}
