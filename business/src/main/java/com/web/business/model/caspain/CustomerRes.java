package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class CustomerRes implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private Boolean isDelete;

    private String name;

    private String sex;

    private String phone;

    private Short source;

    private Date wantedDay;

    private String address;

    private String minRent;

    private String maxRent;

    private Short headcount;

    private String houseType;

    private String customerType;

    private String operatorName;

    private Short status;

    private Integer createdById;

    private Integer deletedById;

    private Integer operatorId;

    private Integer updatedById;

    private Short length;

    private String bookTime;

    private Short urgency;

    private Date operatedAt;

    private Integer roomId;

    private Short roomSource;

    private String comments;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }

    public Date getWantedDay() {
        return wantedDay;
    }

    public void setWantedDay(Date wantedDay) {
        this.wantedDay = wantedDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMinRent() {
        return minRent;
    }

    public void setMinRent(String minRent) {
        this.minRent = minRent == null ? null : minRent.trim();
    }

    public String getMaxRent() {
        return maxRent;
    }

    public void setMaxRent(String maxRent) {
        this.maxRent = maxRent == null ? null : maxRent.trim();
    }

    public Short getHeadcount() {
        return headcount;
    }

    public void setHeadcount(Short headcount) {
        this.headcount = headcount;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime == null ? null : bookTime.trim();
    }

    public Short getUrgency() {
        return urgency;
    }

    public void setUrgency(Short urgency) {
        this.urgency = urgency;
    }

    public Date getOperatedAt() {
        return operatedAt;
    }

    public void setOperatedAt(Date operatedAt) {
        this.operatedAt = operatedAt;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Short getRoomSource() {
        return roomSource;
    }

    public void setRoomSource(Short roomSource) {
        this.roomSource = roomSource;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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
        sb.append(", sex=").append(sex);
        sb.append(", phone=").append(phone);
        sb.append(", source=").append(source);
        sb.append(", wantedDay=").append(wantedDay);
        sb.append(", address=").append(address);
        sb.append(", minRent=").append(minRent);
        sb.append(", maxRent=").append(maxRent);
        sb.append(", headcount=").append(headcount);
        sb.append(", houseType=").append(houseType);
        sb.append(", customerType=").append(customerType);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", status=").append(status);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", length=").append(length);
        sb.append(", bookTime=").append(bookTime);
        sb.append(", urgency=").append(urgency);
        sb.append(", operatedAt=").append(operatedAt);
        sb.append(", roomId=").append(roomId);
        sb.append(", roomSource=").append(roomSource);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}