package com.web.business.dao.caspain;

import com.web.business.model.caspain.ManagerModel;
import com.web.business.model.caspain.ManagerModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerModelMapper {
    int countByExample(ManagerModelExample example);

    int deleteByExample(ManagerModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerModel record);

    int insertSelective(ManagerModel record);

    List<ManagerModel> selectByExample(ManagerModelExample example);

    ManagerModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerModel record, @Param("example") ManagerModelExample example);

    int updateByExample(@Param("record") ManagerModel record, @Param("example") ManagerModelExample example);

    int updateByPrimaryKeySelective(ManagerModel record);

    int updateByPrimaryKey(ManagerModel record);
}