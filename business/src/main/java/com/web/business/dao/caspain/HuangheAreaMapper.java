package com.web.business.dao.caspain;

import com.web.business.model.caspain.HuangheArea;
import com.web.business.model.caspain.HuangheAreaExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HuangheAreaMapper {
    int countByExample(HuangheAreaExample example);

    int deleteByExample(HuangheAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HuangheArea record);

    int insertSelective(HuangheArea record);

    List<HuangheArea> selectByExample(HuangheAreaExample example);

    HuangheArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HuangheArea record, @Param("example") HuangheAreaExample example);

    int updateByExample(@Param("record") HuangheArea record, @Param("example") HuangheAreaExample example);

    int updateByPrimaryKeySelective(HuangheArea record);

    int updateByPrimaryKey(HuangheArea record);

    List<String> selectByDistrict(@Param("city") String city, @Param("district") String district);
}