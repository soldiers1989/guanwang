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
import com.web.business.service.website.AboutusService;

@Controller
public class AboutUsController {
    @Autowired
    private AboutusService aboutusService;

    @RequestMapping(value = "{userId}/servicecenter/aboutus", method = RequestMethod.GET)
    public String getAboutUsInfor01(Integer id, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        List<ManagerAboutus> aboutusList = aboutusService.getAboutusInfor();
        model.addAttribute("aboutusList", aboutusList);
        ManagerAboutus aboutus = aboutusService.getAboutusById(id);
        model.addAttribute("aboutus", aboutus);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "aboutus";
    }

    @RequestMapping(value = "{userId}/servicecenter/aboutus/{id}", method = RequestMethod.GET)
    public String getAboutUs01(@PathVariable("id") Integer id, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        List<ManagerAboutus> aboutusList = aboutusService.getAboutusInfor();
        model.addAttribute("aboutusList", aboutusList);
        ManagerAboutus aboutus = aboutusService.getAboutusById(id);
        model.addAttribute("aboutus", aboutus);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        model.addAttribute("typeId", id);
        return "aboutus";
    }


    //===============================正式域名访问地址================================================//

    @RequestMapping(value = "servicecenter/aboutus", method = RequestMethod.GET)
    public String getAboutUsInfor02(Integer id, Model model) {
        String aboutus = getAboutUsInfor01(id, model);
        model.addAttribute("userId", null);
        return aboutus;
    }

    @RequestMapping(value = "servicecenter/aboutus/{id}", method = RequestMethod.GET)
    public String getAboutUs02(@PathVariable("id") Integer id, Model model) {
        String aboutus = getAboutUs01(id, model);
        model.addAttribute("userId", null);
        return aboutus;
    }


}
