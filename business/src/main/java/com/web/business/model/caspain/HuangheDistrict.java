package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class HuangheDistrict implements Serializable {
    private Integer id;

    private String objectId;

    private String city;

    private String geoLat;

    private String geoLng;

    private Date updatedAt;

    private String district;

    private String indexUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getGeoLat() {
        return geoLat;
    }

    public void setGeoLat(String geoLat) {
        this.geoLat = geoLat == null ? null : geoLat.trim();
    }

    public String getGeoLng() {
        return geoLng;
    }

    public void setGeoLng(String geoLng) {
        this.geoLng = geoLng == null ? null : geoLng.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getIndexUrl() {
        return indexUrl;
    }

    public void setIndexUrl(String indexUrl) {
        this.indexUrl = indexUrl == null ? null : indexUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", objectId=").append(objectId);
        sb.append(", city=").append(city);
        sb.append(", geoLat=").append(geoLat);
        sb.append(", geoLng=").append(geoLng);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", district=").append(district);
        sb.append(", indexUrl=").append(indexUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}