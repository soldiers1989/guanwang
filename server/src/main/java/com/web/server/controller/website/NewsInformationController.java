package com.web.server.controller.website;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.IndexVO;
import com.web.common.utils.cache.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerArticleType;
import com.web.business.service.website.ManagerArticleService;
import com.web.business.service.website.ManagerArticleTypeService;
import com.web.common.support.DomainThreadLocal;

@Controller
public class NewsInformationController {
    @Autowired
    private ManagerArticleService managerArticleService;
    @Autowired
    private ManagerArticleTypeService managerArticleTypeService;

    @RequestMapping(value = "{userId}/news/article", method = RequestMethod.GET)
    public String getManagerArticleType01(Integer articleTypeId, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        //获取文章的类型
        List<ManagerArticleType> managerArticleTypes = managerArticleTypeService.getArticlesType();
        model.addAttribute("articleTypes", managerArticleTypes);
        List<ManagerArticle> articles = managerArticleService.getArticlesByType(articleTypeId);
        System.out.println(articles);
        model.addAttribute("articles", articles);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "newsinfor";
    }

    @RequestMapping(value = "{userId}/news/articlelist/{articleTypeId}", method = RequestMethod.GET)
    public String getManagerArticle01(@PathVariable("articleTypeId") Integer articleTypeId, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        //获取文章的类型
        List<ManagerArticleType> managerArticleTypes = managerArticleTypeService.getArticlesType();
        model.addAttribute("articleTypes", managerArticleTypes);
        //获取文章
        List<ManagerArticle> articles = managerArticleService.getArticlesByType(articleTypeId);
        System.out.println(articles);
        model.addAttribute("articles", articles);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        model.addAttribute("typeId", articleTypeId);
        return "newsinfor";
    }

    @RequestMapping(value = "{userId}/news/articleinfor/{id}", method = RequestMethod.GET)
    public String getArticleInfor01(@PathVariable("id") Integer id, Model model) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        //获取头和尾的信息
        String result = CacheUtils.getStr("managerWebIndexVO" + managerWebId);
        IndexVO indexVO = JSONObject.parseObject(result, IndexVO.class);
        ManagerArticle article = managerArticleService.getArticlesContent(id);
        Integer articleTypeId = article.getArticleTypeId();
        ManagerArticleType articleType = managerArticleTypeService.getArticleTypeById(articleTypeId);
        model.addAttribute("article", article);
        model.addAttribute("indexVO", indexVO);
        model.addAttribute("articleTypeId", articleTypeId);
        model.addAttribute("articleTypeName", articleType.getTypeName());
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
        return "articleinfor";
    }

    //================================正式域名访问地址===============================================//

    @RequestMapping(value = "news/article", method = RequestMethod.GET)
    public String getManagerArticleType02(Integer articleTypeId, Model model) {
        String newsinfor = getManagerArticleType01(articleTypeId, model);
        model.addAttribute("userId", null);
        return newsinfor;
    }


    @RequestMapping(value = "news/articlelist/{articleTypeId}", method = RequestMethod.GET)
    public String getManagerArticle02(@PathVariable("articleTypeId") Integer articleTypeId, Model model) {
        String newsinfor = getManagerArticle01(articleTypeId, model);
        model.addAttribute("userId", null);
        return newsinfor;
    }


    @RequestMapping(value = "news/articleinfor/{id}", method = RequestMethod.GET)
    public String getArticleInfor02(@PathVariable("id") Integer id, Model model) {
        String articleinfor = getArticleInfor01(id, model);
        model.addAttribute("userId", null);
        return articleinfor;
    }
}
