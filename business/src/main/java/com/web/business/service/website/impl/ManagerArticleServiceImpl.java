package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerArticleMapper;
import com.web.business.dao.caspain.ManagerArticleTypeMapper;
import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerArticleExample;
import com.web.business.model.caspain.ManagerArticleType;
import com.web.business.model.caspain.ManagerArticleTypeExample;
import com.web.business.service.website.ManagerArticleService;
import com.web.common.support.DomainThreadLocal;
@Service
public class ManagerArticleServiceImpl implements ManagerArticleService {
	@Resource
	private ManagerArticleMapper managerArticleMapper;
	@Override
	public ManagerArticle getArticles(Integer articleId) {
		// TODO Auto-generated method stub
		return managerArticleMapper.selectByPrimaryKey(articleId);
	}
	//获取文章信息
	@Override
	public List<ManagerArticle> getArticlesByType(Integer articleTypeId) {
		ManagerArticleExample managerArticleExample = new ManagerArticleExample();
		managerArticleExample.setDistinct(true);
		managerArticleExample.setLimitStart(0);
		managerArticleExample.setPageSize(5);
		ManagerArticleExample.Criteria criteria = managerArticleExample.createCriteria();
		if(articleTypeId!=null) {
			criteria.andArticleTypeIdEqualTo(articleTypeId);
		}
		List<ManagerArticle> Articles = managerArticleMapper.selectByExample(managerArticleExample);
		managerArticleExample.clear();
		return Articles;
	}
	@Override
	public ManagerArticle getArticlesContent(Integer id) {
		ManagerArticle articlesContent = managerArticleMapper.selectByPrimaryKey(id);
		return articlesContent;
	}
	
}
