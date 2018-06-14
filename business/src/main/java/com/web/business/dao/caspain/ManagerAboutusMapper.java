package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerAboutus;
import com.web.business.model.caspain.ManagerAboutusExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerAboutusMapper {
    int countByExample(ManagerAboutusExample example);

    int deleteByExample(ManagerAboutusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerAboutus record);

    int insertSelective(ManagerAboutus record);

    List<ManagerAboutus> selectByExampleWithBLOBs(ManagerAboutusExample example);

    List<ManagerAboutus> selectByExample(ManagerAboutusExample example);

    ManagerAboutus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerAboutus record, @Param("example") ManagerAboutusExample example);

    int updateByExampleWithBLOBs(@Param("record") ManagerAboutus record, @Param("example") ManagerAboutusExample example);

    int updateByExample(@Param("record") ManagerAboutus record, @Param("example") ManagerAboutusExample example);

    int updateByPrimaryKeySelective(ManagerAboutus record);

    int updateByPrimaryKeyWithBLOBs(ManagerAboutus record);

    int updateByPrimaryKey(ManagerAboutus record);
}