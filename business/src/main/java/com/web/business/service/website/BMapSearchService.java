package com.web.business.service.website;

import com.web.business.model.api.BMapObject;
import com.web.business.model.api.HouseSearchCondition;
import com.web.business.model.caspain.House;
import com.web.business.model.volga.Apartment;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;

import java.util.List;
import java.util.Map;

public interface BMapSearchService {
    Map<String,Object> getDistrictByCity(Integer managerWebId,String city,BMapObject bMapObject);

    Map<String,Object> getBlockByDistrict(Integer managerWebId,String city,String district,BMapObject bMapObject);

    List<HouseListVo> getHouseList(String city, Integer managerWebId, BMapObject bMapObject);

    List<ApartmentListVo> getApartmentList(String city, Integer managerWebId, BMapObject bMapObject);

    List<House> getHousesBySearch(Integer userId,String search, String city);

    List<Apartment> getApartmentBySearch(Integer userId,String search, String city);

    List<HouseListVo> findHouseByCondition(Integer userId,HouseSearchCondition houseSearchCondition);

    List<ApartmentListVo> findApartmentByCondition(Integer userId,HouseSearchCondition houseSearchCondition);
}
