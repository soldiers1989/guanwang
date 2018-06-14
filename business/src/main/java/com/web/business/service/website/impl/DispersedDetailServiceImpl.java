package com.web.business.service.website.impl;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.*;
import com.web.business.dao.volga.ApartmentInfoMapper;
import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.enums.HomeStructureTypeEnum;
import com.web.business.enums.RoomRentStatusEnum;
import com.web.business.enums.RoomTowardEnum;
import com.web.business.model.caspain.*;
import com.web.business.model.volga.Apartment;
import com.web.business.model.volga.ApartmentInfoExample;
import com.web.business.model.volga.ApartmentInfoWithBLOBs;
import com.web.business.page.website.*;
import com.web.business.service.website.DispersedDetailService;
import com.web.business.service.website.IndexService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.BaiDuMap.BaiDuMapUtils;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
@Service
public class DispersedDetailServiceImpl implements DispersedDetailService {
    @Resource(name = "caspainRoomMapper")
    private RoomMapper caspainRoomMapper;
    @Resource(name = "volgaRoomMapper")
    private com.web.business.dao.volga.RoomMapper volgaRoomMapper;
    @Resource
    private HouseMapper houseMapper;
    @Resource(name = "caspainRoomAssetsMapper")
    private RoomAssetsMapper caspainroomAssetsMapper;
    @Resource(name = "caspainOpenchannelsShowroomsMapper")
    private OpenchannelsShowroomsMapper caspainOpenchannelsShowroomsMapper;
    @Resource(name = "volgaOpenchannelsShowroomsMapper")
    private com.web.business.dao.volga.OpenchannelsShowroomsMapper volgaOpenchannelsShowroomsMapper;
    @Resource(name = "caspainRoomContractMapper")
    private RoomContractMapper caspainRoomContractMapper;
    @Resource
    private UserProfileMapper userProfileMapper;
    @Resource
    private EmployerMapper employerMapper;
    @Resource
    private ManagerWebMapper managerWebMapper;
    @Resource(name = "caspainPictureMapper")
    private PictureMapper caspainPictureMapper;
    @Resource(name = "volgaPictureMapper")
    private com.web.business.dao.volga.PictureMapper volgaPictureMapper;
    @Resource
    private ApartmentMapper apartmentMapper;
    @Resource
    private ApartmentInfoMapper apartmentInfoMapper;


    @Override
    public DispersedRoomDetailVO findDetailInfoByRoomId(Integer roomId) {
        DispersedRoomDetailVO roomDetailVO = new DispersedRoomDetailVO();
        RoomWithBLOBs room = caspainRoomMapper.selectByPrimaryKey(roomId);
        OpenchannelsShowroomsExample openchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        openchannelsShowroomsExample.createCriteria().andRoomIdEqualTo(roomId).andIsDeleteEqualTo(false)
                .andStatusBetween((short) 1, (short) 3);
        openchannelsShowroomsExample.setOrderByClause("created_at desc");
        OpenchannelsShowroomsWithBLOBs openchannelsShowroom = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(openchannelsShowroomsExample).get(0);
        JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowroom.getRawData());
        //室
        Integer bedrooms = rawDataJson.getInteger("bedrooms");
        //厅
        Integer livingrooms = rawDataJson.getInteger("livingrooms");
        //卫
        Integer washrooms = rawDataJson.getInteger("washrooms");
        roomDetailVO.setHouseType(new StringBuilder().append(bedrooms).append("室").append(livingrooms).append("厅").append(washrooms).append("卫").toString());
        Integer houseId = room.getHouseId();
        House house = houseMapper.selectByPrimaryKey(houseId);
        roomDetailVO.setLatitude(house.getLatitude());
        roomDetailVO.setLongitude(house.getLongitude());
        roomDetailVO.setRentWay(house.getIsWhole() ? "整租" : "合租");
        roomDetailVO.setHouseName(house.getArea());
        List<String> tags = new ArrayList<String>();
        RoomAssets roomAssets = caspainroomAssetsMapper.selectByPrimaryKey(room.getAssetsId());
        //房源标签处理
        findRoomAssetsTag(tags, roomAssets);
        roomDetailVO.setRoomTages(tags);
        roomDetailVO.setPrice(String.valueOf(room.getPrice().intValue()));
        roomDetailVO.setAddress(new StringBuilder().append(house.getDistrict()).append(house.getBlock()).append(house.getAddress()).toString());
        roomDetailVO.setSpace(String.valueOf(room.getSpace()));
        roomDetailVO.setFloorInfo(new StringBuilder().append(house.getFloorNum()).append("/").append(house.getTotalFloorNum()).append("楼").toString());
        roomDetailVO.setToward(RoomTowardEnum.getByCode(room.getToward()).getName());
        roomDetailVO.setId(roomId);
        //风格
        roomDetailVO.setStyle(null);
        List<String> imageUrls = new ArrayList<String>();
        //房间图片地址
        String pictures = rawDataJson.getString("pictures");
        if (pictures != null) {
            String[] pictureArr = pictures.split(",");
            for (int i = 0; i < pictureArr.length; i++) {
                Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureArr[i]));
                imageUrls.add((picture.getUrl()));
            }
        }
        roomDetailVO.setImageUrls(imageUrls);
        return roomDetailVO;

    }

    //房源标签处理
    private void findRoomAssetsTag(List<String> tags, RoomAssets roomAssets) {
        Boolean tagBalcony = roomAssets.getTagBalcony();
        if (tagBalcony) {
            tags.add("独立阳台");
        }
        Boolean tagKitchen = roomAssets.getTagKitchen();
        if (tagKitchen) {
            tags.add("厨房");
        }
        Boolean tagMetro = roomAssets.getTagMetro();
        if (tagMetro) {
            tags.add("离地铁近");
        }
        Boolean tagPubBalcony = roomAssets.getTagPubBalcony();
        if (tagPubBalcony) {
            tags.add("公共阳台");
        }
        Boolean tagPubToilet = roomAssets.getTagPubToilet();
        if (tagPubToilet) {
            tags.add("公共卫生间");
        }
        Boolean tagToilet = roomAssets.getTagToilet();
        if (tagToilet) {
            tags.add("独立卫生间");
        }
    }

    //查询房间配置
    @Override
    public RoomAssets findRoomPlanning(Integer roomId) {
        RoomWithBLOBs room = caspainRoomMapper.selectByPrimaryKey(roomId);
        RoomAssets roomAssets = caspainroomAssetsMapper.selectByPrimaryKey(room.getAssetsId());
        return roomAssets;
    }

    //查询室友情况
    @Override
    public List<DispersedRoomieDetailVO> findRoomieDetail(Integer roomId) {
        List<DispersedRoomieDetailVO> roomieDetailVOS = new ArrayList<DispersedRoomieDetailVO>();
        RoomWithBLOBs room = caspainRoomMapper.selectByPrimaryKey(roomId);
        House house = houseMapper.selectByPrimaryKey(room.getHouseId());
        if (house.getIsWhole()) {
            return null;
        } else {
            RoomExample roomExample = new RoomExample();
            roomExample.createCriteria().andHouseIdEqualTo(house.getId()).andIsDeleteEqualTo(false);
            List<Room> rooms = caspainRoomMapper.selectByExample(roomExample);
            for (Room room1 : rooms) {
                Integer id = room1.getId();
                if (!id.equals(roomId)) {
                    OpenchannelsShowroomsExample openchannelsShowroomsExample = new OpenchannelsShowroomsExample();
                    openchannelsShowroomsExample.createCriteria().andRoomIdEqualTo(id).andIsDeleteEqualTo(false)
                            .andStatusBetween((short) 1, (short) 3);
                    List<OpenchannelsShowroomsWithBLOBs> openchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(openchannelsShowroomsExample);
                    if (openchannelsShowrooms.size() > 0) {
                        DispersedRoomieDetailVO roomieDetailVO = new DispersedRoomieDetailVO();
                        roomieDetailVO.setRoomName(room1.getName());
                        roomieDetailVO.setRoomToward(RoomTowardEnum.getByCode(room1.getToward()).getName());
                        roomieDetailVO.setPrice(room1.getPrice().intValue());
                        roomieDetailVO.setRoomSpace(room1.getSpace().intValue());
                        RoomContractExample roomContractExample = new RoomContractExample();
                        roomContractExample.createCriteria().andRoomIdEqualTo(id).andIsDeleteEqualTo(false).andStatusEqualTo("active");
                        List<RoomContract> roomContracts = caspainRoomContractMapper.selectByExample(roomContractExample);
                        if (roomContracts.size() > 0) {
                            RoomContract roomContract = roomContracts.get(0);
                            roomieDetailVO.setRoomieName(roomContract.getCustomerName());
                            roomieDetailVO.setRentStatus(RoomRentStatusEnum.RENTED.getCode());
                        } else {
                            roomieDetailVO.setRoomieName("空");
                            roomieDetailVO.setRentStatus(RoomRentStatusEnum.EMPTY.getCode());
                        }
                        RoomAssets roomAssets = caspainroomAssetsMapper.selectByPrimaryKey(room1.getAssetsId());
                        roomieDetailVO.setIndependentBalcony(roomAssets.getBalconies());
                        roomieDetailVO.setIndependentToilet(roomAssets.getTagToilet());
                        roomieDetailVOS.add(roomieDetailVO);
                    }
                } else {
                    DispersedRoomieDetailVO roomieDetailVO = new DispersedRoomieDetailVO();
                    roomieDetailVO.setRoomName(room.getName());
                    roomieDetailVO.setRoomToward(RoomTowardEnum.getByCode(room.getToward()).getName());
                    roomieDetailVO.setPrice(room.getPrice().intValue());
                    roomieDetailVO.setRoomSpace(room.getSpace().intValue());
                    RoomAssets roomAssets = caspainroomAssetsMapper.selectByPrimaryKey(room.getAssetsId());
                    roomieDetailVO.setIndependentBalcony(roomAssets.getBalconies());
                    roomieDetailVO.setIndependentToilet(roomAssets.getTagToilet());
                    roomieDetailVO.setRentStatus(RoomRentStatusEnum.EMPTY.getCode());
                    roomieDetailVO.setRoomieName("空");
                    roomieDetailVOS.add(roomieDetailVO);
                }
            }

        }
        return roomieDetailVOS;
    }

    //查询相似房源(用户推荐与此房源价格浮动500元内，当前房源定位3公里内的其他房源)
    @Override
    public List<IndexHomeVO> findSimilarlyRooms(Integer roomId) {
        RoomWithBLOBs currentRoom = caspainRoomMapper.selectByPrimaryKey(roomId);
        //当前房间的价格
        Double price = currentRoom.getPrice();
        House currentHouse = houseMapper.selectByPrimaryKey(currentRoom.getHouseId());
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        Integer userId = managerWeb.getCreateById();
        List<Integer> userIds = findUserIds(userId);
        //集中式和分散式房源整合页面对象
        List<IndexHomeVO> homeVOS = new ArrayList<IndexHomeVO>();
        //分散式相似房源
        findCaspainSimilarlyHomes(userIds, homeVOS, currentHouse, price);
        //集中式相似房源
        findVolgaSimilarlyHomes(userIds, homeVOS, currentHouse, price);
        Collections.sort(homeVOS, new Comparator<IndexHomeVO>() {
            @Override
            public int compare(IndexHomeVO o1, IndexHomeVO o2) {
                return o1.getRentStatus().compareTo(o2.getRentStatus());
            }
        });
        return homeVOS;
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

    //分散式相似房源处理
    public void findCaspainSimilarlyHomes(List<Integer> userIds, List<IndexHomeVO> homeVOS, House currentHouse, Double price) {
        //当前房源的纬度
        String currentLatitude = currentHouse.getLatitude();
        //当前房源的经度
        String currentLongitude = currentHouse.getLongitude();
        //当前房源所在城市
        String city = currentHouse.getCity();
        OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(caspainOpenchannelsShowroomsExample);
        Iterator<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowroomsIterator = caspainOpenchannelsShowrooms.iterator();
        while (caspainOpenchannelsShowroomsIterator.hasNext()) {
            OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = caspainOpenchannelsShowroomsIterator.next();
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowrooms.getRawData());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            String latitude = house.getLatitude();
            String longitude = house.getLongitude();
            Double distance = BaiDuMapUtils.getDistanceFromHttp(currentLatitude + "," + currentLongitude, latitude + "," + longitude);
            if (!house.getCity().equals(city) || (currentHouse.getId().equals(house.getId()))
                    || (distance > 3000) || (Math.abs(price - roomWithBLOBs.getPrice()) > 500)) {
                caspainOpenchannelsShowroomsIterator.remove();
            } else {
                IndexHomeVO indexHomeVO = new IndexHomeVO();
                indexHomeVO.setRoomId(roomWithBLOBs.getId());
                indexHomeVO.setHomeType(HomeStructureTypeEnum.DISPERSED.getCode());
                indexHomeVO.setHomeName(new StringBuilder().append(house.getArea()).
                        append(" ").append(rawDataJson.getInteger("bedrooms")).append("居 ").
                        append(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName()).toString());
                indexHomeVO.setHomeInfo(new StringBuilder().
                        append(rawDataJson.getInteger("bedrooms")).append("室").append(rawDataJson.getInteger("livingrooms")).append("厅").append("   ").
                        append(roomWithBLOBs.getSpace()).append("㎡").toString());
                indexHomeVO.setHomePrice(new StringBuilder().append(roomWithBLOBs.getPrice().intValue()).append("元/月").toString());
                String pictures = rawDataJson.getString("pictures");
                String pictureId = pictures.split(",")[0];
                Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
                //设置图片跳转链接
                indexHomeVO.setHomeImageLinkUrl("room/" + roomWithBLOBs.getId());
                indexHomeVO.setHomeImageUrl(picture.getUrl());
                indexHomeVO.setPublishTime(openchannelsShowrooms.getUpdatedAt());
                indexHomeVO.setPrice(roomWithBLOBs.getPrice().intValue());
                indexHomeVO.setRentStatus(roomWithBLOBs.getRentStatus());
                homeVOS.add(indexHomeVO);
            }
        }
    }

    //集中式相似房源处理
    public void findVolgaSimilarlyHomes(List<Integer> userIds, List<IndexHomeVO> homeVOS, House currentHouse, Double price) {
        //当前房源的纬度
        String currentLatitude = currentHouse.getLatitude();
        //当前房源的经度
        String currentLongitude = currentHouse.getLongitude();
        //当前房源所在城市
        String city = currentHouse.getCity();
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(volgaOpenchannelsShowroomsExample);
        Iterator<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowroomsIterator = volgaOpenchannelsShowrooms.iterator();
        while (volgaOpenchannelsShowroomsIterator.hasNext()) {
            com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = volgaOpenchannelsShowroomsIterator.next();
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            boolean flag = false;
            for (IndexHomeVO homeVO : homeVOS) {
                if (homeVO.getHomeType().equals(HomeStructureTypeEnum.CONCENTRATE.getCode()) && homeVO.getApartmentId().equals(apartment.getId())) {
                    flag = true;
                    if (homeVO.getRentStatus().equals(RoomRentStatusEnum.RENTED.getCode()) && roomWithBLOBs.getRentStatus().equals(RoomRentStatusEnum.EMPTY.getCode())) {
                        homeVO.setRentStatus(RoomRentStatusEnum.EMPTY.getCode());
                    }
                    break;
                }
            }
            //当前公寓城市和房源城市匹配并且没有存入IndexHomeVO对象
            if ((!flag) && apartment.getCity().equals(city)) {
                String latitude = apartment.getLatitude();
                String longitude = apartment.getLongitude();
                Double distance = BaiDuMapUtils.getDistanceFromHttp(currentLatitude + "," + currentLongitude, latitude + "," + longitude);
                //该房源距离该公寓在三公里之内
                if ((distance <= 3000)) {
                    //计算该公寓下出房房间价格的最小值，最大值
                    Map<String, Integer> minMaxMap = findMinMaxPriceByApartment(apartment);
                    Integer minPrice = minMaxMap.get("min");
                    Integer maxPrice = minMaxMap.get("max");
                    //计算当前房间的价格和集中式中房间价格最小值，最大值的差别是是500之内的
                    if ((Math.abs(minPrice - roomWithBLOBs.getPrice()) < 500) || (Math.abs(maxPrice - roomWithBLOBs.getPrice()) < 500)) {
                        IndexHomeVO indexHomeVO = new IndexHomeVO();
                        indexHomeVO.setApartmentId(apartment.getId());
                        indexHomeVO.setHomeType(HomeStructureTypeEnum.CONCENTRATE.getCode());
                        indexHomeVO.setHomeName(apartment.getName());
                        indexHomeVO.setHomeInfo(new StringBuilder().append(apartment.getDistrict()).append(apartment.getBlock()).append(apartment.getAddress()).toString());
                        indexHomeVO.setHomePrice(new StringBuilder().append(minPrice).append("元/每月起").toString());
                        indexHomeVO.setPrice(minPrice);
                        //图片跳转链接
                        indexHomeVO.setHomeImageLinkUrl("apartment/" + apartment.getId());
                        indexHomeVO.setPublishTime(openchannelsShowrooms.getUpdatedAt());
                        ApartmentInfoExample apartmentInfoExample = new ApartmentInfoExample();
                        apartmentInfoExample.createCriteria().andApartmentIdEqualTo(apartment.getId()).andIsDeleteEqualTo(false);
                        ApartmentInfoWithBLOBs apartmentInfoWithBLOBs = apartmentInfoMapper.selectByExampleWithBLOBs(apartmentInfoExample).get(0);
                        String apartmentPictures = apartmentInfoWithBLOBs.getApartmentPictures();
                        String pictureId = apartmentPictures.split(",")[0];
                        com.web.business.model.volga.Picture picture = volgaPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
                        indexHomeVO.setHomeImageUrl(picture.getUrl());
                        indexHomeVO.setRentStatus(roomWithBLOBs.getRentStatus());
                        homeVOS.add(indexHomeVO);
                    }
                }
            }
        }
    }

    //集中式查询公寓下已经出房的房间的最大值，最小值
    private Map<String, Integer> findMinMaxPriceByApartment(Apartment apartment) {
        Map<String, Integer> minMaxMap = new HashMap<String, Integer>();
        Integer id = apartment.getId();
        com.web.business.model.volga.RoomExample volgaRoomExample = new com.web.business.model.volga.RoomExample();
        volgaRoomExample.createCriteria().andApartmentIdEqualTo(id).andIsDeleteEqualTo(false);
        List<com.web.business.model.volga.Room> volgaRooms = volgaRoomMapper.selectByExample(volgaRoomExample);
        Integer minPrice = 0;
        Integer maxPrice = 0;
        for (com.web.business.model.volga.Room volgaRoom : volgaRooms) {
            Integer roomId = volgaRoom.getId();
            com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
            volgaOpenchannelsShowroomsExample.createCriteria().andRoomIdEqualTo(roomId).andIsDeleteEqualTo(false).andStatusBetween((short) 1, (short) 3);
            List<com.web.business.model.volga.OpenchannelsShowrooms> openchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExample(volgaOpenchannelsShowroomsExample);
            if (openchannelsShowrooms.size() > 0) {
                Integer price = volgaRoom.getPrice().intValue();
                if (minPrice > price) {
                    minPrice = price;
                } else if (maxPrice < price) {
                    maxPrice = price;
                }
            }
        }
        minMaxMap.put("min", minPrice);
        minMaxMap.put("max", maxPrice);
        return minMaxMap;
    }

}
