package com.web.business.service.website;

import java.util.List;
import java.util.Map;

import com.web.business.model.api.BMapObject;
import com.web.business.model.api.HouseSearchCondition;
import org.apache.ibatis.annotations.Param;

import com.web.business.model.caspain.House;
import com.web.business.model.caspain.HouseExample;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;

public interface HouseResourceService {

	Map<String, List<String>> getBlockByDistrict(String city);

	List<HouseListVo> getHouseList(String city, Integer managerWebId);

	List<ApartmentListVo> getApartmentList(String city, Integer managerWebId);

    List<House> getHouseListByBMap(BMapObject mapObject);

	List<HouseListVo> getHouseListBySearch(Integer managerWebId, String search,String city);

	List<HouseListVo> getHouseByCondition(HouseSearchCondition houseSearchCondition);

	List<ApartmentListVo> getApartmentListBySearch(Integer managerWebId, String search, String city);

	List<ApartmentListVo> getApartmentByCondition(HouseSearchCondition houseSearchCondition);
}
