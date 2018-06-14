package com.web.business.model.volga;

import java.io.Serializable;
import java.util.Date;

public class Layout implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private Integer version;

    private Boolean isDelete;

    private Integer apartmentId;

    private String name;

    private Integer operatorId;

    private Integer monthrent;

    private Integer maxmonthrent;

    private String rentpaytype;

    private Integer bedroomnum;

    private Integer livingroomnum;

    private Integer toiletnum;

    private String facetotype;

    private String featuretag;

    private String detailpoint;

    private String agentphone;

    private String agentname;

    private Integer roomArea;

    private String picture;

    private String housedesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Integer deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getMonthrent() {
        return monthrent;
    }

    public void setMonthrent(Integer monthrent) {
        this.monthrent = monthrent;
    }

    public Integer getMaxmonthrent() {
        return maxmonthrent;
    }

    public void setMaxmonthrent(Integer maxmonthrent) {
        this.maxmonthrent = maxmonthrent;
    }

    public String getRentpaytype() {
        return rentpaytype;
    }

    public void setRentpaytype(String rentpaytype) {
        this.rentpaytype = rentpaytype == null ? null : rentpaytype.trim();
    }

    public Integer getBedroomnum() {
        return bedroomnum;
    }

    public void setBedroomnum(Integer bedroomnum) {
        this.bedroomnum = bedroomnum;
    }

    public Integer getLivingroomnum() {
        return livingroomnum;
    }

    public void setLivingroomnum(Integer livingroomnum) {
        this.livingroomnum = livingroomnum;
    }

    public Integer getToiletnum() {
        return toiletnum;
    }

    public void setToiletnum(Integer toiletnum) {
        this.toiletnum = toiletnum;
    }

    public String getFacetotype() {
        return facetotype;
    }

    public void setFacetotype(String facetotype) {
        this.facetotype = facetotype == null ? null : facetotype.trim();
    }

    public String getFeaturetag() {
        return featuretag;
    }

    public void setFeaturetag(String featuretag) {
        this.featuretag = featuretag == null ? null : featuretag.trim();
    }

    public String getDetailpoint() {
        return detailpoint;
    }

    public void setDetailpoint(String detailpoint) {
        this.detailpoint = detailpoint == null ? null : detailpoint.trim();
    }

    public String getAgentphone() {
        return agentphone;
    }

    public void setAgentphone(String agentphone) {
        this.agentphone = agentphone == null ? null : agentphone.trim();
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname == null ? null : agentname.trim();
    }

    public Integer getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Integer roomArea) {
        this.roomArea = roomArea;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getHousedesc() {
        return housedesc;
    }

    public void setHousedesc(String housedesc) {
        this.housedesc = housedesc == null ? null : housedesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", deletedBy=").append(deletedBy);
        sb.append(", version=").append(version);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", apartmentId=").append(apartmentId);
        sb.append(", name=").append(name);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", monthrent=").append(monthrent);
        sb.append(", maxmonthrent=").append(maxmonthrent);
        sb.append(", rentpaytype=").append(rentpaytype);
        sb.append(", bedroomnum=").append(bedroomnum);
        sb.append(", livingroomnum=").append(livingroomnum);
        sb.append(", toiletnum=").append(toiletnum);
        sb.append(", facetotype=").append(facetotype);
        sb.append(", featuretag=").append(featuretag);
        sb.append(", detailpoint=").append(detailpoint);
        sb.append(", agentphone=").append(agentphone);
        sb.append(", agentname=").append(agentname);
        sb.append(", roomArea=").append(roomArea);
        sb.append(", picture=").append(picture);
        sb.append(", housedesc=").append(housedesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}