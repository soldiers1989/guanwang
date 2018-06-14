package com.web.business.dao.volga;

import com.web.business.model.volga.RoomContract;
import com.web.business.model.volga.RoomContractExample;
import com.web.business.model.volga.RoomContractWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("volgaRoomContractMapper")
public interface RoomContractMapper {
    int countByExample(RoomContractExample example);

    int deleteByExample(RoomContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomContractWithBLOBs record);

    int insertSelective(RoomContractWithBLOBs record);

    List<RoomContractWithBLOBs> selectByExampleWithBLOBs(RoomContractExample example);

    List<RoomContract> selectByExample(RoomContractExample example);

    RoomContractWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomContractWithBLOBs record, @Param("example") RoomContractExample example);

    int updateByExampleWithBLOBs(@Param("record") RoomContractWithBLOBs record, @Param("example") RoomContractExample example);

    int updateByExample(@Param("record") RoomContract record, @Param("example") RoomContractExample example);

    int updateByPrimaryKeySelective(RoomContractWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RoomContractWithBLOBs record);

    int updateByPrimaryKey(RoomContract record);
}