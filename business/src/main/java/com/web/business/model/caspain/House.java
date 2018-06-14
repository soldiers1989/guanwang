package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private Boolean isDelete;

    private String city;

    private String district;

    private String block;

    private String address;

    private String area;

    private String buildingNum;

    private String unitNum;

    private String floorNum;

    private String houseNum;

    private Short payMethodF;

    private Short payMethodY;

    private Double monthRental;

    private String rentStatus;

    private Boolean isWhole;

    private Double space;

    private Double price;

    private Integer assetsId;

    private Integer createdById;

    private Integer deletedById;

    private Integer houseTypeId;

    private Integer updatedById;

    private Boolean isNew;

    private Date decoratingEndAt;

    private Date decoratingStartAt;

    private Boolean isDecorating;

    private Boolean isShow;

    private Boolean isConcentrated;

    private Short roomNum;

    private String totalFloorNum;

    private Boolean isStop;

    private Double decoratingFee;

    private Integer synchronous;

    private String latitude;

    private String longitude;

    private Short sourceType;

    private String remark;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum == null ? null : buildingNum.trim();
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum == null ? null : unitNum.trim();
    }

    public String getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(String floorNum) {
        this.floorNum = floorNum == null ? null : floorNum.trim();
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum == null ? null : houseNum.trim();
    }

    public Short getPayMethodF() {
        return payMethodF;
    }

    public void setPayMethodF(Short payMethodF) {
        this.payMethodF = payMethodF;
    }

    public Short getPayMethodY() {
        return payMethodY;
    }

    public void setPayMethodY(Short payMethodY) {
        this.payMethodY = payMethodY;
    }

    public Double getMonthRental() {
        return monthRental;
    }

    public void setMonthRental(Double monthRental) {
        this.monthRental = monthRental;
    }

    public String getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(String rentStatus) {
        this.rentStatus = rentStatus == null ? null : rentStatus.trim();
    }

    public Boolean getIsWhole() {
        return isWhole;
    }

    public void setIsWhole(Boolean isWhole) {
        this.isWhole = isWhole;
    }

    public Double getSpace() {
        return space;
    }

    public void setSpace(Double space) {
        this.space = space;
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

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Date getDecoratingEndAt() {
        return decoratingEndAt;
    }

    public void setDecoratingEndAt(Date decoratingEndAt) {
        this.decoratingEndAt = decoratingEndAt;
    }

    public Date getDecoratingStartAt() {
        return decoratingStartAt;
    }

    public void setDecoratingStartAt(Date decoratingStartAt) {
        this.decoratingStartAt = decoratingStartAt;
    }

    public Boolean getIsDecorating() {
        return isDecorating;
    }

    public void setIsDecorating(Boolean isDecorating) {
        this.isDecorating = isDecorating;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsConcentrated() {
        return isConcentrated;
    }

    public void setIsConcentrated(Boolean isConcentrated) {
        this.isConcentrated = isConcentrated;
    }

    public Short getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Short roomNum) {
        this.roomNum = roomNum;
    }

    public String getTotalFloorNum() {
        return totalFloorNum;
    }

    public void setTotalFloorNum(String totalFloorNum) {
        this.totalFloorNum = totalFloorNum == null ? null : totalFloorNum.trim();
    }

    public Boolean getIsStop() {
        return isStop;
    }

    public void setIsStop(Boolean isStop) {
        this.isStop = isStop;
    }

    public Double getDecoratingFee() {
        return decoratingFee;
    }

    public void setDecoratingFee(Double decoratingFee) {
        this.decoratingFee = decoratingFee;
    }

    public Integer getSynchronous() {
        return synchronous;
    }

    public void setSynchronous(Integer synchronous) {
        this.synchronous = synchronous;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Short getSourceType() {
        return sourceType;
    }

    public void setSourceType(Short sourceType) {
        this.sourceType = sourceType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", block=").append(block);
        sb.append(", address=").append(address);
        sb.append(", area=").append(area);
        sb.append(", buildingNum=").append(buildingNum);
        sb.append(", unitNum=").append(unitNum);
        sb.append(", floorNum=").append(floorNum);
        sb.append(", houseNum=").append(houseNum);
        sb.append(", payMethodF=").append(payMethodF);
        sb.append(", payMethodY=").append(payMethodY);
        sb.append(", monthRental=").append(monthRental);
        sb.append(", rentStatus=").append(rentStatus);
        sb.append(", isWhole=").append(isWhole);
        sb.append(", space=").append(space);
        sb.append(", price=").append(price);
        sb.append(", assetsId=").append(assetsId);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", houseTypeId=").append(houseTypeId);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isNew=").append(isNew);
        sb.append(", decoratingEndAt=").append(decoratingEndAt);
        sb.append(", decoratingStartAt=").append(decoratingStartAt);
        sb.append(", isDecorating=").append(isDecorating);
        sb.append(", isShow=").append(isShow);
        sb.append(", isConcentrated=").append(isConcentrated);
        sb.append(", roomNum=").append(roomNum);
        sb.append(", totalFloorNum=").append(totalFloorNum);
        sb.append(", isStop=").append(isStop);
        sb.append(", decoratingFee=").append(decoratingFee);
        sb.append(", synchronous=").append(synchronous);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}