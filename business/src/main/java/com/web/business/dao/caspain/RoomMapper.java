package com.web.business.dao.caspain;

import com.web.business.model.caspain.Room;
import com.web.business.model.caspain.RoomExample;
import com.web.business.model.caspain.RoomWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("caspainRoomMapper")
public interface RoomMapper {
    int countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomWithBLOBs record);

    int insertSelective(RoomWithBLOBs record);

    List<RoomWithBLOBs> selectByExampleWithBLOBs(RoomExample example);

    List<Room> selectByExample(RoomExample example);

    RoomWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomWithBLOBs record, @Param("example") RoomExample example);

    int updateByExampleWithBLOBs(@Param("record") RoomWithBLOBs record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(RoomWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RoomWithBLOBs record);

    int updateByPrimaryKey(Room record);
}