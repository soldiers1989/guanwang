package com.web.business.service.website;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.business.model.caspain.HouseExample;
import com.web.business.model.volga.Apartment;
import com.web.business.model.volga.ApartmentExample;

public interface ApartmentResourceServcie {
		   
	List<Apartment> getApartmentByExample(String district, String block, Integer subwayNum, String roomType, String roomConfig,
			Integer price);
	
	List<Apartment> getApartment(String city);
}
