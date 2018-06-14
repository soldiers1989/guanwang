package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class HuangheArea implements Serializable {
    private Integer id;

    private String objectId;

    private String ename;

    private String name;

    private String url;

    private Boolean isDone;

    private Date updatedAt;

    private String parentUrl;

    private String city;

    private String district;

    private String block;

    private String address;

    private String geoLat;

    private String geoLng;

    private Boolean is404;

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

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getParentUrl() {
        return parentUrl;
    }

    public void setParentUrl(String parentUrl) {
        this.parentUrl = parentUrl == null ? null : parentUrl.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block == null ? null : block.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Boolean getIs404() {
        return is404;
    }

    public void setIs404(Boolean is404) {
        this.is404 = is404;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", objectId=").append(objectId);
        sb.append(", ename=").append(ename);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", isDone=").append(isDone);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", parentUrl=").append(parentUrl);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", block=").append(block);
        sb.append(", address=").append(address);
        sb.append(", geoLat=").append(geoLat);
        sb.append(", geoLng=").append(geoLng);
        sb.append(", is404=").append(is404);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}