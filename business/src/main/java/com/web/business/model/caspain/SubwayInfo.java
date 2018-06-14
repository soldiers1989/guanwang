package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class SubwayInfo implements Serializable {
    private Integer id;

    private String cityName;

    private Integer cityCode;

    private String subwayLine;

    private String subwayStation;

    private String staLongitude;

    private String staLatitude;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getSubwayLine() {
        return subwayLine;
    }

    public void setSubwayLine(String subwayLine) {
        this.subwayLine = subwayLine == null ? null : subwayLine.trim();
    }

    public String getSubwayStation() {
        return subwayStation;
    }

    public void setSubwayStation(String subwayStation) {
        this.subwayStation = subwayStation == null ? null : subwayStation.trim();
    }

    public String getStaLongitude() {
        return staLongitude;
    }

    public void setStaLongitude(String staLongitude) {
        this.staLongitude = staLongitude == null ? null : staLongitude.trim();
    }

    public String getStaLatitude() {
        return staLatitude;
    }

    public void setStaLatitude(String staLatitude) {
        this.staLatitude = staLatitude == null ? null : staLatitude.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityName=").append(cityName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", subwayLine=").append(subwayLine);
        sb.append(", subwayStation=").append(subwayStation);
        sb.append(", staLongitude=").append(staLongitude);
        sb.append(", staLatitude=").append(staLatitude);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}