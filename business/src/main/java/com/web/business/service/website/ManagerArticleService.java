package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerArticleType;

public interface ManagerArticleService {

	ManagerArticle getArticles(Integer articleId);
	List<ManagerArticle> getArticlesByType(Integer articleTypeId);
	ManagerArticle getArticlesContent(Integer id);
}
