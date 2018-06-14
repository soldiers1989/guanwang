package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerArticleTypeMapper;
import com.web.business.model.caspain.ManagerArticleType;
import com.web.business.model.caspain.ManagerArticleTypeExample;
import com.web.business.service.website.ManagerArticleTypeService;
import com.web.common.support.DomainThreadLocal;

@Service
public class ManagerArticleTypeServiceImpl implements ManagerArticleTypeService {
    @Resource
    private ManagerArticleTypeMapper managerArticleTypeMapper;

    //获取当前用户下的所有文章分类
    @Override
    public List<ManagerArticleType> getArticlesType() {
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        ManagerArticleTypeExample articleTypeExample = new ManagerArticleTypeExample();
        articleTypeExample.setDistinct(true);
        ManagerArticleTypeExample.Criteria criteria = articleTypeExample.createCriteria();
        criteria.andManagerWebIdEqualTo(managerWebId);
        List<ManagerArticleType> articleTypes = managerArticleTypeMapper.selectByExample(articleTypeExample);
        articleTypeExample.clear();
        return articleTypes;
    }

    @Override
    public ManagerArticleType getArticleTypeById(Integer id) {
        ManagerArticleType managerArticleType = managerArticleTypeMapper.selectByPrimaryKey(id);
        return managerArticleType;
    }
}
