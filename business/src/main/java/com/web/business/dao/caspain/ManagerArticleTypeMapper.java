package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerArticleType;
import com.web.business.model.caspain.ManagerArticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerArticleTypeMapper {
    int countByExample(ManagerArticleTypeExample example);

    int deleteByExample(ManagerArticleTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerArticleType record);

    int insertSelective(ManagerArticleType record);

    List<ManagerArticleType> selectByExample(ManagerArticleTypeExample example);

    ManagerArticleType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerArticleType record, @Param("example") ManagerArticleTypeExample example);

    int updateByExample(@Param("record") ManagerArticleType record, @Param("example") ManagerArticleTypeExample example);

    int updateByPrimaryKeySelective(ManagerArticleType record);

    int updateByPrimaryKey(ManagerArticleType record);
}