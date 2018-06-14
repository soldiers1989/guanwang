package com.web.business.dao.caspain;

import com.web.business.model.caspain.CustomerRes;
import com.web.business.model.caspain.CustomerResExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerResMapper {
    int countByExample(CustomerResExample example);

    int deleteByExample(CustomerResExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerRes record);

    int insertSelective(CustomerRes record);

    List<CustomerRes> selectByExampleWithBLOBs(CustomerResExample example);

    List<CustomerRes> selectByExample(CustomerResExample example);

    CustomerRes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerRes record, @Param("example") CustomerResExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomerRes record, @Param("example") CustomerResExample example);

    int updateByExample(@Param("record") CustomerRes record, @Param("example") CustomerResExample example);

    int updateByPrimaryKeySelective(CustomerRes record);

    int updateByPrimaryKeyWithBLOBs(CustomerRes record);

    int updateByPrimaryKey(CustomerRes record);
}