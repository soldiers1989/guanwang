package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerWeb;
import com.web.business.model.caspain.ManagerWebExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerWebMapper {
    int countByExample(ManagerWebExample example);

    int deleteByExample(ManagerWebExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerWeb record);

    int insertSelective(ManagerWeb record);

    List<ManagerWeb> selectByExample(ManagerWebExample example);

    ManagerWeb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerWeb record, @Param("example") ManagerWebExample example);

    int updateByExample(@Param("record") ManagerWeb record, @Param("example") ManagerWebExample example);

    int updateByPrimaryKeySelective(ManagerWeb record);

    int updateByPrimaryKey(ManagerWeb record);
}