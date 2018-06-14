package com.web.business.page.website;

import lombok.Data;

import java.util.Date;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
public class IndexHomeVO {
    //房屋类型(0是集中，1是分散)
    private Integer homeType;
    //分散式(房间Id)
    private Integer roomId;
    //集中式(公寓Id)
    private Integer apartmentId;
    //房源名称
    private String homeName;
    //房源信息
    private String homeInfo;
    //房源价格（页面）
    private String homePrice;
    //房源价格
    private Integer price;
    //房源图片地址
    private String homeImageUrl;
    //房间出租状态(empty:空置,rented:出租)
    private String rentStatus;
    //房源图片的链接地址
    private String homeImageLinkUrl;
    //房源的发布成功的时间
    private Date publishTime;

    public IndexHomeVO(Integer homeType, Integer roomId, Integer apartmentId, String homeName, String homeInfo, String homePrice, Integer price, String homeImageUrl, String homeImageLinkUrl, Date publishTime) {
        this.homeType = homeType;
        this.roomId = roomId;
        this.apartmentId = apartmentId;
        this.homeName = homeName;
        this.homeInfo = homeInfo;
        this.homePrice = homePrice;
        this.price = price;
        this.homeImageUrl = homeImageUrl;
        this.homeImageLinkUrl = homeImageLinkUrl;
        this.publishTime = publishTime;
    }

    public IndexHomeVO() {

    }
    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getHomeType() {
        return homeType;
    }

    public void setHomeType(Integer homeType) {
        this.homeType = homeType;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(String homeInfo) {
        this.homeInfo = homeInfo;
    }

    public String getHomePrice() {
        return homePrice;
    }

    public void setHomePrice(String homePrice) {
        this.homePrice = homePrice;
    }

    public String getHomeImageUrl() {
        return homeImageUrl;
    }

    public void setHomeImageUrl(String homeImageUrl) {
        this.homeImageUrl = homeImageUrl;
    }

    public String getHomeImageLinkUrl() {
        return homeImageLinkUrl;
    }

    public void setHomeImageLinkUrl(String homeImageLinkUrl) {
        this.homeImageLinkUrl = homeImageLinkUrl;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
