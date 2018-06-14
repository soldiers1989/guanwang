package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerModelArticle;
import com.web.business.model.caspain.ManagerModelArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerModelArticleMapper {
    int countByExample(ManagerModelArticleExample example);

    int deleteByExample(ManagerModelArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerModelArticle record);

    int insertSelective(ManagerModelArticle record);

    List<ManagerModelArticle> selectByExample(ManagerModelArticleExample example);

    ManagerModelArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerModelArticle record, @Param("example") ManagerModelArticleExample example);

    int updateByExample(@Param("record") ManagerModelArticle record, @Param("example") ManagerModelArticleExample example);

    int updateByPrimaryKeySelective(ManagerModelArticle record);

    int updateByPrimaryKey(ManagerModelArticle record);
}