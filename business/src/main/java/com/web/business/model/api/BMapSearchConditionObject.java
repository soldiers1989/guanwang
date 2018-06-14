package com.web.business.model.api;

import lombok.Data;

@Data
public class BMapSearchConditionObject {
    //地址
    private String address;
    //小区名称
    private String houseName;
    //朝向
    private String toward;
    //面积
    private Double space;
    //楼层
    private String floorNum;
    //房间数(户型)
    private Short roomNum;
    //出租方式
    private String rent;
    //租金
    private Double price;
    //房间类型(1.公寓  2.公寓)
    private Integer roomType;
}
