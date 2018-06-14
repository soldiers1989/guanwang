package com.web.business.dao.caspain;

import com.web.business.model.caspain.HuangheDistrict;
import com.web.business.model.caspain.HuangheDistrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HuangheDistrictMapper {
    int countByExample(HuangheDistrictExample example);

    int deleteByExample(HuangheDistrictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HuangheDistrict record);

    int insertSelective(HuangheDistrict record);

    List<HuangheDistrict> selectByExample(HuangheDistrictExample example);

    HuangheDistrict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HuangheDistrict record, @Param("example") HuangheDistrictExample example);

    int updateByExample(@Param("record") HuangheDistrict record, @Param("example") HuangheDistrictExample example);

    int updateByPrimaryKeySelective(HuangheDistrict record);

    int updateByPrimaryKey(HuangheDistrict record);
}