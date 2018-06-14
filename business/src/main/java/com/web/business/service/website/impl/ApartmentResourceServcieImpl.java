package com.web.business.service.website.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.model.caspain.House;
import com.web.business.model.caspain.HouseExample;
import com.web.business.model.volga.Apartment;
import com.web.business.model.volga.ApartmentExample;
import com.web.business.service.website.ApartmentResourceServcie;
import com.web.common.support.DomainThreadLocal;

@Service
public class ApartmentResourceServcieImpl implements ApartmentResourceServcie {
	@Autowired
	private ApartmentMapper apartmentMapper;

	@Override
	public List<Apartment> getApartmentByExample(String district, String block, Integer subwayNum, String roomType,
			String roomConfig, Integer price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apartment> getApartment(String city) {
		ApartmentExample apartmentExample = new ApartmentExample();
		city = "上海";
		apartmentExample.setDistinct(true);
		apartmentExample.setLimitStart(0);
		apartmentExample.setPageSize(5);
		ApartmentExample.Criteria criteria = apartmentExample.createCriteria();
		criteria.andCreatedByEqualTo(DomainThreadLocal.getManagerWebId());
		criteria.andCityEqualTo(city);
		List<Apartment> apartments = apartmentMapper.selectByExample(apartmentExample);
		apartmentExample.clear();
		return apartments;
	}

	
	
}
