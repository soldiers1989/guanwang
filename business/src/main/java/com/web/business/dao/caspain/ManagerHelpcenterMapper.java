package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerHelpcenter;
import com.web.business.model.caspain.ManagerHelpcenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerHelpcenterMapper {
    int countByExample(ManagerHelpcenterExample example);

    int deleteByExample(ManagerHelpcenterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerHelpcenter record);

    int insertSelective(ManagerHelpcenter record);

    List<ManagerHelpcenter> selectByExampleWithBLOBs(ManagerHelpcenterExample example);

    List<ManagerHelpcenter> selectByExample(ManagerHelpcenterExample example);

    ManagerHelpcenter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerHelpcenter record, @Param("example") ManagerHelpcenterExample example);

    int updateByExampleWithBLOBs(@Param("record") ManagerHelpcenter record, @Param("example") ManagerHelpcenterExample example);

    int updateByExample(@Param("record") ManagerHelpcenter record, @Param("example") ManagerHelpcenterExample example);

    int updateByPrimaryKeySelective(ManagerHelpcenter record);

    int updateByPrimaryKeyWithBLOBs(ManagerHelpcenter record);

    int updateByPrimaryKey(ManagerHelpcenter record);
}