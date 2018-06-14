package com.web.business.dao.caspain;

import com.web.business.model.caspain.House;
import com.web.business.model.caspain.HouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseMapper {
    int countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExampleWithBLOBs(HouseExample example);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExampleWithBLOBs(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKeyWithBLOBs(House record);

    int updateByPrimaryKey(House record);

    List<Integer> selectHouseIdByExample(HouseExample example);
}