package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerWeb implements Serializable {
    private Integer id;

    private String undomainUrl;

    private String domainUrl;

    private String apartmentName;

    private String slogenName;

    private String logoImage;

    private String qrWechatImage;

    private String qrAppImage;

    private String serviceTelephone;

    private String serviceTime;

    private String serviceEmail;

    private String icpNum;

    private String webColor;

    private Date createdAt;

    private Integer createById;

    private Date updatedAt;

    private Integer updateById;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUndomainUrl() {
        return undomainUrl;
    }

    public void setUndomainUrl(String undomainUrl) {
        this.undomainUrl = undomainUrl == null ? null : undomainUrl.trim();
    }

    public String getDomainUrl() {
        return domainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl == null ? null : domainUrl.trim();
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName == null ? null : apartmentName.trim();
    }

    public String getSlogenName() {
        return slogenName;
    }

    public void setSlogenName(String slogenName) {
        this.slogenName = slogenName == null ? null : slogenName.trim();
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage == null ? null : logoImage.trim();
    }

    public String getQrWechatImage() {
        return qrWechatImage;
    }

    public void setQrWechatImage(String qrWechatImage) {
        this.qrWechatImage = qrWechatImage == null ? null : qrWechatImage.trim();
    }

    public String getQrAppImage() {
        return qrAppImage;
    }

    public void setQrAppImage(String qrAppImage) {
        this.qrAppImage = qrAppImage == null ? null : qrAppImage.trim();
    }

    public String getServiceTelephone() {
        return serviceTelephone;
    }

    public void setServiceTelephone(String serviceTelephone) {
        this.serviceTelephone = serviceTelephone == null ? null : serviceTelephone.trim();
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail == null ? null : serviceEmail.trim();
    }

    public String getIcpNum() {
        return icpNum;
    }

    public void setIcpNum(String icpNum) {
        this.icpNum = icpNum == null ? null : icpNum.trim();
    }

    public String getWebColor() {
        return webColor;
    }

    public void setWebColor(String webColor) {
        this.webColor = webColor == null ? null : webColor.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreateById() {
        return createById;
    }

    public void setCreateById(Integer createById) {
        this.createById = createById;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdateById() {
        return updateById;
    }

    public void setUpdateById(Integer updateById) {
        this.updateById = updateById;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", undomainUrl=").append(undomainUrl);
        sb.append(", domainUrl=").append(domainUrl);
        sb.append(", apartmentName=").append(apartmentName);
        sb.append(", slogenName=").append(slogenName);
        sb.append(", logoImage=").append(logoImage);
        sb.append(", qrWechatImage=").append(qrWechatImage);
        sb.append(", qrAppImage=").append(qrAppImage);
        sb.append(", serviceTelephone=").append(serviceTelephone);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", serviceEmail=").append(serviceEmail);
        sb.append(", icpNum=").append(icpNum);
        sb.append(", webColor=").append(webColor);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createById=").append(createById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updateById=").append(updateById);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}