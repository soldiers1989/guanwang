package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerArticleMapper {
    int countByExample(ManagerArticleExample example);

    int deleteByExample(ManagerArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerArticle record);

    int insertSelective(ManagerArticle record);

    List<ManagerArticle> selectByExampleWithBLOBs(ManagerArticleExample example);

    List<ManagerArticle> selectByExample(ManagerArticleExample example);

    ManagerArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerArticle record, @Param("example") ManagerArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") ManagerArticle record, @Param("example") ManagerArticleExample example);

    int updateByExample(@Param("record") ManagerArticle record, @Param("example") ManagerArticleExample example);

    int updateByPrimaryKeySelective(ManagerArticle record);

    int updateByPrimaryKeyWithBLOBs(ManagerArticle record);

    int updateByPrimaryKey(ManagerArticle record);
}