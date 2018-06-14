package com.web.business.service.website.impl;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.*;
import com.web.business.dao.volga.ApartmentInfoMapper;
import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.dao.volga.FloorMapper;
import com.web.business.enums.RoomTowardEnum;
import com.web.business.model.api.BMapObject;
import com.web.business.model.api.HouseSearchCondition;
import com.web.business.model.api.SubwayStationVo;
import com.web.business.model.caspain.*;
import com.web.business.model.caspain.OpenchannelsShowroomsExample;
import com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs;
import com.web.business.model.caspain.Picture;
import com.web.business.model.caspain.RoomExample;
import com.web.business.model.caspain.RoomWithBLOBs;
import com.web.business.model.volga.*;
import com.web.business.page.website.ApartmentListVo;
import com.web.business.page.website.HouseListVo;
import com.web.business.service.website.BMapSearchService;
import com.web.common.support.DomainThreadLocal;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.*;

@Service
public class BMapSearchServcieImpl implements BMapSearchService {
    @Resource
    private HuangheDistrictMapper huangheDistrictMapper;
    @Resource
    private HuangheAreaMapper huangheAreaMapper;
    @Resource
    private HouseMapper houseMapper;
    @Resource
    private ManagerWebMapper managerWebMapper;
    @Resource
    private UserProfileMapper userProfileMapper;
    @Resource
    private EmployerMapper employerMapper;
    @Resource(name = "caspainOpenchannelsShowroomsMapper")
    private OpenchannelsShowroomsMapper caspainOpenchannelsShowroomsMapper;
    @Resource(name = "caspainRoomMapper")
    private RoomMapper caspainRoomMapper;
    @Resource(name = "caspainPictureMapper")
    private PictureMapper caspainPictureMapper;
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

    //设置各级地图缩放级别
    private final static Integer DISTRICT_LEVEL = 11;
    private final static Integer BLOCK_LEVEL = 13;
    private final static Integer HOUSE_LEVEL = 15;

    @Override
    //获取指定范围内的区级行政区列表(包含区级行政区名称，经纬坐标)
    public Map<String, Object> getDistrictByCity(Integer managerWebId,String city, BMapObject bMapObject) {
        //获取当前城市区级行政区的详情
        if (city == null) {
            city = "上海";
        }
        if (bMapObject.getLevel() == null || bMapObject.getLevel() < DISTRICT_LEVEL) {
            bMapObject.setLevel(DISTRICT_LEVEL);
        }
        HuangheDistrictExample huangheDistrictExample = new HuangheDistrictExample();
        huangheDistrictExample.setDistinct(true);
        HuangheDistrictExample.Criteria criteria = huangheDistrictExample.createCriteria();
        criteria.andCityEqualTo(city);
        List<HuangheDistrict> huangheDistricts = huangheDistrictMapper.selectByExample(huangheDistrictExample);
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(managerWebId);
        List<House> houses = new ArrayList<House>();
        for (OpenchannelsShowroomsWithBLOBs caspainOpenchannelsShowroom : caspainOpenchannelsShowrooms) {
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(caspainOpenchannelsShowroom.getRoomId());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            for (HuangheDistrict huangheDistrict : huangheDistricts) {
                if (house.getDistrict().equals(huangheDistrict.getDistrict()) && house.getCity().equals(city)) {
                    houses.add(house);
                    break;
                }
            }
        }
        //根据区级行政区获得商圈信息
        List<String> districts = new ArrayList<String>();
        for (HuangheDistrict huangheDistrict : huangheDistricts) {
            districts.add(huangheDistrict.getDistrict());
        }
        List<Map<HuangheDistrict, ArrayList<String>>> districtsAndBlockList = new ArrayList<>();
        for (HuangheDistrict district : huangheDistricts) {
            List<String> blocks = new ArrayList<String>();
            blocks = huangheAreaMapper.selectByDistrict(city, district.getDistrict());
            Map map = new HashMap();
            map.put(district, blocks);
            districtsAndBlockList.add(map);
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("huangheDistricts", huangheDistricts);
        map.put("districtsAndBlockList", districtsAndBlockList);
        System.out.println(districtsAndBlockList);
        map.put("houses", houses);
        map.put("bMapObject", bMapObject);
        return map;
    }

    @Override
    //获取指定区级行政区范围内的商圈列表
    public Map<String, Object> getBlockByDistrict(Integer managerWebId,String city, String district, BMapObject bMapObject) {
        if (city == null) {
            city = "上海";
        }
        if (district == null) {
            district = "浦东";
        }
        if (bMapObject.getLevel() < HOUSE_LEVEL && bMapObject.getLevel() > DISTRICT_LEVEL) {
            bMapObject.setLevel(BLOCK_LEVEL);
        }
        HuangheAreaExample huangheAreaExample = new HuangheAreaExample();
        huangheAreaExample.setDistinct(true);
        HuangheAreaExample.Criteria criteria = huangheAreaExample.createCriteria();
        criteria.andCityEqualTo(city);
        criteria.andDistrictEqualTo(district);
        List<HuangheArea> blocks = huangheAreaMapper.selectByExample(huangheAreaExample);
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(managerWebId);
        List<House> houses = new ArrayList<House>();
        for (OpenchannelsShowroomsWithBLOBs caspainOpenchannelsShowroom : caspainOpenchannelsShowrooms) {
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(caspainOpenchannelsShowroom.getRoomId());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            for (HuangheArea block : blocks) {
                if (city.equals(house.getCity()) && block.getBlock().equals(house.getBlock()) && district.equals(house.getDistrict())) {
                    houses.add(house);
                    break;
                }
            }
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("blocks", blocks);
        map.put("houses", houses);
        map.put("bMapObject", bMapObject);
        System.out.println(map.get("blocks"));
        return map;
    }
    //分散式查询出房
    @Override
    public List<HouseListVo> getHouseList(String city, Integer managerWebId, BMapObject bMapObject) {
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
        for (int i = 0; i < houseListVos.size(); i++) {
            if (!houseListVos.get(i).getCity().equals(city)) {
                houseListVos.remove(i);
            }
        }
        caspainOpenchannelsShowroomsExample.clear();
        return houseListVos;
    }

    //集中式查询出房
    @Override
    public List<ApartmentListVo> getApartmentList(String city, Integer managerWebId, BMapObject bMapObject) {
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
            //设置经度坐标
            apartmentListVo.setLongitude(apartment.getLongitude());
            //设置纬度坐标
            apartmentListVo.setLatitude(apartment.getLatitude());
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
        for (int i = 0; i < apartmentListVos.size(); i++) {
            if (!apartmentListVos.get(i).getCity().equals(city)) {
                apartmentListVos.remove(i);
            }
        }
        volgaOpenchannelsShowroomsExample.clear();
        return apartmentListVos;
    }

    //模糊查询分散式房源
    @Override
    public List<House> getHousesBySearch(Integer managerWebId,String search, String city) {
        if (StringUtils.isNotEmpty(city)) {
            city = "上海";
        }
        HouseExample houseExample = new HouseExample();
        houseExample.setDistinct(true);
        HouseExample.Criteria criteria = houseExample.createCriteria();
        HouseExample.Criteria criteria2 = houseExample.createCriteria();
        if (StringUtils.isNotEmpty(search)) {
            criteria.andBlockLike(search);
            criteria2.andAreaLike(search);
            List<Integer> houseIds = new ArrayList<Integer>();
            List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(managerWebId);
            for (OpenchannelsShowroomsWithBLOBs caspainOpenchannelsShowroom : caspainOpenchannelsShowrooms) {
                RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(caspainOpenchannelsShowroom.getRoomId());
                houseIds.add(roomWithBLOBs.getHouseId());
            }
            criteria.andIdIn(houseIds);
            houseExample.or(criteria2);
            List<House> houses = houseMapper.selectByExample(houseExample);
            return houses;
        } else {
            return null;
        }


    }

    //模糊查询集中式房源
    @Override
    public List<Apartment> getApartmentBySearch(Integer managerWebId,String search, String city) {
        if (StringUtils.isNotEmpty(city)) {
            city = "上海";
        }
        ApartmentExample apartmentExample = new ApartmentExample();
        apartmentExample.setDistinct(true);
        ApartmentExample.Criteria criteria = apartmentExample.createCriteria();
        ApartmentExample.Criteria criteria2 = apartmentExample.createCriteria();
        if (StringUtils.isNotEmpty(search)) {
            criteria.andBlockLike(search);
            criteria2.andAreaLike(search);
            List<Integer> apartmentIds = new ArrayList<Integer>();
            List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = findvolgaApartment(managerWebId);
            for (com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs volgaOpenchannelsShowroom : volgaOpenchannelsShowrooms) {
                //获取房间信息
                com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(volgaOpenchannelsShowroom.getRoomId());
                apartmentIds.add(roomWithBLOBs.getApartmentId());
            }
            criteria.andIdIn(apartmentIds);
            apartmentExample.or(criteria2);
            List<Apartment> apartments = apartmentMapper.selectByExample(apartmentExample);
            return apartments;
        } else {
            return null;
        }
    }

    //按条件检索分散式房源
    @Override
    public List<HouseListVo> findHouseByCondition(Integer managerWebId,HouseSearchCondition houseSearchCondition) {
        List<HouseListVo> houseListVos = new ArrayList<HouseListVo>();
        //获取所有的已发房源
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = findCaspainHouses(managerWebId);
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
            if (houseSearchCondition.getDistrict() != null) {
                if (!houseSearchCondition.getDistrict().equals(houseListVo.getDistrict())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断商圈
            if (houseSearchCondition.getBlock() != null) {
                if (!houseSearchCondition.getBlock().equals(houseListVo.getBlock())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断户型
            if (houseSearchCondition.getRoomNum() != null) {
                if (!houseSearchCondition.getRoomNum().equals(houseListVo.getRoomNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断楼层
            if (houseSearchCondition.getFloorNum() != null) {
                if (!houseSearchCondition.getFloorNum().equals(houseListVo.getFloorNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断朝向
            if (houseSearchCondition.getToward() != null) {
                if (!houseSearchCondition.getToward().equals(houseListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断价格区间
            if (houseSearchCondition.getPriceTop() != null && houseSearchCondition.getPriceLow() != null) {
                if (!(houseListVo.getPrice() > houseSearchCondition.getPriceLow() && houseListVo.getPrice() <= houseSearchCondition.getPriceTop())) {
                    iterator.remove();
                    continue;
                }
            } /*else if (houseSearchCondition.getPriceTop() == null && houseSearchCondition.getPriceLow() > houseListVo.getPrice()) {
                iterator.remove();
                continue;
            }*/
            //判断面积区间
            if (houseSearchCondition.getSpaceTop()!=null&& houseSearchCondition.getSpaceLow()!=null){
                if (!(houseListVo.getSpace()>houseSearchCondition.getSpaceLow() && houseListVo.getSpace()<=houseSearchCondition.getSpaceTop())){
                    iterator.remove();
                    continue;
                }
            }/*else if (houseSearchCondition.getSpaceTop() == null && houseSearchCondition.getSpaceLow()>houseListVo.getSpace()){
                iterator.remove();
                continue;
            }*/
        }

        return houseListVos;
    }

    //按条件检索集中式房源
    @Override
    public List<ApartmentListVo> findApartmentByCondition(Integer managerWebId,HouseSearchCondition houseSearchCondition) {
        System.out.println(houseSearchCondition.getDistrict());
        System.out.println(houseSearchCondition.getRoomNum());
        List<ApartmentListVo> apartmentListVos = new ArrayList<ApartmentListVo>();
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> openchannelsShowroomsWithBLOBs = findvolgaApartment(managerWebId);
        for (com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowroom : openchannelsShowroomsWithBLOBs) {
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
            apartmentListVo.setToward(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName());
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
            //设置经度坐标
            apartmentListVo.setLongitude(apartment.getLongitude());
            //设置纬度坐标
            apartmentListVo.setLatitude(apartment.getLatitude());
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
        Iterator<ApartmentListVo> iterator1 = apartmentListVos.iterator();
        while (iterator1.hasNext()){
            ApartmentListVo apartmentListVo = iterator1.next();
            if (!(houseSearchCondition.getCity().equals(apartmentListVo.getCity()))){
                iterator1.remove();
            }
        }
        Iterator<ApartmentListVo> iterator = apartmentListVos.iterator();
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
            if (houseSearchCondition.getBlock() != null) {
                if (!houseSearchCondition.getBlock().equals(apartmentListVo.getBlock())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断户型
            if (houseSearchCondition.getRoomNum() != null) {
                if (!houseSearchCondition.getRoomNum().equals(apartmentListVo.getRoomNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断楼层
            if (houseSearchCondition.getFloorNum() != null) {
                if (!houseSearchCondition.getFloorNum().equals(apartmentListVo.getFloorNum())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断朝向
            if (houseSearchCondition.getToward() != null) {
                if (!houseSearchCondition.getToward().equals(apartmentListVo.getToward())) {
                    iterator.remove();
                    continue;
                }
            }
            //判断价格区间
            if (houseSearchCondition.getPriceTop() != null && houseSearchCondition.getPriceLow() != null) {
                if (!(apartmentListVo.getPrice() > houseSearchCondition.getPriceLow() && apartmentListVo.getPrice() <= houseSearchCondition.getPriceTop())) {
                    iterator.remove();
                    continue;
                }
            } /*else if (houseSearchCondition.getPriceTop() == null && houseSearchCondition.getPriceLow() > apartmentListVo.getPrice()) {
                    iterator.remove();
                    continue;
            }*/
            //判断面积区间
            if (houseSearchCondition.getSpaceTop()!=null&& houseSearchCondition.getSpaceLow()!=null){
                if (!(apartmentListVo.getSpace()>houseSearchCondition.getSpaceLow() && apartmentListVo.getSpace()<=houseSearchCondition.getSpaceTop())){
                    iterator.remove();
                    continue;
                }
            }/*else if (houseSearchCondition.getSpaceTop() == null && houseSearchCondition.getSpaceLow()>apartmentListVo.getSpace()){
                    iterator.remove();
                    continue;
            }*/

        }
        return apartmentListVos;
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
