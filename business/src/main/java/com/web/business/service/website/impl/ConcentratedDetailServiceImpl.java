package com.web.business.service.website.impl;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.*;
import com.web.business.dao.caspain.OpenchannelsShowroomsMapper;
import com.web.business.dao.caspain.RoomAssetsMapper;
import com.web.business.dao.caspain.RoomContractMapper;
import com.web.business.dao.volga.*;
import com.web.business.enums.ApartmentAssetsEnum;
import com.web.business.enums.HomeStructureTypeEnum;
import com.web.business.enums.RoomRentStatusEnum;
import com.web.business.enums.RoomTowardEnum;
import com.web.business.model.caspain.*;
import com.web.business.model.volga.*;
import com.web.business.model.volga.OpenchannelsShowrooms;
import com.web.business.model.volga.OpenchannelsShowroomsExample;
import com.web.business.model.volga.Picture;
import com.web.business.model.volga.Room;
import com.web.business.model.volga.RoomAssets;
import com.web.business.model.volga.RoomExample;
import com.web.business.page.website.ConcentratedApartmentDetailVO;
import com.web.business.page.website.ConcentratedHouseTypeVO;
import com.web.business.page.website.IndexHomeVO;
import com.web.business.service.website.ConcentratedDetailService;
import com.web.common.support.DomainThreadLocal;
import com.web.common.utils.BaiDuMap.BaiDuMapUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author Sky
 * create 2018/05/28
 * email sky.li@ixiaoshuidi.com
 **/
@Service
public class ConcentratedDetailServiceImpl implements ConcentratedDetailService {
    @Resource(name = "caspainRoomMapper")
    private com.web.business.dao.caspain.RoomMapper caspainRoomMapper;
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
    private com.web.business.dao.caspain.PictureMapper caspainPictureMapper;
    @Resource(name = "volgaPictureMapper")
    private com.web.business.dao.volga.PictureMapper volgaPictureMapper;
    @Resource
    private ApartmentMapper apartmentMapper;
    @Resource
    private ApartmentInfoMapper apartmentInfoMapper;
    @Resource
    private LayoutMapper layoutMapper;


    //查询公寓的详细信息
    @Override
    public ConcentratedApartmentDetailVO findApartmentDetail(Integer apartmentId) {
        ConcentratedApartmentDetailVO detailVO = new ConcentratedApartmentDetailVO();
        Apartment apartment = apartmentMapper.selectByPrimaryKey(apartmentId);
        ApartmentInfoExample apartmentInfoExample = new ApartmentInfoExample();
        apartmentInfoExample.createCriteria().andIsDeleteEqualTo(false).andApartmentIdEqualTo(apartmentId);
        ApartmentInfo apartmentInfo = apartmentInfoMapper.selectByExampleWithBLOBs(apartmentInfoExample).get(0);
        detailVO.setId(apartmentId);
        detailVO.setName(apartment.getName());
        detailVO.setStoreName(apartmentInfo.getStoreName());
        detailVO.setStorePhone(apartmentInfo.getStorePhone());
        detailVO.setAddress(new StringBuilder().append(apartment.getDistrict()).append(apartment.getBlock()).append(apartment.getAddress()).toString());
        //公寓的图片
        String apartmentPictures = apartmentInfo.getApartmentPictures();
        String pictureId = apartmentPictures.split(",")[0];
        Picture picture = volgaPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
        detailVO.setImageUrl(picture.getUrl());
        Map<String, Integer> minMaxMap = findMinMaxPriceByApartment(apartment);
        detailVO.setMinPrice(minMaxMap.get("min"));
        detailVO.setMaxPrice(minMaxMap.get("max"));
        detailVO.setLatitude(apartment.getLatitude());
        detailVO.setLongitude(apartment.getLongitude());
        return detailVO;
    }

    //查询所有房型信息
    @Override
    public List<ConcentratedHouseTypeVO> findAllHouseTypes(Integer apartmentId) {
        List<ConcentratedHouseTypeVO> houseTypeVOS = new ArrayList<ConcentratedHouseTypeVO>();
        LayoutExample layoutExample = new LayoutExample();
        layoutExample.createCriteria().andIsDeleteEqualTo(false).andApartmentIdEqualTo(apartmentId);
        List<Layout> layouts = layoutMapper.selectByExample(layoutExample);
        for (Layout layout : layouts) {
            ConcentratedHouseTypeVO houseTypeVO = new ConcentratedHouseTypeVO();
            houseTypeVO.setLayoutId(layout.getId());
            houseTypeVO.setMinPrice(layout.getMonthrent());
            houseTypeVO.setMaxPrice(layout.getMaxmonthrent());
            houseTypeVO.setName(layout.getName());
            houseTypeVO.setInfo(new StringBuilder().append(layout.getRoomArea()).append("m² | ")
                    .append(layout.getBedroomnum()).append("室").append(layout.getLivingroomnum()).append("厅").toString());
            List<String> images = new ArrayList<>();
            String[] pictures = layout.getPicture().split(",");
            for (int i = 0; i < pictures.length; i++) {
                Picture picture = volgaPictureMapper.selectByPrimaryKey(Integer.valueOf(pictures[i]));
                images.add(picture.getUrl());
            }
            houseTypeVO.setImages(images);
            houseTypeVOS.add(houseTypeVO);
        }
        return houseTypeVOS;
    }

    //查询公寓下的配置
    @Override
    public RoomAssets findApartmentAssets(Integer apartmentId) {
        //公寓配置封装的对象
        RoomAssets roomAssets = new RoomAssets();
        LayoutExample layoutExample = new LayoutExample();
        layoutExample.createCriteria().andIsDeleteEqualTo(false).andApartmentIdEqualTo(apartmentId);
        List<Layout> layouts = layoutMapper.selectByExample(layoutExample);
        for (Layout layout : layouts) {
            String[] detailpointArr = layout.getDetailpoint().split(",");
            for (int i = 0; i < detailpointArr.length; i++) {
                String asset = detailpointArr[i];
                if (asset.equals(ApartmentAssetsEnum.BED.getCode())) {
                    roomAssets.setBed(true);
                } else if (asset.equals(ApartmentAssetsEnum.DESKS.getCode())) {
                    roomAssets.setDesks(true);
                } else if (asset.equals(ApartmentAssetsEnum.FRIDGE.getCode())) {
                    roomAssets.setFridge(true);
                } else if (asset.equals(ApartmentAssetsEnum.GAS.getCode())) {
                    roomAssets.setGas(true);
                } else if (asset.equals(ApartmentAssetsEnum.AIR_CONDITIONINGS.getCode())) {
                    roomAssets.setAirConditionings(true);
                } else if (asset.equals(ApartmentAssetsEnum.HEAT.getCode())) {
                    roomAssets.setHeat(true);
                } else if (asset.equals(ApartmentAssetsEnum.INDUCTION_COOKER.getCode())) {
                    roomAssets.setInductionCooker(true);
                } else if (asset.equals(ApartmentAssetsEnum.INTERNET.getCode())) {
                    roomAssets.setInternet(true);
                } else if (asset.equals(ApartmentAssetsEnum.KITCHENS.getCode())) {
                    roomAssets.setKitchens(true);
                } else if (asset.equals(ApartmentAssetsEnum.MICROWAVE.getCode())) {
                    roomAssets.setMicrowave(true);
                } else if (asset.equals(ApartmentAssetsEnum.SOFA.getCode())) {
                    roomAssets.setSofa(true);
                } else if (asset.equals(ApartmentAssetsEnum.TELEVISIONS.getCode())) {
                    roomAssets.setTelevisions(true);
                } else if (asset.equals(ApartmentAssetsEnum.WARDROBES.getCode())) {
                    roomAssets.setWardrobes(true);
                } else if (asset.equals(ApartmentAssetsEnum.WASHING_MACHINES.getCode())) {
                    roomAssets.setWashingMachines(true);
                } else if (asset.equals(ApartmentAssetsEnum.WATER_HEATERS.getCode())) {
                    roomAssets.setWaterHeaters(true);
                } else if (asset.equals(ApartmentAssetsEnum.TAG_TOILET.getCode())) {
                    roomAssets.setTagToilet(true);
                } else if (asset.equals(ApartmentAssetsEnum.WINDOWS.getCode())) {
                    roomAssets.setWindows(true);
                }
            }
        }
        return roomAssets;
    }

    //查询集中式和分散式相似房源(用户推荐与此房源价格浮动500元内，当前房源定位3公里内的其他房源)
    @Override
    public List<IndexHomeVO> findSimilarlyRooms(Integer apartmentId) {
        Apartment currentApartment = apartmentMapper.selectByPrimaryKey(apartmentId);
        Map<String, Integer> minMaxMap = findMinMaxPriceByApartment(currentApartment);
        Integer minPrice = minMaxMap.get("min");
        Integer maxPrice = minMaxMap.get("max");
        Integer managerWebId = DomainThreadLocal.getManagerWebId();
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        Integer userId = managerWeb.getCreateById();
        List<Integer> userIds = findUserIds(userId);
        //集中式和分散式房源整合页面对象
        List<IndexHomeVO> homeVOS = new ArrayList<IndexHomeVO>();
        //分散式相似房源
        findCaspainSimilarlyHomes(userIds, homeVOS, currentApartment, minPrice, maxPrice);
        //集中式相似房源
        findVolgaSimilarlyHomes(userIds, homeVOS, currentApartment, minPrice, maxPrice);
        Collections.sort(homeVOS, new Comparator<IndexHomeVO>() {
            @Override
            public int compare(IndexHomeVO o1, IndexHomeVO o2) {
                return o1.getRentStatus().compareTo(o2.getRentStatus());
            }
        });
        return homeVOS;
    }

    //分散式相似房源处理
    public void findCaspainSimilarlyHomes(List<Integer> userIds, List<IndexHomeVO> homeVOS, Apartment currentaApartment, Integer minPrice, Integer maxPrice) {
        //当前公寓的纬度
        String currentLatitude = currentaApartment.getLatitude();
        //当前公寓的经度
        String currentLongitude = currentaApartment.getLongitude();
        //当前房源所在城市
        String city = currentaApartment.getCity();
        com.web.business.model.caspain.OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new com.web.business.model.caspain.OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(caspainOpenchannelsShowroomsExample);
        Iterator<com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowroomsIterator = caspainOpenchannelsShowrooms.iterator();
        while (caspainOpenchannelsShowroomsIterator.hasNext()) {
            com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = caspainOpenchannelsShowroomsIterator.next();
            com.web.business.model.caspain.RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowrooms.getRawData());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            String latitude = house.getLatitude();
            String longitude = house.getLongitude();
            Double distance = BaiDuMapUtils.getDistanceFromHttp(currentLatitude + "," + currentLongitude, latitude + "," + longitude);
            if ((!house.getCity().equals(city)) || (distance > 3000)) {
                caspainOpenchannelsShowroomsIterator.remove();
            } else {
                if ((Math.abs(minPrice - roomWithBLOBs.getPrice()) < 500) || (Math.abs(maxPrice - roomWithBLOBs.getPrice()) < 500)) {
                    IndexHomeVO indexHomeVO = new IndexHomeVO();
                    indexHomeVO.setRoomId(roomWithBLOBs.getId());
                    indexHomeVO.setHomeType(HomeStructureTypeEnum.DISPERSED.getCode());
                    indexHomeVO.setHomeName(new StringBuilder().append(house.getArea()).
                            append(" ").append(rawDataJson.getInteger("bedrooms")).append("居 ").
                            append(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName()).toString());
                    indexHomeVO.setHomeInfo(new StringBuilder().append(roomWithBLOBs.getSpace()).append("㎡ | ").
                            append(house.getFloorNum()).append("/").append(house.getTotalFloorNum()).append("楼 | ").
                            append(rawDataJson.getInteger("bedrooms")).append("室").append(rawDataJson.getInteger("livingrooms")).append("厅").toString());
                    indexHomeVO.setHomePrice(new StringBuilder().append(roomWithBLOBs.getPrice()).append("元/月").toString());
                    String pictures = rawDataJson.getString("pictures");
                    String pictureId = pictures.split(",")[0];
                    com.web.business.model.caspain.Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
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
    }

    //集中式相似房源处理
    public void findVolgaSimilarlyHomes(List<Integer> userIds, List<IndexHomeVO> homeVOS, Apartment currentaApartment, Integer currentMinPrice, Integer currentMaxPrice) {
        //当前公寓的纬度
        String currentLatitude = currentaApartment.getLatitude();
        //当前公寓的经度
        String currentLongitude = currentaApartment.getLongitude();
        //当前公寓所在城市
        String city = currentaApartment.getCity();
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(volgaOpenchannelsShowroomsExample);
        Iterator<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowroomsIterator = volgaOpenchannelsShowrooms.iterator();
        while (volgaOpenchannelsShowroomsIterator.hasNext()) {
            com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = volgaOpenchannelsShowroomsIterator.next();
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            if (!currentaApartment.getId().equals(apartment.getId())) {
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
                    //该公寓距离该公寓在三公里之内
                    if ((distance <= 3000)) {
                        //计算该公寓下出房房间价格的最小值，最大值
                        Map<String, Integer> minMaxMap = findMinMaxPriceByApartment(apartment);
                        Integer minPrice = minMaxMap.get("min");
                        Integer maxPrice = minMaxMap.get("max");
                        //计算当前房间的价格和集中式中房间价格最小值，最大值的差别是是500之内的
                        if ((Math.abs(minPrice - currentMinPrice) < 500) || (Math.abs(maxPrice - currentMaxPrice) < 500)) {
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
}
