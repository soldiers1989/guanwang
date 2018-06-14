package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerModelHomesource;
import com.web.business.model.caspain.ManagerModelHomesourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerModelHomesourceMapper {
    int countByExample(ManagerModelHomesourceExample example);

    int deleteByExample(ManagerModelHomesourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerModelHomesource record);

    int insertSelective(ManagerModelHomesource record);

    List<ManagerModelHomesource> selectByExample(ManagerModelHomesourceExample example);

    ManagerModelHomesource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerModelHomesource record, @Param("example") ManagerModelHomesourceExample example);

    int updateByExample(@Param("record") ManagerModelHomesource record, @Param("example") ManagerModelHomesourceExample example);

    int updateByPrimaryKeySelective(ManagerModelHomesource record);

    int updateByPrimaryKey(ManagerModelHomesource record);
}