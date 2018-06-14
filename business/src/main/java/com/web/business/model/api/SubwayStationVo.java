package com.web.business.model.api;

import java.io.Serializable;


public class SubwayStationVo implements Serializable {
    //主键
    private Integer id;
    //地铁站
    private String subwayStation;
    //经度
    private String staLongitude;
    //纬度
    private String staLatitude;

    public Integer getId() {
        return id;
    }

    public String getSubwayStation() {
        return subwayStation;
    }

    public String getStaLongitude() {
        return staLongitude;
    }

    public String getStaLatitude() {
        return staLatitude;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSubwayStation(String subwayStation) {
        this.subwayStation = subwayStation;
    }

    public void setStaLongitude(String staLongitude) {
        this.staLongitude = staLongitude;
    }

    public void setStaLatitude(String staLatitude) {
        this.staLatitude = staLatitude;
    }

    @Override
    public String toString() {
        return "SubwayStationVo{" +
                "id=" + id +
                ", subwayStation='" + subwayStation + '\'' +
                ", staLongitude='" + staLongitude + '\'' +
                ", staLatitude='" + staLatitude + '\'' +
                '}';
    }
}
