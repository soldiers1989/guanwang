package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class OpenchannelsShowrooms implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer createdById;

    private Integer updatedById;

    private Integer deletedById;

    private Integer version;

    private Boolean isDelete;

    private Integer roomId;

    private Short channel;

    private Short status;

    private String houseId;

    private String rawHouseId;

    private String errMsg;

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

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Integer getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Integer deletedById) {
        this.deletedById = deletedById;
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

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Short getChannel() {
        return channel;
    }

    public void setChannel(Short channel) {
        this.channel = channel;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getRawHouseId() {
        return rawHouseId;
    }

    public void setRawHouseId(String rawHouseId) {
        this.rawHouseId = rawHouseId == null ? null : rawHouseId.trim();
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
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
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", version=").append(version);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", roomId=").append(roomId);
        sb.append(", channel=").append(channel);
        sb.append(", status=").append(status);
        sb.append(", houseId=").append(houseId);
        sb.append(", rawHouseId=").append(rawHouseId);
        sb.append(", errMsg=").append(errMsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}