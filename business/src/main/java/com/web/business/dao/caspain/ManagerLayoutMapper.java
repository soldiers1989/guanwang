package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerLayout;
import com.web.business.model.caspain.ManagerLayoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerLayoutMapper {
    int countByExample(ManagerLayoutExample example);

    int deleteByExample(ManagerLayoutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerLayout record);

    int insertSelective(ManagerLayout record);

    List<ManagerLayout> selectByExampleWithBLOBs(ManagerLayoutExample example);

    List<ManagerLayout> selectByExample(ManagerLayoutExample example);

    ManagerLayout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerLayout record, @Param("example") ManagerLayoutExample example);

    int updateByExampleWithBLOBs(@Param("record") ManagerLayout record, @Param("example") ManagerLayoutExample example);

    int updateByExample(@Param("record") ManagerLayout record, @Param("example") ManagerLayoutExample example);

    int updateByPrimaryKeySelective(ManagerLayout record);

    int updateByPrimaryKeyWithBLOBs(ManagerLayout record);

    int updateByPrimaryKey(ManagerLayout record);
}