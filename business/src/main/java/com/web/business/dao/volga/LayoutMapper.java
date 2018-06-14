package com.web.business.dao.volga;

import com.web.business.model.volga.Layout;
import com.web.business.model.volga.LayoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LayoutMapper {
    int countByExample(LayoutExample example);

    int deleteByExample(LayoutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Layout record);

    int insertSelective(Layout record);

    List<Layout> selectByExampleWithBLOBs(LayoutExample example);

    List<Layout> selectByExample(LayoutExample example);

    Layout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Layout record, @Param("example") LayoutExample example);

    int updateByExampleWithBLOBs(@Param("record") Layout record, @Param("example") LayoutExample example);

    int updateByExample(@Param("record") Layout record, @Param("example") LayoutExample example);

    int updateByPrimaryKeySelective(Layout record);

    int updateByPrimaryKeyWithBLOBs(Layout record);

    int updateByPrimaryKey(Layout record);
}