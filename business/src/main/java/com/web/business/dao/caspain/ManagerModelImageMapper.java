package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerModelImage;
import com.web.business.model.caspain.ManagerModelImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerModelImageMapper {
    int countByExample(ManagerModelImageExample example);

    int deleteByExample(ManagerModelImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerModelImage record);

    int insertSelective(ManagerModelImage record);

    List<ManagerModelImage> selectByExample(ManagerModelImageExample example);

    ManagerModelImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerModelImage record, @Param("example") ManagerModelImageExample example);

    int updateByExample(@Param("record") ManagerModelImage record, @Param("example") ManagerModelImageExample example);

    int updateByPrimaryKeySelective(ManagerModelImage record);

    int updateByPrimaryKey(ManagerModelImage record);
}