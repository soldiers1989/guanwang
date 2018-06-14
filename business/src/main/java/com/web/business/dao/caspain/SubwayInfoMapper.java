package com.web.business.dao.caspain;

import com.web.business.model.api.SubwayStationVo;
import com.web.business.model.caspain.SubwayInfo;
import com.web.business.model.caspain.SubwayInfoExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SubwayInfoMapper {
    int countByExample(SubwayInfoExample example);

    int deleteByExample(SubwayInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubwayInfo record);

    int insertSelective(SubwayInfo record);

    List<SubwayInfo> selectByExample(SubwayInfoExample example);

    SubwayInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubwayInfo record, @Param("example") SubwayInfoExample example);

    int updateByExample(@Param("record") SubwayInfo record, @Param("example") SubwayInfoExample example);

    int updateByPrimaryKeySelective(SubwayInfo record);

    int updateByPrimaryKey(SubwayInfo record);

    ArrayList<SubwayStationVo> getSubwayStationsByLines(@Param("city") String city, @Param("subwayLine") String subwayLine);
}