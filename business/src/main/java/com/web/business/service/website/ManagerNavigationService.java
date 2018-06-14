package com.web.business.service.website;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.business.model.caspain.ManagerNavigation;
import com.web.business.model.caspain.ManagerNavigationExample;

public interface ManagerNavigationService {
	
	int countByExample(ManagerNavigationExample example);

    int deleteByExample(ManagerNavigationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManagerNavigation record);

    int insertSelective(ManagerNavigation record);

    List<ManagerNavigation> selectByExample(ManagerNavigationExample example);

    ManagerNavigation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManagerNavigation record, @Param("example") ManagerNavigationExample example);

    int updateByExample(@Param("record") ManagerNavigation record, @Param("example") ManagerNavigationExample example);

    int updateByPrimaryKeySelective(ManagerNavigation record);

    int updateByPrimaryKey(ManagerNavigation record);
}
