package com.web.business.service.website.impl;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.*;
import com.web.business.dao.volga.ApartmentInfoMapper;
import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.enums.*;
import com.web.business.model.caspain.*;
import com.web.business.model.volga.Apartment;
import com.web.business.model.volga.ApartmentInfoExample;
import com.web.business.model.volga.ApartmentInfoWithBLOBs;
import com.web.business.page.website.IndexHomeVO;
import com.web.business.page.website.IndexManagerModelVO;
import com.web.business.page.website.IndexVO;
import com.web.business.service.website.IndexService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    public ManagerArticleMapper managerArticleMapper;
    @Resource
    public ManagerNavigationMapper managerNavigationMapper;
    @Resource
    public ManagerModelImageMapper managerModelImageMapper;
    @Resource
    public ManagerModelArticleMapper managerModelArticleMapper;
    @Resource
    public ManagerModelHomesourceMapper managerModelHomesourceMapper;
    @Resource
    public ManagerModelMapper managerModelMapper;
    @Resource
    public ManagerWebMapper managerWebMapper;
    @Resource
    public UserProfileMapper userProfileMapper;
    @Resource
    public EmployerMapper employerMapper;
    @Resource(name = "caspainOpenchannelsShowroomsMapper")
    public OpenchannelsShowroomsMapper caspainOpenchannelsShowroomsMapper;
    @Resource(name = "volgaOpenchannelsShowroomsMapper")
    public com.web.business.dao.volga.OpenchannelsShowroomsMapper volgaOpenchannelsShowroomsMapper;
    @Resource(name = "caspainRoomMapper")
    public RoomMapper caspainRoomMapper;
    @Resource(name = "volgaRoomMapper")
    public com.web.business.dao.volga.RoomMapper volgaRoomMapper;
    @Resource(name = "caspainPictureMapper")
    public PictureMapper caspainPictureMapper;
    @Resource(name = "volgaPictureMapper")
    public com.web.business.dao.volga.PictureMapper volgaPictureMapper;
    @Resource
    public HouseMapper houseMapper;
    @Resource
    public ApartmentMapper apartmentMapper;
    @Resource
    public ApartmentInfoMapper apartmentInfoMapper;

    @Override
    public IndexVO findHeadIndexVO(String city, IndexVO indexVO, Integer managerWebId) {
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        Integer userId = managerWeb.getCreateById();
        //查询首页导航城市信息
        findIndexCitiesInformation(city, indexVO, userId);
        ManagerNavigationExample navigationExample = new ManagerNavigationExample();
        navigationExample.createCriteria().andMagagerWebIdEqualTo(managerWebId).andIsDeletedEqualTo(0)
                .andNavigationStatusEqualTo(1).andNavigationPlaceEqualTo(NavigationPlaceEnum.HEAD.getCode());
        navigationExample.setOrderByClause("navigation_sort asc");
        List<ManagerNavigation> managerNavigations = managerNavigationMapper.selectByExample(navigationExample);
        indexVO.setManagerWeb(managerWeb);
        indexVO.setHeadManagerNavigations(managerNavigations);
        return indexVO;
    }

    //查询首页导航城市信息
    public void findIndexCitiesInformation(String city, IndexVO indexVO, Integer userId) {
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        LinkedHashSet<String> cities = new LinkedHashSet<String>();
        //首页根据城市查询整个官网首页
        if (city != null) {
            cities.add(city);
        }
        //分散式查询出房
        OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<OpenchannelsShowrooms> caspainOpenchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExample(caspainOpenchannelsShowroomsExample);
        for (OpenchannelsShowrooms openchannelsShowroom : caspainOpenchannelsShowrooms) {
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            cities.add(house.getCity());
        }
        //集中式查询出房
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        List<com.web.business.model.volga.OpenchannelsShowrooms> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExample(volgaOpenchannelsShowroomsExample);
        for (com.web.business.model.volga.OpenchannelsShowrooms openchannelsShowroom : volgaOpenchannelsShowrooms) {
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowroom.getRoomId());
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            cities.add(apartment.getCity());
        }
        indexVO.setCities(cities);
    }

    @Override
    public IndexVO findTailIndexVO(IndexVO indexVO, Integer managerWebId) {
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        ManagerNavigationExample navigationExample = new ManagerNavigationExample();
        navigationExample.createCriteria().andMagagerWebIdEqualTo(managerWebId).andIsDeletedEqualTo(0)
                .andNavigationStatusEqualTo(1).andNavigationPlaceEqualTo(NavigationPlaceEnum.TAIL.getCode());
        navigationExample.setOrderByClause("navigation_sort asc");
        List<ManagerNavigation> managerNavigations = managerNavigationMapper.selectByExample(navigationExample);
        indexVO.setManagerWeb(managerWeb);
        indexVO.setTailManagerNavigations(managerNavigations);
        return indexVO;
    }


    @Override
    public IndexVO findMiddleIndexVO(String city, IndexVO indexVO, Integer managerWebId) {
        List<IndexManagerModelVO> managerModelVOs = new ArrayList<IndexManagerModelVO>();
        ManagerWeb managerWeb = managerWebMapper.selectByPrimaryKey(managerWebId);
        //获得主账户的userId
        Integer userId = managerWeb.getCreateById();
        //查询该网站下的模块配置
        ManagerModelExample managerModelExample = new ManagerModelExample();
        managerModelExample.createCriteria().andManagerWebIdEqualTo(managerWebId).andIsDeleteEqualTo(0)
                .andModelStatusEqualTo(1);
        managerModelExample.setOrderByClause("model_sort asc");
        List<ManagerModel> managerModels = managerModelMapper.selectByExample(managerModelExample);
        for (ManagerModel managerModel : managerModels) {
            IndexManagerModelVO indexManagerModelVO = new IndexManagerModelVO();
            ManagerModelTypeEnum type = ManagerModelTypeEnum.getByCode(managerModel.getModelType());
            switch (type) {
                case INDEXPAGE:
                    findIndexPageOrImageModel(managerModel, indexManagerModelVO);
                    break;
                case HOMESOURCE:
                    findHomeSourceModel(city, managerModel, indexManagerModelVO, userId);
                    break;
                case ARTICLE:
                    findArticleModel(managerModel, indexManagerModelVO);
                    break;
                case IMAGE:
                    findIndexPageOrImageModel(managerModel, indexManagerModelVO);
                    break;
                default:
            }
            managerModelVOs.add(indexManagerModelVO);
        }
        indexVO.setManagerModelVOs(managerModelVOs);
        return indexVO;
    }


    //模块类型是首页轮显或者图片
    public void findIndexPageOrImageModel(ManagerModel managerModel, IndexManagerModelVO indexManagerModelVO) {
        //是否显示标题和副标题
        Integer titleShow = managerModel.getTitleShow();
        if (titleShow == 1) {
            indexManagerModelVO.setManagerModelTitle(managerModel.getModelName());
            indexManagerModelVO.setManagerModelSubTitle(managerModel.getSubheadName());
        }
        Integer managerModelId = managerModel.getId();
        ManagerModelImageExample managerModelImageExample = new ManagerModelImageExample();
        managerModelImageExample.createCriteria().andIsDeleteEqualTo(0).andModelTypeIdEqualTo(managerModelId);
        managerModelImageExample.setOrderByClause("image_sort asc");
        List<ManagerModelImage> managerModelImages = managerModelImageMapper.selectByExample(managerModelImageExample);
        indexManagerModelVO.setImageShowWay(managerModelImages.get(0).getShowWay());
        indexManagerModelVO.setManagerModelImages(managerModelImages);
    }

    //模块类型是房源
    public void findHomeSourceModel(String city, ManagerModel managerModel, IndexManagerModelVO indexManagerModelVO, Integer userId) {
        //是否显示模块标题和副标题
        Integer titleShow = managerModel.getTitleShow();
        if (titleShow == 1) {
            indexManagerModelVO.setManagerModelTitle(managerModel.getModelName());
            indexManagerModelVO.setManagerModelSubTitle(managerModel.getSubheadName());
        }
        //获取模块的主键Id
        Integer managerModelId = managerModel.getId();
        ManagerModelHomesourceExample managerModelHomesourceExample = new ManagerModelHomesourceExample();
        managerModelHomesourceExample.createCriteria().andIsDeleteEqualTo(0).andModelTypeIdEqualTo(managerModelId);
        //房源的设置
        ManagerModelHomesource managerModelHomesource = managerModelHomesourceMapper.selectByExample(managerModelHomesourceExample).get(0);
        indexManagerModelVO.setIndexHomeNum(managerModelHomesource.getShowNum());
        //首页房源展示逻辑
        Integer showLogic = managerModelHomesource.getShowLogic();
        //首页房源展示数量
        Integer showNum = managerModelHomesource.getShowNum();
        //根据主账号的userId查询主账号和子账号的userId
        List<Integer> userIds = findUserIds(userId);
        List<IndexHomeVO> homeVOS = new ArrayList<IndexHomeVO>();
        //区域内最新房源
        if (HomeSourceSettingShowLogicEnum.AREA_NEW.getCode() == showLogic) {
            //分散式处理首页房源模块首页展示
            findCaspainIndexHomes(city, showNum, userIds, homeVOS);
            //集中式处理首页房源模块首页展示
            findVolgaIndexHomes(city, showNum, userIds, homeVOS);
            //分散式和集中式房源模块数据排序（先根据发房时间排序）
            Collections.sort(homeVOS, new Comparator<IndexHomeVO>() {
                @Override
                public int compare(IndexHomeVO o1, IndexHomeVO o2) {
                    return (int) (o2.getPublishTime().getTime() - o1.getPublishTime().getTime());
                }
            });
            //分散式和集中式房源模块数据排序（再根据房间出租状态排序）
            Collections.sort(homeVOS, new Comparator<IndexHomeVO>() {
                @Override
                public int compare(IndexHomeVO o1, IndexHomeVO o2) {
                    return o1.getRentStatus().compareTo(o2.getRentStatus());
                }
            });
            if (homeVOS.size() > showNum) {
                indexManagerModelVO.setHomeVOS(homeVOS.subList(0, showNum));
            } else {
                indexManagerModelVO.setHomeVOS(homeVOS);
            }
            //区域内访问量最多房源
        } else if (HomeSourceSettingShowLogicEnum.AREA_BROWSE_MAX.getCode() == showLogic) {

            //区域内推荐到首页房源
        } else {

        }
    }

    //分散式房源模块房源处理(展示逻辑是区域内最新)
    public void findCaspainIndexHomes(String city, Integer showNum, List<Integer> userIds, List<IndexHomeVO> homeVOS) {
        OpenchannelsShowroomsExample caspainOpenchannelsShowroomsExample = new OpenchannelsShowroomsExample();
        caspainOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIdIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        caspainOpenchannelsShowroomsExample.setOrderByClause("updated_at desc");
        List<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowrooms = caspainOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(caspainOpenchannelsShowroomsExample);
        Iterator<OpenchannelsShowroomsWithBLOBs> caspainOpenchannelsShowroomsIterator = caspainOpenchannelsShowrooms.iterator();
        while (caspainOpenchannelsShowroomsIterator.hasNext()) {
            OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = caspainOpenchannelsShowroomsIterator.next();
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowrooms.getRawData());
            House house = houseMapper.selectByPrimaryKey(roomWithBLOBs.getHouseId());
            if (!house.getCity().equals(city)) {
                caspainOpenchannelsShowroomsIterator.remove();
            } else {
                IndexHomeVO indexHomeVO = new IndexHomeVO();
                indexHomeVO.setRoomId(roomWithBLOBs.getId());
                indexHomeVO.setHomeType(HomeStructureTypeEnum.DISPERSED.getCode());
                indexHomeVO.setHomeName(new StringBuilder().append(house.getArea()).
                        append(" ").append(rawDataJson.getInteger("bedrooms")).append("居 ").
                        append(RoomTowardEnum.getByCode(roomWithBLOBs.getToward()).getName()).toString());
                indexHomeVO.setHomeInfo(new StringBuilder().append(roomWithBLOBs.getSpace()).append("㎡ | ").
                        append(house.getFloorNum()).append("/").append(house.getTotalFloorNum()).append("楼 | ").
                        append(rawDataJson.getInteger("bedrooms")).append("室").append(rawDataJson.getInteger("livingrooms")).append("厅").toString());
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

    //集中式房源模块房源处理(展示逻辑是区域内最新)
    public void findVolgaIndexHomes(String city, Integer showNum, List<Integer> userIds, List<IndexHomeVO> homeVOS) {
        com.web.business.model.volga.OpenchannelsShowroomsExample volgaOpenchannelsShowroomsExample = new com.web.business.model.volga.OpenchannelsShowroomsExample();
        volgaOpenchannelsShowroomsExample.createCriteria().andIsDeleteEqualTo(false).andCreatedByIn(userIds)
                .andStatusBetween((short) 1, (short) 3);
        volgaOpenchannelsShowroomsExample.setOrderByClause("updated_at desc");
        List<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowrooms = volgaOpenchannelsShowroomsMapper.selectByExampleWithBLOBs(volgaOpenchannelsShowroomsExample);
        Iterator<com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs> volgaOpenchannelsShowroomsIterator = volgaOpenchannelsShowrooms.iterator();
        while (volgaOpenchannelsShowroomsIterator.hasNext()) {
            com.web.business.model.volga.OpenchannelsShowroomsWithBLOBs openchannelsShowrooms = volgaOpenchannelsShowroomsIterator.next();
            com.web.business.model.volga.RoomWithBLOBs roomWithBLOBs = volgaRoomMapper.selectByPrimaryKey(openchannelsShowrooms.getRoomId());
            Apartment apartment = apartmentMapper.selectByPrimaryKey(roomWithBLOBs.getApartmentId());
            if (!apartment.getCity().equals(city)) {
                volgaOpenchannelsShowroomsIterator.remove();
            } else {
                boolean flag = false;
                for (IndexHomeVO homeVO : homeVOS) {
                    if (homeVO.getHomeType().equals(HomeStructureTypeEnum.CONCENTRATE.getCode()) && homeVO.getApartmentId().equals(apartment.getId())) {
                        flag = true;
                        Integer price = homeVO.getPrice();
                        if (price > roomWithBLOBs.getPrice()) {
                            homeVO.setHomePrice(new StringBuilder().append(roomWithBLOBs.getPrice().intValue()).append("元/每月起").toString());
                            homeVO.setPrice(roomWithBLOBs.getPrice().intValue());
                        }
                        if (homeVO.getRentStatus().equals(RoomRentStatusEnum.RENTED.getCode()) && roomWithBLOBs.getRentStatus().equals(RoomRentStatusEnum.EMPTY.getCode())) {
                            homeVO.setRentStatus(RoomRentStatusEnum.EMPTY.getCode());
                        }
                        break;
                    }
                }
                if (!flag) {
                    IndexHomeVO indexHomeVO = new IndexHomeVO();
                    indexHomeVO.setApartmentId(apartment.getId());
                    indexHomeVO.setHomeType(HomeStructureTypeEnum.CONCENTRATE.getCode());
                    indexHomeVO.setHomeName(apartment.getName());
                    indexHomeVO.setHomeInfo(new StringBuilder().append(apartment.getDistrict()).append(apartment.getBlock()).append(apartment.getAddress()).toString());
                    indexHomeVO.setHomePrice(new StringBuilder().append(roomWithBLOBs.getPrice().intValue()).append("元/每月起").toString());
                    indexHomeVO.setPrice(roomWithBLOBs.getPrice().intValue());
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

    //根据主账号的userId查询员工的userId和主账号userid
    public List<Integer> findUserIds(Integer userId) {
        UserProfileExample userProfileExample = new UserProfileExample();
        userProfileExample.createCriteria().andUserIdEqualTo(userId).andIsDeleteEqualTo(false);
        UserProfile userProfile = userProfileMapper.selectByExample(userProfileExample).get(0);
        EmployerExample employerExample = new EmployerExample();
        employerExample.createCriteria().andIsDeleteEqualTo(false).andBossIdEqualTo(userProfile.getId());
        List<Integer> userIds = employerMapper.selectUserIdsByExample(employerExample);
        userIds.add(userId);
        return userIds;
    }

    //模块类型是文章
    public void findArticleModel(ManagerModel managerModel, IndexManagerModelVO indexManagerModelVO) {
        //是否显示模块标题和副标题
        Integer titleShow = managerModel.getTitleShow();
        if (titleShow == 1) {
            indexManagerModelVO.setManagerModelTitle(managerModel.getModelName());
            indexManagerModelVO.setManagerModelSubTitle(managerModel.getSubheadName());
        }
        //获取模块的主键Id
        Integer managerModelId = managerModel.getId();
        //获取网站设置的主键Id
        Integer managerWebId = managerModel.getManagerWebId();
        //获取文章模块的设置
        ManagerModelArticleExample managerModelArticleExample = new ManagerModelArticleExample();
        managerModelArticleExample.createCriteria().andIsDeleteEqualTo(0).andModelTypeIdEqualTo(managerModelId);
        ManagerModelArticle managerModelArticle = managerModelArticleMapper.selectByExample(managerModelArticleExample).get(0);
        //设置网站首页文章模块的显示方式(1.左右结构。2.列表)
        indexManagerModelVO.setArticleShowWay(managerModelArticle.getShowWay());
        //获取文章类型的Id
        Integer articleTypeId = managerModelArticle.getArticleTypeId();
        ManagerArticleExample managerArticleExample = new ManagerArticleExample();
        managerArticleExample.createCriteria().andIsDeleteEqualTo(0).andManagerWebIdEqualTo(managerWebId)
                .andArticleTypeIdEqualTo(articleTypeId).andArticleStatusEqualTo(1);
        if (ArticleShowLogicEnum.NEWARTICLE.getCode() == managerModelArticle.getShowLogic()) {
            managerArticleExample.setOrderByClause("created_at desc");
        } else {
            managerArticleExample.createCriteria().andHomePageEqualTo(1);
        }
        managerArticleExample.setLimitStart(0);
        managerArticleExample.setPageSize(3);
        List<ManagerArticle> managerArticles = managerArticleMapper.selectByExample(managerArticleExample);
        indexManagerModelVO.setManagerArticles(managerArticles);
    }


}
