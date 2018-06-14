package com.web.business.service.website.impl;

import java.util.*;

import javax.annotation.Resource;

import com.web.business.dao.caspain.*;
import com.web.business.model.api.BMapObject;
import com.web.business.model.api.HouseSearchCondition;
import com.web.business.model.caspain.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.volga.ApartmentInfoMapper;
import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.dao.volga.FloorMapper;
import com.web.business.enums.RoomTowardEnum;
import com.web.business.model.volga.Apartment;
import com.web.business.model.volga.ApartmentInfo;
import com.web.business.model.volga.ApartmentInfoExample;
import com.web.business.model.volga.Floor;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.HouseResourceService;
import com.web.common.support.DomainThreadLocal;

@Service
public class HouseResourceServiceImpl implements HouseResourceService {

    @Autowired
    private HouseMapper houseMapper;
    @Autowired
    private AreaMapper areaMapper;
    @Resource
    private UserProfileMapper userProfileMapper;
    @Resource
    private EmployerMapper employerMapper;
    @Resource(name = "caspainRoomMapper")
    private RoomMapper caspainRoomMapper;
    @Resource(name = "caspainOpenchannelsShowroomsMapper")
    private OpenchannelsShowroomsMapper caspainOpenchannelsShowroomsMapper;
    @Resource(name = "caspainPictureMapper")
    private PictureMapper caspainPictureMapper;
    @Resource
    private ManagerWebMapper managerWebMapper;
    @Resource(name = "volgaOpenchannelsShowroomsMapper")
    private com.web.business.dao.volga.OpenchannelsShowroomsMapper volgaOpenchannelsShowroomsMapper;
    @Resource(name = "volgaRoomMapper")
    private com.web.business.dao.volga.RoomMapper volgaRoomMapper;
    @Resource(name = "volgaPictureMapper")
    private com.web.business.dao.volga.PictureMapper volgaPictureMapper;
    @Resource
    private ApartmentMapper apartmentMapper;
    @Resource
    private ApartmentInfoMapper apartmentInfoMapper;
    @Resource
    private FloorMapper floorMapper;
    @Resource
    private HuangheDistrictMapper huangheDistrictMapper;
    @Resource
    private HuangheAreaMapper huangheAreaMapper;
    //根据区域获取商圈信息
    @Override
    public Map<String, List<String>> getBlockByDistrict(String city) {
        //获取当前城市区级行政区的详情
        if (city == null) {
            city = "上海";
        }
        HuangheDistrictExample huangheDistrictExample = new HuangheDistrictExample();
        huangheDistrictExample.setDistinct(true);
        HuangheDistrictExample.Criteria criteria = huangheDistrictExample.createCriteria();
        criteria.andCityEqualTo(city);
        List<HuangheDistrict> huangheDistricts = huangheDistrictMapper.selectByExample(huangheDistrictExample);
        //根据区级行政区获得商圈信息
        List<String> districts = new ArrayList<String>();
        for (HuangheDistrict huangheDistrict : huangheDistricts) {
            districts.add(huangheDistrict.getDistrict());
        }
        Map<String, List<String>> districtsAndBlockList = new HashMap<>();
        for (String district : districts) {
            List<String> blocks = huangheAreaMapper.selectByDistrict(city, district);
            districtsAndBlockList.put(district,blocks);
        }
        System.out.println(districtsAndBlockList);
        return districtsAndBlockList;
    }
    //分散式查询出房
    @Override
    public List<HouseListVo> getHouseList(String city, Integer managerWebId) {
        List<HouseListVo> houseListVos = new ArrayList<HouseListVo>();
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        //获得主账户的userId
        Integer userId = managerWeb.getCreateById();
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusEqualTo((short) 3);
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(caspainOpenchannelsShowroomsExample);
        for (OpenchannelsShowroomsWithBLOBs openchannelsShowroom : caspainOpenchannelsShowrooms) {
            HouseListVo houseListVo = new HouseListVo();
            //获取RawData中的数据信息
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
            //设置图片信息
            String pictures = rawDataJson.getString("pictures");
            String pictureId = pictures.split(",")[0];
            Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
            houseListVo.setImgUrl(picture.getUrl());
            //设置餐厅信息
            Integer livingroom = rawDataJson.getInteger("livingroom");
            houseListVo.setLivingroom(livingroom);
            //设置卫生间信息
            Integer washroom = rawDataJson.getInteger("washroom");
            houseListVo.setWashroom(washroom);
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            //设置对应的房间属性
            houseListVo.setRoomId(roomWithBLOBs.getId());
            houseListVo.setToward(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            //设置对应的房源属性
            houseListVo.setHouseNam(house.getArea());
            if (house.getIsWhole() == false) {
                houseListVo.setRent("合租");
            } else {
                houseListVo.setRent("整租");
            }

            houseListVo.setCity(house.getCity());
            houseListVo.setBlock(house.getBlock());
            houseListVo.setDistrict(house.getDistrict());
            houseListVo.setLongitude(house.getLongitude());
            houseListVo.setLatitude(house.getLatitude());
            houseListVo.setSpace(house.getSpace());
            houseListVo.setFloorNum(house.getFloorNum());
            houseListVo.setTotalFloorNum(house.getTotalFloorNum());
            houseListVo.setRoomNum(house.getRoomNum());
            houseListVo.setAddress(house.getAddress());
            houseListVo.setPrice(house.getPrice());
            houseListVos.add(houseListVo);
        }
        Iterator<HouseListVo> iterator = houseListVos.iterator();
        while (iterator.hasNext()){
            HouseListVo houseListVo = iterator.next();
            if (!(houseListVo.getCity().equals(city))){
                iterator.remove();
            }
        }
        caspainOpenchannelsShowroomsExample.clear();
        return houseListVos;
    }

    //集中式查询出房
    @Override
    public List<ApartmentListVo> getApartmentList(String city, Integer managerWebId) {
        List<ApartmentListVo> apartmentListVos = new ArrayList<ApartmentListVo>();
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        //获得主账户的userId
        Integer userId = managerWeb.getCreateById();
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        //集中式查询出房
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusEqualTo((short) 3);
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(volgaOpenchannelsShowroomsExample);
        for (com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowroom : volgaOpenchannelsShowrooms) {
            ApartmentListVo apartmentListVo = new ApartmentListVo();
            //获取RawData中的数据信息
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
            //设置图片信息
            String pictures = rawDataJson.getString("pictures");
            String pictureId = pictures.split(",")[0];
            Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
            apartmentListVo.setImgUrl(picture.getUrl());
            //设置餐厅信息
            Integer livingroom = rawDataJson.getInteger("livingroom");
            apartmentListVo.setLivingroom(livingroom);
            //设置卫生间信息
            Integer washroom = rawDataJson.getInteger("washroom");
            apartmentListVo.setWashroom(washroom);
            //获取房间信息
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            apartmentListVo.setSpace(roomWithBLOBs.getSpace());
            apartmentListVo.setPrice(roomWithBLOBs.getPrice());
            Floor floor = floorMapper.selectByPrimaryKey(roomWithBLOBs.getFloorId());
            apartmentListVo.setFloorNum(floor.getNum());
            //获取公寓信息
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            //设置公寓名称
            apartmentListVo.setApartmentNam(apartment.getName());
            //设置所在城市
            apartmentListVo.setCity(apartment.getCity());
            //设置所在区域
            apartmentListVo.setDistrict(apartment.getDistrict());
            //设置商圈
            apartmentListVo.setBlock(apartment.getBlock());
            //设置公寓地址
            apartmentListVo.setApartmentAddress(apartment.getAddress());
            //设置总楼层
            apartmentListVo.setTotalFloorNum(apartment.getFloorNum());
            //设置房间数
            apartmentListVo.setRoomNum(apartment.getRoomNum());
            //设置公寓电话信息
            ApartmentInfoExample apartmentInfoExample = new ApartmentInfoExample();
            apartmentInfoExample.createCriteria().andApartmentIdEqualTo(apartment.getId());
            List<ApartmentInfo> apartmentInfos = apartmentInfoMapper.selectByExample(apartmentInfoExample);
            for (ApartmentInfo apartmentInfo : apartmentInfos) {
                apartmentListVo.setApartmentPhone(apartmentInfo.getStorePhone());
                apartmentListVo.setStoreNam(apartmentInfo.getStoreName());
            }
            apartmentInfoExample.clear();
            apartmentListVos.add(apartmentListVo);
        }
        Iterator<ApartmentListVo> iterator = apartmentListVos.iterator();
        while (iterator.hasNext()){
            ApartmentListVo apartmentListVo = iterator.next();
            if (!(apartmentListVo.getCity().equals(city))){
                iterator.remove();
            }
        }
        volgaOpenchannelsShowroomsExample.clear();
        return apartmentListVos;
    }

    @Override
    public List<House> getHouseListByBMap(BMapObject mapObject) {
        return null;
    }


    //模糊查询分散式房源信息
    @Override
    public List<HouseListVo> getHouseListBySearch(Integer managerWebId,String search,String city) {
        if (city==null) {
            city = "上海";
        }
        List<HouseListVo> houseListVos = new ArrayList<HouseListVo>();
            List<Integer> houseIds = new ArrayList<Integer>();
            List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(managerWebId);
            for (OpenchannelsShowroomsWithBLOBs caspainOpenchannelsShowroom : caspainOpenchannelsShowrooms) {
                HouseListVo houseListVo = new HouseListVo();
                //获取RawData中的数据信息
                JSONObject rawDataJson = JSONObject.parseObject(caspainOpenchannelsShowroom.getRawData());
                //设置图片信息
                String pictures = rawDataJson.getString("pictures");
                String pictureId = pictures.split(",")[0];
                Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
                houseListVo.setImgUrl(picture.getUrl());
                //设置餐厅信息
                Integer livingroom = rawDataJson.getInteger("livingroom");
                houseListVo.setLivingroom(livingroom);
                //设置卫生间信息
                Integer washroom = rawDataJson.getInteger("washroom");
                houseListVo.setWashroom(washroom);
                RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(caspainOpenchannelsShowroom.getRoomId());
                //设置对应的房间属性
                houseListVo.setRoomId(roomWithBLOBs.getId());
                houseListVo.setToward(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName());
                House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
                //设置对应的房源属性
                houseListVo.setHouseNam(house.getArea());
                if (house.getIsWhole() == false) {
                    houseListVo.setRent("合租");
                } else {
                    houseListVo.setRent("整租");
                }

                houseListVo.setCity(house.getCity());
                houseListVo.setBlock(house.getBlock());
                houseListVo.setDistrict(house.getDistrict());
                houseListVo.setLongitude(house.getLongitude());
                houseListVo.setLatitude(house.getLatitude());
                houseListVo.setSpace(house.getSpace());
                houseListVo.setFloorNum(house.getFloorNum());
                houseListVo.setTotalFloorNum(house.getTotalFloorNum());
                houseListVo.setRoomNum(house.getRoomNum());
                houseListVo.setAddress(house.getAddress());
                houseListVo.setPrice(house.getPrice());
                houseListVos.add(houseListVo);
            }
        Iterator<HouseListVo> iterator1 = houseListVos.iterator();
        while (iterator1.hasNext()){
            HouseListVo houseListVo = iterator1.next();
            if (!(city.equals(houseListVo.getCity()))){
                iterator1.remove();
            }
        }
            if(search!=null||!search.equals("")){
                Iterator<HouseListVo> houseList = houseListVos.iterator();
                while (houseList.hasNext()){
                    HouseListVo houseVo = houseList.next();
                    if (houseVo.getBlock().indexOf(search,0)==-1&&!houseVo.getBlock().equals(search)){
                        if (houseVo.getDistrict().indexOf(search,0)==-1&&!houseVo.getDistrict().equals(search)){
                            if (houseVo.getHouseNam().indexOf(search,0)==-1&&!houseVo.getHouseNam().equals(search)){
                                houseList.remove();
                                continue;
                            }
                        }
                    }
                }
            }
            return  houseListVos;
    }
    //模糊查询集中式房源信息
    @Override
    public List<ApartmentListVo> getApartmentListBySearch(Integer managerWebId, String search, String city) {
        if (city==null) {
            city = "上海";
        }
        List<ApartmentListVo> apartmentListVos = new ArrayList<ApartmentListVo>();
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = findvolgaApartment(managerWebId);
        for (com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowroom : volgaOpenchannelsShowrooms) {
            ApartmentListVo apartmentListVo = new ApartmentListVo();
            //获取RawData中的数据信息
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
            //设置图片信息
            String pictures = rawDataJson.getString("pictures");
            String pictureId = pictures.split(",")[0];
            Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
            apartmentListVo.setImgUrl(picture.getUrl());
            //设置餐厅信息
            Integer livingroom = rawDataJson.getInteger("livingroom");
            apartmentListVo.setLivingroom(livingroom);
            //设置卫生间信息
            Integer washroom = rawDataJson.getInteger("washroom");
            apartmentListVo.setWashroom(washroom);
            //获取房间信息
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            apartmentListVo.setRoomId(roomWithBLOBs.getId());
            apartmentListVo.setSpace(roomWithBLOBs.getSpace());
            apartmentListVo.setPrice(roomWithBLOBs.getPrice());
            Floor floor = floorMapper.selectByPrimaryKey(roomWithBLOBs.getFloorId());
            apartmentListVo.setFloorNum(floor.getNum());
            //获取公寓信息
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            //设置公寓Id
            apartmentListVo.setApartmentId(apartment.getId());
            //设置公寓名称
            apartmentListVo.setApartmentNam(apartment.getName());
            //设置所在城市
            apartmentListVo.setCity(apartment.getCity());
            //设置所在区域
            apartmentListVo.setDistrict(apartment.getDistrict());
            //设置商圈
            apartmentListVo.setBlock(apartment.getBlock());
            //设置公寓地址
            apartmentListVo.setApartmentAddress(apartment.getAddress());
            //设置总楼层
            apartmentListVo.setTotalFloorNum(apartment.getFloorNum());
            //设置房间数
            apartmentListVo.setRoomNum(apartment.getRoomNum());
            //设置公寓电话信息
            ApartmentInfoExample apartmentInfoExample = new ApartmentInfoExample();
            apartmentInfoExample.createCriteria().andApartmentIdEqualTo(apartment.getId());
            List<ApartmentInfo> apartmentInfos = apartmentInfoMapper.selectByExample(apartmentInfoExample);
            for (ApartmentInfo apartmentInfo : apartmentInfos) {
                apartmentListVo.setApartmentPhone(apartmentInfo.getStorePhone());
                apartmentListVo.setStoreNam(apartmentInfo.getStoreName());
            }
            apartmentInfoExample.clear();
            apartmentListVos.add(apartmentListVo);
        }
        Iterator<ApartmentListVo> iterator = apartmentListVos.iterator();
        while (iterator.hasNext()){
            ApartmentListVo apartmentListVo = iterator.next();
            if (!(apartmentListVo.getCity().equals(city))){
                iterator.remove();
            }
        }

        if(search!=null||!search.equals("")){
            Iterator<ApartmentListVo> apartmentList = apartmentListVos.iterator();
            while (apartmentList.hasNext()){
                ApartmentListVo apartmentVo = apartmentList.next();
                if (apartmentVo.getBlock().indexOf(search,0)==-1&&!apartmentVo.getBlock().equals(search)){
                    if (apartmentVo.getDistrict().indexOf(search,0)==-1&&!apartmentVo.getDistrict().equals(search)){
                        if (apartmentVo.getApartmentNam().indexOf(search,0)==-1&&!apartmentVo.getApartmentNam().equals(search)){
                            apartmentList.remove();
                            continue;
                        }
                    }
                }
            }
        }


        return apartmentListVos;
    }
    //根据筛选条件获取集中式房源信息
    @Override
    public List<ApartmentListVo> getApartmentByCondition(HouseSearchCondition houseSearchCondition) {
        List<ApartmentListVo> apartmentListVos = new ArrayList<ApartmentListVo>();
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = findvolgaApartment(houseSearchCondition.getManagerWebId());
        for (com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowroom : volgaOpenchannelsShowrooms) {
            ApartmentListVo apartmentListVo = new ApartmentListVo();
            //获取RawData中的数据信息
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
            //设置图片信息
            String pictures = rawDataJson.getString("pictures");
            String pictureId = pictures.split(",")[0];
            Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
            apartmentListVo.setImgUrl(picture.getUrl());
            //设置餐厅信息
            Integer livingroom = rawDataJson.getInteger("livingroom");
            apartmentListVo.setLivingroom(livingroom);
            //设置卫生间信息
            Integer washroom = rawDataJson.getInteger("washroom");
            apartmentListVo.setWashroom(washroom);
            //获取房间信息
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            apartmentListVo.setRoomId(roomWithBLOBs.getId());
            apartmentListVo.setSpace(roomWithBLOBs.getSpace());
            apartmentListVo.setPrice(roomWithBLOBs.getPrice());
            Floor floor = floorMapper.selectByPrimaryKey(roomWithBLOBs.getFloorId());
            apartmentListVo.setFloorNum(floor.getNum());
            //获取公寓信息
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            //设置公寓Id
            apartmentListVo.setApartmentId(apartment.getId());
            //设置公寓名称
            apartmentListVo.setApartmentNam(apartment.getName());
            //设置所在城市
            apartmentListVo.setCity(apartment.getCity());
            //设置所在区域
            apartmentListVo.setDistrict(apartment.getDistrict());
            //设置商圈
            apartmentListVo.setBlock(apartment.getBlock());
            //设置公寓地址
            apartmentListVo.setApartmentAddress(apartment.getAddress());
            //设置总楼层
            apartmentListVo.setTotalFloorNum(apartment.getFloorNum());
            //设置房间数
            apartmentListVo.setRoomNum(apartment.getRoomNum());
            //设置公寓电话信息
            ApartmentInfoExample apartmentInfoExample = new ApartmentInfoExample();
            apartmentInfoExample.createCriteria().andApartmentIdEqualTo(apartment.getId());
            List<ApartmentInfo> apartmentInfos = apartmentInfoMapper.selectByExample(apartmentInfoExample);
            for (ApartmentInfo apartmentInfo : apartmentInfos) {
                apartmentListVo.setApartmentPhone(apartmentInfo.getStorePhone());
                apartmentListVo.setStoreNam(apartmentInfo.getStoreName());
            }
            apartmentInfoExample.clear();
            apartmentListVos.add(apartmentListVo);
        }
        Iterator<ApartmentListVo> iterator = apartmentListVos.iterator();
        while (iterator.hasNext()){
            ApartmentListVo apartmentListVo = iterator.next();
            if (!(apartmentListVo.getCity().equals(houseSearchCondition.getCity()))){
                iterator.remove();
            }
        }

        Iterator<ApartmentListVo> iterator1 = apartmentListVos.iterator();
        while (iterator.hasNext()) {
            ApartmentListVo apartmentListVo = iterator.next();
            //判断区域
            if (houseSearchCondition.getDistrict() != null&&!houseSearchCondition.getDistrict().equals("")) {
                if (!houseSearchCondition.getDistrict().equals(apartmentListVo.getDistrict())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断商圈
            if (houseSearchCondition.getBlock() != null&&!houseSearchCondition.getBlock().equals("")) {
                if (!houseSearchCondition.getBlock().equals(apartmentListVo.getBlock())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断户型
            if (houseSearchCondition.getRoomNum() != null&&!houseSearchCondition.getRoomNum().equals("")) {
                if (!houseSearchCondition.getRoomNum().equals(apartmentListVo.getRoomNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断地铁
            if (houseSearchCondition.getSubway() != null&&!houseSearchCondition.getSubway().equals("")) {
                if (!houseSearchCondition.getSubway().equals(apartmentListVo.getSubway())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断楼层
            if (houseSearchCondition.getFloorNum() != null&&!houseSearchCondition.getFloorNum().equals("")) {
                if (!houseSearchCondition.getFloorNum().equals(apartmentListVo.getFloorNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断朝向
            if (houseSearchCondition.getToward() != null&&!houseSearchCondition.getToward().equals("")) {
                if (!houseSearchCondition.getToward().equals(apartmentListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }
           /* //判断房间配置
            if (houseSearchCondition.getRoomConfig().length>0) {
                String[] roomConfig = houseSearchCondition.getRoomConfig();
                if (!houseSearchCondition.getToward().equals(houseListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }*/
            //判断价格区间
            if (houseSearchCondition.getPriceTop() != null && !houseSearchCondition.getPriceTop().equals("") && houseSearchCondition.getPriceLow() != null&& !houseSearchCondition.getPriceLow().equals("")) {
                if (!(apartmentListVo.getPrice() > houseSearchCondition.getPriceLow() && apartmentListVo.getPrice() <= houseSearchCondition.getPriceTop())) {
                    iterator.remove();
                    continue;
                }
            } else if (houseSearchCondition.getPriceLow() != null && !houseSearchCondition.getPriceLow().equals("")&&houseSearchCondition.getPriceLow() > apartmentListVo.getPrice()) {
                iterator.remove();
                continue;
            }
            //判断面积区间
            if (houseSearchCondition.getSpaceTop()!=null && !houseSearchCondition.getSpaceTop().equals("")&& houseSearchCondition.getSpaceLow()!=null && !houseSearchCondition.getSpaceLow().equals("")){
                if (!(apartmentListVo.getSpace()>houseSearchCondition.getSpaceLow() && apartmentListVo.getSpace()<=houseSearchCondition.getSpaceTop())){
                    iterator.remove();
                    continue;
                }
            }else if (houseSearchCondition.getSpaceLow() != null && !houseSearchCondition.getSpaceLow().equals("") && houseSearchCondition.getSpaceLow()>apartmentListVo.getSpace()){
                iterator.remove();
                continue;
            }
        }
        return apartmentListVos;
    }

    //根据筛选条件获取分散式房源信息
    @Override
    public List<HouseListVo> getHouseByCondition(HouseSearchCondition houseSearchCondition) {
        List<HouseListVo> houseListVos = new ArrayList<HouseListVo>();
        //获取所有的已发房源
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(houseSearchCondition.getManagerWebId());
        for (OpenchannelsShowroomsWithBLOBs openchannelsShowroom : caspainOpenchannelsShowrooms) {
            HouseListVo houseListVo = new HouseListVo();
            //获取RawData中的数据信息
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
            //设置图片信息
            String pictures = rawDataJson.getString("pictures");
            String pictureId = pictures.split(",")[0];
            Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
            houseListVo.setImgUrl(picture.getUrl());
            //设置餐厅信息
            Integer livingroom = rawDataJson.getInteger("livingroom");
            houseListVo.setLivingroom(livingroom);
            //设置卫生间信息
            Integer washroom = rawDataJson.getInteger("washroom");
            houseListVo.setWashroom(washroom);
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            //设置对应的房间属性
            houseListVo.setRoomId(roomWithBLOBs.getId());
            houseListVo.setToward(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            //设置对应的房源属性
            houseListVo.setHouseNam(house.getArea());
            if (house.getIsWhole() == false) {
                houseListVo.setRent("合租");
            } else {
                houseListVo.setRent("整租");
            }
            houseListVo.setCity(house.getCity());
            houseListVo.setBlock(house.getBlock());
            houseListVo.setDistrict(house.getDistrict());
            houseListVo.setLongitude(house.getLongitude());
            houseListVo.setLatitude(house.getLatitude());
            houseListVo.setSpace(house.getSpace());
            houseListVo.setFloorNum(house.getFloorNum());
            houseListVo.setTotalFloorNum(house.getTotalFloorNum());
            houseListVo.setRoomNum(house.getRoomNum());
            houseListVo.setAddress(house.getAddress());
            houseListVo.setPrice(house.getPrice());
            houseListVos.add(houseListVo);
        }
        Iterator<HouseListVo> iterator1 = houseListVos.iterator();
        while (iterator1.hasNext()){
            HouseListVo houseListVo = iterator1.next();
            if (!(houseSearchCondition.getCity().equals(houseListVo.getCity()))){
                iterator1.remove();
            }
        }
        Iterator<HouseListVo> iterator = houseListVos.iterator();
        while (iterator.hasNext()) {
            HouseListVo houseListVo = iterator.next();
            //判断区域
            if (houseSearchCondition.getDistrict() != null&&!houseSearchCondition.getDistrict().equals("")) {
                if (!houseSearchCondition.getDistrict().equals(houseListVo.getDistrict())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断商圈
            if (houseSearchCondition.getBlock() != null&&!houseSearchCondition.getBlock().equals("")) {
                if (!houseSearchCondition.getBlock().equals(houseListVo.getBlock())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断户型
            if (houseSearchCondition.getRoomNum() != null&&!houseSearchCondition.getRoomNum().equals("")) {
                if (!houseSearchCondition.getRoomNum().equals(houseListVo.getRoomNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断地铁
            if (houseSearchCondition.getSubway() != null&&!houseSearchCondition.getSubway().equals("")) {
                if (!houseSearchCondition.getSubway().equals(houseListVo.getSubway())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断楼层
            if (houseSearchCondition.getFloorNum() != null&&!houseSearchCondition.getFloorNum().equals("")) {
                if (!houseSearchCondition.getFloorNum().equals(houseListVo.getFloorNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断朝向
            if (houseSearchCondition.getToward() != null&&!houseSearchCondition.getToward().equals("")) {
                if (!houseSearchCondition.getToward().equals(houseListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }
           /* //判断房间配置
            if (houseSearchCondition.getRoomConfig().length>0) {
                String[] roomConfig = houseSearchCondition.getRoomConfig();
                if (!houseSearchCondition.getToward().equals(houseListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }*/
           //判断价格区间
            if (houseSearchCondition.getPriceTop() != null && !houseSearchCondition.getPriceTop().equals("") && houseSearchCondition.getPriceLow() != null&& !houseSearchCondition.getPriceLow().equals("")) {
                if (!(houseListVo.getPrice() > houseSearchCondition.getPriceLow() && houseListVo.getPrice() <= houseSearchCondition.getPriceTop())) {
                    iterator.remove();
                    continue;
                }
            } else if (houseSearchCondition.getPriceLow() != null && !houseSearchCondition.getPriceLow().equals("")&&houseSearchCondition.getPriceLow() > houseListVo.getPrice()) {
                iterator.remove();
                continue;
            }
            //判断面积区间
            if (houseSearchCondition.getSpaceTop()!=null && !houseSearchCondition.getSpaceTop().equals("")&& houseSearchCondition.getSpaceLow()!=null && !houseSearchCondition.getSpaceLow().equals("")){
                if (!(houseListVo.getSpace()>houseSearchCondition.getSpaceLow() && houseListVo.getSpace()<=houseSearchCondition.getSpaceTop())){
                    iterator.remove();
                    continue;
                }
            }else if (houseSearchCondition.getSpaceLow() != null && !houseSearchCondition.getSpaceLow().equals("") && houseSearchCondition.getSpaceLow()>houseListVo.getSpace()){
                iterator.remove();
                continue;
            }
        }
        return houseListVos;
    }
    //根据主账号的userId查询员工的userId和主账号userid
    private List<Integer> findUserIds(Integer userId) {
        UserProfileExample userProfileExample = new UserProfileExample();
        userProfileExample.createCriteria().andUserIdEqualTo(userId).andIsDeleteEqualTo(false);
        UserProfile userProfile = userProfileMapper.selectByExample(userProfileExample).get(0);
        EmployerExample employerExample = new EmployerExample();
        employerExample.createCriteria().andIsDeleteEqualTo(false).andBossIdEqualTo(userProfile.getId());
        List<Integer> userIds = employerMapper.selectUserIdsByExample(employerExample);
        userIds.add(userId);
        return userIds;
    }
    //分散式获取该用户的房源信息
    private List<OpenchannelsShowroomsWithBLOBs> findCaspainHouses(Integer managerWebId) {
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        //获得主账户的userId
        Integer userId = managerWeb.getCreateById();
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusEqualTo((short) 3);
        List<OpenchannelsShowroomsWithBLOBs> openchannelsShowroomsWithBLOBs = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(caspainOpenchannelsShowroomsExample);
        caspainOpenchannelsShowroomsExample.clear();
        return openchannelsShowroomsWithBLOBs;
    }

    //集中式获取该用户的房源信息
    private List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> findvolgaApartment(Integer managerWebId) {
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        //获得主账户的userId
        Integer userId = managerWeb.getCreateById();
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        //集中式查询出房
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusEqualTo((short) 3);
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(volgaOpenchannelsShowroomsExample);
        volgaOpenchannelsShowroomsExample.clear();
        return volgaOpenchannelsShowrooms;
    }
}
