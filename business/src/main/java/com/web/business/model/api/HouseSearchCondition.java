package com.web.business.model.api;

import lombok.Data;

@Data
public class HouseSearchCondition {
    //网站配置ID
    private Integer managerWebId;
    //城市
    private String city;
    //商圈
    private String block;
    //区域
    private String district;
    //地铁站
    private String subway;
    //地铁站（经度坐标）
    private String subwayLong;
    //地铁站（纬度坐标）
    private String subwayLat;
    //户型
    private String roomNum;
    //价格(top)
    private Double priceTop;
    //价格(low)
    private Double priceLow;
    //面积(top)
    private Short spaceTop;
    //面积(low)
    private Short spaceLow;
    //楼层
    private Short floorNum;
    //朝向
    private String toward;
    //房屋配置
    private String[] roomConfig;
    //主题公寓
    private String apartmentType;
}
