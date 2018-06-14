package com.web.server.controller.website;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.IndexVO;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.cache.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.business.model.caspain.ManagerAboutus;
import com.web.business.model.caspain.ManagerHelpcenter;
import com.web.business.service.website.HelpCenterService;

@Controller
public class HelpCenterController {
    @Autowired
    private HelpCenterService helpCenterService;

    @RequestMapping(value = "{userId}/servicecenter/helpcenter", method = RequestMethod.GET)
    public String getHelpCenterInfor01(Integer id, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        List<ManagerHelpcenter> FAQList = helpCenterService.getAboutusInfor();
        model.addAttribute("FAQList", FAQList);
        System.out.println(FAQList);
        ManagerHelpcenter FAQ = helpCenterService.getAboutusById(id);
        model.addAttribute("FAQ", FAQ);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "helpcenter";
    }

    @RequestMapping(value = "{userId}/servicecenter/helpcenter/{id}", method = RequestMethod.GET)
    public String getHelpCenter01(@PathVariable("id") Integer id, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        List<ManagerHelpcenter> FAQList = helpCenterService.getAboutusInfor();
        model.addAttribute("FAQList", FAQList);
        ManagerHelpcenter FAQ = helpCenterService.getAboutusById(id);
        model.addAttribute("FAQ", FAQ);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        model.addAttribute("typeId", id);
        return "helpcenter";
    }

    //===============================正式域名访问地址================================================//

    @RequestMapping(value = "servicecenter/helpcenter", method = RequestMethod.GET)
    public String getHelpCenterInfor02(Integer id, Model model) {
        String helpcenter = getHelpCenterInfor01(id, model);
        model.addAttribute("userId", null);
        return helpcenter;
    }

    @RequestMapping(value = "servicecenter/helpcenter/{id}", method = RequestMethod.GET)
    public String getHelpCenter02(@PathVariable("id") Integer id, Model model) {
        String helpcenter = getHelpCenter01(id, model);
        model.addAttribute("userId", null);
        return helpcenter;
    }

}
