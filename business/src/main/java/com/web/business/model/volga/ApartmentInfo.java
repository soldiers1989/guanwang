package com.web.business.model.volga;

import java.io.Serializable;
import java.util.Date;

public class ApartmentInfo implements Serializable {
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

    private Boolean hasLift;

    private String storeName;

    private String storePhone;

    private String rentRequire;

    private String roomAssets;

    private String apartmentPictures;

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

    public Boolean getHasLift() {
        return hasLift;
    }

    public void setHasLift(Boolean hasLift) {
        this.hasLift = hasLift;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getRentRequire() {
        return rentRequire;
    }

    public void setRentRequire(String rentRequire) {
        this.rentRequire = rentRequire == null ? null : rentRequire.trim();
    }

    public String getRoomAssets() {
        return roomAssets;
    }

    public void setRoomAssets(String roomAssets) {
        this.roomAssets = roomAssets == null ? null : roomAssets.trim();
    }

    public String getApartmentPictures() {
        return apartmentPictures;
    }

    public void setApartmentPictures(String apartmentPictures) {
        this.apartmentPictures = apartmentPictures == null ? null : apartmentPictures.trim();
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
        sb.append(", hasLift=").append(hasLift);
        sb.append(", storeName=").append(storeName);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", rentRequire=").append(rentRequire);
        sb.append(", roomAssets=").append(roomAssets);
        sb.append(", apartmentPictures=").append(apartmentPictures);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}