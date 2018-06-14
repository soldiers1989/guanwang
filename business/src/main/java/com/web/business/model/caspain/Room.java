package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class Room implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private Boolean isDelete;

    private String name;

    private Double space;

    private String rentStatus;

    private Date lockEndTime;

    private String identifier;

    private Boolean edited;

    private Double price;

    private Integer assetsId;

    private Integer createdById;

    private Integer deletedById;

    private Integer houseId;

    private Integer updatedById;

    private Integer payMethodF;

    private Integer payMethodY;

    private String toward;

    private Date canRentDate;

    private Short roomType;

    private Short channelStatus;

    private Short decoration;

    private String picturesOrder;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(Integer assetsId) {
        this.assetsId = assetsId;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Integer getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Integer deletedById) {
        this.deletedById = deletedById;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Integer getPayMethodF() {
        return payMethodF;
    }

    public void setPayMethodF(Integer payMethodF) {
        this.payMethodF = payMethodF;
    }

    public Integer getPayMethodY() {
        return payMethodY;
    }

    public void setPayMethodY(Integer payMethodY) {
        this.payMethodY = payMethodY;
    }

    public String getToward() {
        return toward;
    }

    public void setToward(String toward) {
        this.toward = toward == null ? null : toward.trim();
    }

    public Date getCanRentDate() {
        return canRentDate;
    }

    public void setCanRentDate(Date canRentDate) {
        this.canRentDate = canRentDate;
    }

    public Short getRoomType() {
        return roomType;
    }

    public void setRoomType(Short roomType) {
        this.roomType = roomType;
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
        sb.append(", version=").append(version);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", name=").append(name);
        sb.append(", space=").append(space);
        sb.append(", rentStatus=").append(rentStatus);
        sb.append(", lockEndTime=").append(lockEndTime);
        sb.append(", identifier=").append(identifier);
        sb.append(", edited=").append(edited);
        sb.append(", price=").append(price);
        sb.append(", assetsId=").append(assetsId);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", houseId=").append(houseId);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", payMethodF=").append(payMethodF);
        sb.append(", payMethodY=").append(payMethodY);
        sb.append(", toward=").append(toward);
        sb.append(", canRentDate=").append(canRentDate);
        sb.append(", roomType=").append(roomType);
        sb.append(", channelStatus=").append(channelStatus);
        sb.append(", decoration=").append(decoration);
        sb.append(", picturesOrder=").append(picturesOrder);
        sb.append(", synchronous=").append(synchronous);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}