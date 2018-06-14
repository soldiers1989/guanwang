package com.web.business.dao.volga;

import com.web.business.model.volga.ApartmentInfo;
import com.web.business.model.volga.ApartmentInfoExample;
import com.web.business.model.volga.ApartmentInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentInfoMapper {
    int countByExample(ApartmentInfoExample example);

    int deleteByExample(ApartmentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApartmentInfoWithBLOBs record);

    int insertSelective(ApartmentInfoWithBLOBs record);

    List<ApartmentInfoWithBLOBs> selectByExampleWithBLOBs(ApartmentInfoExample example);

    List<ApartmentInfo> selectByExample(ApartmentInfoExample example);

    ApartmentInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApartmentInfoWithBLOBs record, @Param("example") ApartmentInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ApartmentInfoWithBLOBs record, @Param("example") ApartmentInfoExample example);

    int updateByExample(@Param("record") ApartmentInfo record, @Param("example") ApartmentInfoExample example);

    int updateByPrimaryKeySelective(ApartmentInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ApartmentInfoWithBLOBs record);

    int updateByPrimaryKey(ApartmentInfo record);
}