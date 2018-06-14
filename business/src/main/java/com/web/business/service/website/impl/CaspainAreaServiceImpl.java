package com.web.business.service.website.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.AreaMapper;
import com.web.business.model.caspain.Area;
import com.web.business.model.caspain.AreaExample;
import com.web.business.service.website.CaspainAreaService;
import com.web.common.support.DomainThreadLocal;

@Service
public class CaspainAreaServiceImpl implements CaspainAreaService{
	@Autowired
	private AreaMapper areaMapper;

	
	@Override
	public List<String> getAreaByCity(String city) {
		//根据用户ID获取城市信息
		Integer managerWebId = DomainThreadLocal.getManagerWebId();
		//根据城市获取区域、商圈信息
		AreaExample areaExample = new AreaExample();
		areaExample.setDistinct(true);
		AreaExample.Criteria criteria = areaExample.createCriteria();
		criteria.andCityEqualTo("上海");
		List<Area> areas = areaMapper.selectByExample(areaExample);
		List<String> districtList = new ArrayList<>();
		for (int i=0;i< areas.size();i++) {
			String district = areas.get(i).getDistrict();
			if(!districtList.contains(district)){
				districtList.add(district);
			}
		}
		areaExample.clear();
		return districtList;
	}


	
}
