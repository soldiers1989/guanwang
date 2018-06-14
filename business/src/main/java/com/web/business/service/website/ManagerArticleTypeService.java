package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerArticleType;

public interface ManagerArticleTypeService {

    List<ManagerArticleType> getArticlesType();

    /**
     * 根据文章类别id查询文章类别;
     */
    ManagerArticleType getArticleTypeById(Integer id);
}
