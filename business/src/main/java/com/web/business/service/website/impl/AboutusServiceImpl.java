package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerAboutusMapper;
import com.web.business.model.caspain.ManagerAboutus;
import com.web.business.model.caspain.ManagerAboutusExample;
import com.web.business.service.website.AboutusService;
import com.web.common.support.DomainThreadLocal;
@Service
public class AboutusServiceImpl implements AboutusService {
	@Resource
	private ManagerAboutusMapper managerAboutusMapper;
	
	ManagerAboutusExample aboutusExample = new ManagerAboutusExample();
	@Override
	public List<ManagerAboutus> getAboutusInfor() {
		Integer managerWebId = DomainThreadLocal.getManagerWebId();
		aboutusExample.setDistinct(true);
		aboutusExample.setOrderByClause("aboutus_sort");
		ManagerAboutusExample.Criteria criteria = aboutusExample.createCriteria();
		criteria.andManagerWebIdEqualTo(managerWebId);
		List<ManagerAboutus> aboutusList = managerAboutusMapper.selectByExample(aboutusExample);
		aboutusExample.clear();
		// TODO Auto-generated method stub
		return aboutusList;
	}
	@Override
	public ManagerAboutus getAboutusById(Integer id) {
		ManagerAboutus aboutus = managerAboutusMapper.selectByPrimaryKey(id);
		return aboutus;
	}
	
}
