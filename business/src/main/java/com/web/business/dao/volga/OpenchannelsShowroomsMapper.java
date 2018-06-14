package com.web.business.dao.volga;

import com.web.business.model.volga.OpenchannelsShowrooms;
import com.web.business.model.volga.OpenchannelsShowroomsExample;
import com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("volgaOpenchannelsShowroomsMapper")
public interface OpenchannelsShowroomsMapper {
    int countByExample(OpenchannelsShowroomsExample example);

    int deleteByExample(OpenchannelsShowroomsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenchannelsShowroomsWithBLOBs record);

    int insertSelective(OpenchannelsShowroomsWithBLOBs record);

    List<OpenchannelsShowroomsWithBLOBs> selectByExampleWithBLOBs(OpenchannelsShowroomsExample example);

    List<OpenchannelsShowrooms> selectByExample(OpenchannelsShowroomsExample example);

    OpenchannelsShowroomsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenchannelsShowroomsWithBLOBs record, @Param("example") OpenchannelsShowroomsExample example);

    int updateByExampleWithBLOBs(@Param("record") OpenchannelsShowroomsWithBLOBs record, @Param("example") OpenchannelsShowroomsExample example);

    int updateByExample(@Param("record") OpenchannelsShowrooms record, @Param("example") OpenchannelsShowroomsExample example);

    int updateByPrimaryKeySelective(OpenchannelsShowroomsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OpenchannelsShowroomsWithBLOBs record);

    int updateByPrimaryKey(OpenchannelsShowrooms record);
}