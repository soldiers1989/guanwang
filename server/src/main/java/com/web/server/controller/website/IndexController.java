package com.web.server.controller.website;

import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.IndexManagerModelVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.IndexService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.cache.CacheUtils;
import com.web.common.utils.cache.enums.ExpireTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;


    @RequestMapping(value = "/{userId}/index", method = RequestMethod.GET)
    public String getIndex01(Model model, @RequestParam(value = "city", required = false) String city) {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        IndexVO indexVO = new IndexVO();
        IndexVO headIndexVO = indexService.findHeadIndexVO(city, indexVO, managerWebId);
        String currentCity = headIndexVO.getCities().iterator().next();
        IndexVO middleIndexVO = indexService.findMiddleIndexVO(currentCity, indexVO, managerWebId);
        IndexVO tailIndexVO = indexService.findTailIndexVO(indexVO, managerWebId);
        model.addAttribute("indexVO", indexVO);
        List<IndexManagerModelVO> managerModelVOs = middleIndexVO.getManagerModelVOs();
        for (int i = 0; i < managerModelVOs.size(); i++) {
            model.addAttribute("model" + i, managerModelVOs.get(i));
        }
        CacheUtils.set("managerWebIndexVO" + managerWebId, JSONObject.toJSONString(indexVO), ExpireTime.ONE_DAY);
        model.addAttribute("userId", "/" + indexVO.getManagerWeb().getCreateById());
//        System.out.println(indexVO.toString());
        return "index";
    }

    //===========================正式域名访问地址=========================================//

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex02(Model model, @RequestParam(value = "city", required = false) String city, HttpServletRequest request) {
        String index = getIndex01(model, city);
        model.addAttribute("userId", null);
        return index;
    }

}
