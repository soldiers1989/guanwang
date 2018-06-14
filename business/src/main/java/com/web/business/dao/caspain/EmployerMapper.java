package com.web.business.dao.caspain;

import com.web.business.model.caspain.Employer;
import com.web.business.model.caspain.EmployerExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerMapper {
    int countByExample(EmployerExample example);

    int deleteByExample(EmployerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employer record);

    int insertSelective(Employer record);

    List<Employer> selectByExample(EmployerExample example);

    Employer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByExample(@Param("record") Employer record, @Param("example") EmployerExample example);

    int updateByPrimaryKeySelective(Employer record);

    int updateByPrimaryKey(Employer record);

    List<Integer> selectUserIdsByExample(EmployerExample example);

}