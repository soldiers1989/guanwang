package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class RoomContract implements Serializable {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private Boolean isDelete;

    private String status;

    private Date startTime;

    private Date endTime;

    private Date actualEndTime;

    private Double deposit;

    private String payMethod;

    private Integer payMethodF;

    private Integer payMethodY;

    private Short freeDays;

    private Short advancedDays;

    private String customerName;

    private String customerPhone;

    private String customerIdType;

    private String customerIdNumber;

    private Integer createdById;

    private Integer deletedById;

    private Integer houseId;

    private Integer updatedById;

    private String number;

    private Float monthRental;

    private Short renewTimes;

    private Integer roomId;

    private Boolean genedOrders;

    private Short fixedPayDate;

    private String rentPayWay;

    private Short installmentNum;

    private Boolean isInstallment;

    private Short isLoan;

    private Double loanAmount;

    private String loanContractId;

    private String sceneCustId;

    private Date ignoreTime;

    private Short signed;

    private Date signedAt;

    private String signedPicture;

    private Short signing;

    private String offlineNo;

    private Integer customerResId;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(Date actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
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

    public Short getFreeDays() {
        return freeDays;
    }

    public void setFreeDays(Short freeDays) {
        this.freeDays = freeDays;
    }

    public Short getAdvancedDays() {
        return advancedDays;
    }

    public void setAdvancedDays(Short advancedDays) {
        this.advancedDays = advancedDays;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerIdType() {
        return customerIdType;
    }

    public void setCustomerIdType(String customerIdType) {
        this.customerIdType = customerIdType == null ? null : customerIdType.trim();
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber == null ? null : customerIdNumber.trim();
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Float getMonthRental() {
        return monthRental;
    }

    public void setMonthRental(Float monthRental) {
        this.monthRental = monthRental;
    }

    public Short getRenewTimes() {
        return renewTimes;
    }

    public void setRenewTimes(Short renewTimes) {
        this.renewTimes = renewTimes;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Boolean getGenedOrders() {
        return genedOrders;
    }

    public void setGenedOrders(Boolean genedOrders) {
        this.genedOrders = genedOrders;
    }

    public Short getFixedPayDate() {
        return fixedPayDate;
    }

    public void setFixedPayDate(Short fixedPayDate) {
        this.fixedPayDate = fixedPayDate;
    }

    public String getRentPayWay() {
        return rentPayWay;
    }

    public void setRentPayWay(String rentPayWay) {
        this.rentPayWay = rentPayWay == null ? null : rentPayWay.trim();
    }

    public Short getInstallmentNum() {
        return installmentNum;
    }

    public void setInstallmentNum(Short installmentNum) {
        this.installmentNum = installmentNum;
    }

    public Boolean getIsInstallment() {
        return isInstallment;
    }

    public void setIsInstallment(Boolean isInstallment) {
        this.isInstallment = isInstallment;
    }

    public Short getIsLoan() {
        return isLoan;
    }

    public void setIsLoan(Short isLoan) {
        this.isLoan = isLoan;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanContractId() {
        return loanContractId;
    }

    public void setLoanContractId(String loanContractId) {
        this.loanContractId = loanContractId == null ? null : loanContractId.trim();
    }

    public String getSceneCustId() {
        return sceneCustId;
    }

    public void setSceneCustId(String sceneCustId) {
        this.sceneCustId = sceneCustId == null ? null : sceneCustId.trim();
    }

    public Date getIgnoreTime() {
        return ignoreTime;
    }

    public void setIgnoreTime(Date ignoreTime) {
        this.ignoreTime = ignoreTime;
    }

    public Short getSigned() {
        return signed;
    }

    public void setSigned(Short signed) {
        this.signed = signed;
    }

    public Date getSignedAt() {
        return signedAt;
    }

    public void setSignedAt(Date signedAt) {
        this.signedAt = signedAt;
    }

    public String getSignedPicture() {
        return signedPicture;
    }

    public void setSignedPicture(String signedPicture) {
        this.signedPicture = signedPicture == null ? null : signedPicture.trim();
    }

    public Short getSigning() {
        return signing;
    }

    public void setSigning(Short signing) {
        this.signing = signing;
    }

    public String getOfflineNo() {
        return offlineNo;
    }

    public void setOfflineNo(String offlineNo) {
        this.offlineNo = offlineNo == null ? null : offlineNo.trim();
    }

    public Integer getCustomerResId() {
        return customerResId;
    }

    public void setCustomerResId(Integer customerResId) {
        this.customerResId = customerResId;
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
        sb.append(", status=").append(status);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", actualEndTime=").append(actualEndTime);
        sb.append(", deposit=").append(deposit);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payMethodF=").append(payMethodF);
        sb.append(", payMethodY=").append(payMethodY);
        sb.append(", freeDays=").append(freeDays);
        sb.append(", advancedDays=").append(advancedDays);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerPhone=").append(customerPhone);
        sb.append(", customerIdType=").append(customerIdType);
        sb.append(", customerIdNumber=").append(customerIdNumber);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", houseId=").append(houseId);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", number=").append(number);
        sb.append(", monthRental=").append(monthRental);
        sb.append(", renewTimes=").append(renewTimes);
        sb.append(", roomId=").append(roomId);
        sb.append(", genedOrders=").append(genedOrders);
        sb.append(", fixedPayDate=").append(fixedPayDate);
        sb.append(", rentPayWay=").append(rentPayWay);
        sb.append(", installmentNum=").append(installmentNum);
        sb.append(", isInstallment=").append(isInstallment);
        sb.append(", isLoan=").append(isLoan);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", loanContractId=").append(loanContractId);
        sb.append(", sceneCustId=").append(sceneCustId);
        sb.append(", ignoreTime=").append(ignoreTime);
        sb.append(", signed=").append(signed);
        sb.append(", signedAt=").append(signedAt);
        sb.append(", signedPicture=").append(signedPicture);
        sb.append(", signing=").append(signing);
        sb.append(", offlineNo=").append(offlineNo);
        sb.append(", customerResId=").append(customerResId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}