package com.web.business.model.volga;

import java.io.Serializable;
import java.util.Date;

public class Room implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private Integer version;

    private Boolean isDelete;

    private String name;

    private Double space;

    private String rentStatus;

    private Date lockEndTime;

    private String identifier;

    private Boolean edited;

    private String toward;

    private Integer apartmentId;

    private Integer floorId;

    private Integer operatorId;

    private Date canRentDate;

    private Double price;

    private Short roomType;

    private Integer assetsId;

    private Short channelStatus;

    private Short decoration;

    private String picturesOrder;

    private Integer layoutId;

    private Integer synchronous;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getSpace() {
        return space;
    }

    public void setSpace(Double space) {
        this.space = space;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus == null ? null : rentStatus.trim();
    }

    public Date getLockEndTime() {
        return lockEndTime;
    }

    public void setLockEndTime(Date lockEndTime) {
        this.lockEndTime = lockEndTime;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward == null ? null : toward.trim();
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Date getCanRentDate() {
        return canRentDate;
    }

    public void setCanRentDate(Date canRentDate) {
        this.canRentDate = canRentDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Short getRoomType() {
        return roomType;
    }

    public void setRoomType(Short roomType) {
        this.roomType = roomType;
    }

    public Integer getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(Integer assetsId) {
        this.assetsId = assetsId;
    }

    public Short getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(Short channelStatus) {
        this.channelStatus = channelStatus;
    }

    public Short getDecoration() {
        return decoration;
    }

    public void setDecoration(Short decoration) {
        this.decoration = decoration;
    }

    public String getPicturesOrder() {
        return picturesOrder;
    }

    public void setPicturesOrder(String picturesOrder) {
        this.picturesOrder = picturesOrder == null ? null : picturesOrder.trim();
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public Integer getSynchronous() {
        return synchronous;
    }

    public void setSynchronous(Integer synchronous) {
        this.synchronous = synchronous;
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
        sb.append(", name=").append(name);
        sb.append(", space=").append(space);
        sb.append(", rentStatus=").append(rentStatus);
        sb.append(", lockEndTime=").append(lockEndTime);
        sb.append(", identifier=").append(identifier);
        sb.append(", edited=").append(edited);
        sb.append(", toward=").append(toward);
        sb.append(", apartmentId=").append(apartmentId);
        sb.append(", floorId=").append(floorId);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", canRentDate=").append(canRentDate);
        sb.append(", price=").append(price);
        sb.append(", roomType=").append(roomType);
        sb.append(", assetsId=").append(assetsId);
        sb.append(", channelStatus=").append(channelStatus);
        sb.append(", decoration=").append(decoration);
        sb.append(", picturesOrder=").append(picturesOrder);
        sb.append(", layoutId=").append(layoutId);
        sb.append(", synchronous=").append(synchronous);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}