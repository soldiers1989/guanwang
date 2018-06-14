package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerHelpcenterMapper;
import com.web.business.model.caspain.ManagerAboutus;
import com.web.business.model.caspain.ManagerAboutusExample;
import com.web.business.model.caspain.ManagerHelpcenter;
import com.web.business.model.caspain.ManagerHelpcenterExample;
import com.web.business.service.website.HelpCenterService;
import com.web.common.support.DomainThreadLocal;
@Service
public class HelpCenterServiceImpl implements HelpCenterService {
	@Resource
	private ManagerHelpcenterMapper managerHelpcenterMapper;
	ManagerHelpcenterExample managerHelpcenterExample = new ManagerHelpcenterExample();
	@Override
	public List<ManagerHelpcenter> getAboutusInfor() {
		Integer managerWebId = DomainThreadLocal.getManagerWebId();
		managerHelpcenterExample.setDistinct(true);
		managerHelpcenterExample.setOrderByClause("aboutus_sort");
		ManagerHelpcenterExample.Criteria criteria = managerHelpcenterExample.createCriteria();
		criteria.andManagerWebIdEqualTo(managerWebId);
		List<ManagerHelpcenter> FAQList = managerHelpcenterMapper.selectByExample(managerHelpcenterExample);
		managerHelpcenterExample.clear();
		// TODO Auto-generated method stub
		return FAQList;
	}

	@Override
	public ManagerHelpcenter getAboutusById(Integer id) {
		ManagerHelpcenter FAQ = managerHelpcenterMapper.selectByPrimaryKey(id);
		return FAQ;
	}
	
}
