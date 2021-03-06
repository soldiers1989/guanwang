package com.web.business.dao.caspain;

import com.web.business.model.caspain.RoomPictures;
import com.web.business.model.caspain.RoomPicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("caspainRoomPicturesMapper")
public interface RoomPicturesMapper {
    int countByExample(RoomPicturesExample example);

    int deleteByExample(RoomPicturesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomPictures record);

    int insertSelective(RoomPictures record);

    List<RoomPictures> selectByExample(RoomPicturesExample example);

    RoomPictures selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomPictures record, @Param("example") RoomPicturesExample example);

    int updateByExample(@Param("record") RoomPictures record, @Param("example") RoomPicturesExample example);

    int updateByPrimaryKeySelective(RoomPictures record);

    int updateByPrimaryKey(RoomPictures record);
}