package com.web.business.page.website;

import lombok.Data;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class DispersedRoomDetailVO {
    //房间id
    private Integer id;
    //出租方式(整租，合租)
    private String rentWay;
    //房源名称
    private String houseName;
    //房间标签(独立阳台等)
    private List<String> roomTages;
    //房间价格
    private String price;
    //房间地址
    private String address;
    //房源户型
    private String houseType;
    //房间大小(单位 平方米)
    private String space;
    //楼层信息
    private String floorInfo;
    //朝向
    private String toward;
    //风格
    private String style;
    //图片
    private List<String> imageUrls;
    //房源纬度
    private String latitude;
    //房源经度
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRentWay() {
        return rentWay;
    }

    public void setRentWay(String rentWay) {
        this.rentWay = rentWay;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public List<String> getRoomTages() {
        return roomTages;
    }

    public void setRoomTages(List<String> roomTages) {
        this.roomTages = roomTages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getFloorInfo() {
        return floorInfo;
    }

    public void setFloorInfo(String floorInfo) {
        this.floorInfo = floorInfo;
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

}
