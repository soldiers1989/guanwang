package com.web.business.service.website.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerNavigationMapper;
import com.web.business.model.caspain.ManagerNavigation;
import com.web.business.model.caspain.ManagerNavigationExample;
import com.web.business.service.website.ManagerNavigationService;

@Service
public class ManagerNavigationServiceImpl implements ManagerNavigationService {
	@Autowired
	private ManagerNavigationMapper managerNavigationMapper;

	@Override
	public int countByExample(ManagerNavigationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ManagerNavigationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ManagerNavigation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ManagerNavigation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ManagerNavigation> selectByExample(ManagerNavigationExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManagerNavigation selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ManagerNavigation record, ManagerNavigationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ManagerNavigation record, ManagerNavigationExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ManagerNavigation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ManagerNavigation record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
