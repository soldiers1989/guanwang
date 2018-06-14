package com.web.business.dao.caspain;

import com.web.business.model.caspain.RoomAssets;
import com.web.business.model.caspain.RoomAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("caspainRoomAssetsMapper")
public interface RoomAssetsMapper {
    int countByExample(RoomAssetsExample example);

    int deleteByExample(RoomAssetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomAssets record);

    int insertSelective(RoomAssets record);

    List<RoomAssets> selectByExample(RoomAssetsExample example);

    RoomAssets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomAssets record, @Param("example") RoomAssetsExample example);

    int updateByExample(@Param("record") RoomAssets record, @Param("example") RoomAssetsExample example);

    int updateByPrimaryKeySelective(RoomAssets record);

    int updateByPrimaryKey(RoomAssets record);
}