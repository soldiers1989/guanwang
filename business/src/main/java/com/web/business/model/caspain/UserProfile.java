package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class UserProfile extends UserProfileKey implements Serializable {
    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private Integer version;

    private String company;

    private String name;

    private String phone;

    private Integer createdById;

    private Integer deletedById;

    private Integer updatedById;

    private Integer userId;

    private String address;

    private Boolean isFranchisee;

    private Boolean isFirstLogin;

    private String area;

    private Double creditCeiling;

    private Double creditUsed;

    private String idNumber;

    private Boolean isTest;

    private String terminal;

    private String companyPostfix;

    private String urlFrom;

    private String city;

    private String companyBrand;

    private String province;

    private Integer avatarId;

    private Date backupsAt;

    private String email;

    private Integer interval;

    private Boolean isFreeze;

    private Boolean isOnline;

    private Short level;

    private Short isChannel;

    private Short isLoan;

    private String referral;

    private Short status;

    private Integer vipAction;

    private Date vipExpireAt;

    private Short vipLevel;

    private Integer vipStatus;

    private String legalPerson;

    private String operateCity;

    private Short operateMode;

    private Short idauthType;

    private Short shuidiVip;

    private String isEffective;

    private String identity;

    private static final long serialVersionUID = 1L;

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getIsFranchisee() {
        return isFranchisee;
    }

    public void setIsFranchisee(Boolean isFranchisee) {
        this.isFranchisee = isFranchisee;
    }

    public Boolean getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Double getCreditCeiling() {
        return creditCeiling;
    }

    public void setCreditCeiling(Double creditCeiling) {
        this.creditCeiling = creditCeiling;
    }

    public Double getCreditUsed() {
        return creditUsed;
    }

    public void setCreditUsed(Double creditUsed) {
        this.creditUsed = creditUsed;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Boolean getIsTest() {
        return isTest;
    }

    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal == null ? null : terminal.trim();
    }

    public String getCompanyPostfix() {
        return companyPostfix;
    }

    public void setCompanyPostfix(String companyPostfix) {
        this.companyPostfix = companyPostfix == null ? null : companyPostfix.trim();
    }

    public String getUrlFrom() {
        return urlFrom;
    }

    public void setUrlFrom(String urlFrom) {
        this.urlFrom = urlFrom == null ? null : urlFrom.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCompanyBrand() {
        return companyBrand;
    }

    public void setCompanyBrand(String companyBrand) {
        this.companyBrand = companyBrand == null ? null : companyBrand.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Integer avatarId) {
        this.avatarId = avatarId;
    }

    public Date getBackupsAt() {
        return backupsAt;
    }

    public void setBackupsAt(Date backupsAt) {
        this.backupsAt = backupsAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Boolean getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Boolean isFreeze) {
        this.isFreeze = isFreeze;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Short getIsChannel() {
        return isChannel;
    }

    public void setIsChannel(Short isChannel) {
        this.isChannel = isChannel;
    }

    public Short getIsLoan() {
        return isLoan;
    }

    public void setIsLoan(Short isLoan) {
        this.isLoan = isLoan;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral == null ? null : referral.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getVipAction() {
        return vipAction;
    }

    public void setVipAction(Integer vipAction) {
        this.vipAction = vipAction;
    }

    public Date getVipExpireAt() {
        return vipExpireAt;
    }

    public void setVipExpireAt(Date vipExpireAt) {
        this.vipExpireAt = vipExpireAt;
    }

    public Short getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Short vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Integer vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getOperateCity() {
        return operateCity;
    }

    public void setOperateCity(String operateCity) {
        this.operateCity = operateCity == null ? null : operateCity.trim();
    }

    public Short getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Short operateMode) {
        this.operateMode = operateMode;
    }

    public Short getIdauthType() {
        return idauthType;
    }

    public void setIdauthType(Short idauthType) {
        this.idauthType = idauthType;
    }

    public Short getShuidiVip() {
        return shuidiVip;
    }

    public void setShuidiVip(Short shuidiVip) {
        this.shuidiVip = shuidiVip;
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", version=").append(version);
        sb.append(", company=").append(company);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", createdById=").append(createdById);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", userId=").append(userId);
        sb.append(", address=").append(address);
        sb.append(", isFranchisee=").append(isFranchisee);
        sb.append(", isFirstLogin=").append(isFirstLogin);
        sb.append(", area=").append(area);
        sb.append(", creditCeiling=").append(creditCeiling);
        sb.append(", creditUsed=").append(creditUsed);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", isTest=").append(isTest);
        sb.append(", terminal=").append(terminal);
        sb.append(", companyPostfix=").append(companyPostfix);
        sb.append(", urlFrom=").append(urlFrom);
        sb.append(", city=").append(city);
        sb.append(", companyBrand=").append(companyBrand);
        sb.append(", province=").append(province);
        sb.append(", avatarId=").append(avatarId);
        sb.append(", backupsAt=").append(backupsAt);
        sb.append(", email=").append(email);
        sb.append(", interval=").append(interval);
        sb.append(", isFreeze=").append(isFreeze);
        sb.append(", isOnline=").append(isOnline);
        sb.append(", level=").append(level);
        sb.append(", isChannel=").append(isChannel);
        sb.append(", isLoan=").append(isLoan);
        sb.append(", referral=").append(referral);
        sb.append(", status=").append(status);
        sb.append(", vipAction=").append(vipAction);
        sb.append(", vipExpireAt=").append(vipExpireAt);
        sb.append(", vipLevel=").append(vipLevel);
        sb.append(", vipStatus=").append(vipStatus);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", operateCity=").append(operateCity);
        sb.append(", operateMode=").append(operateMode);
        sb.append(", idauthType=").append(idauthType);
        sb.append(", shuidiVip=").append(shuidiVip);
        sb.append(", isEffective=").append(isEffective);
        sb.append(", identity=").append(identity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}