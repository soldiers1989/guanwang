package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerNavigation implements Serializable {
    private Integer id;

    private Integer magagerWebId;

    private String navigationName;

    private String navigationLink;

    private String navigationIntro;

    private String navigationImage;

    private Integer navigationPlace;

    private Integer navigationSort;

    private String linkAddress;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDeleted;

    private Date deletedAt;

    private Integer deletedById;

    private Integer navigationStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMagagerWebId() {
        return magagerWebId;
    }

    public void setMagagerWebId(Integer magagerWebId) {
        this.magagerWebId = magagerWebId;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName == null ? null : navigationName.trim();
    }

    public String getNavigationLink() {
        return navigationLink;
    }

    public void setNavigationLink(String navigationLink) {
        this.navigationLink = navigationLink == null ? null : navigationLink.trim();
    }

    public String getNavigationIntro() {
        return navigationIntro;
    }

    public void setNavigationIntro(String navigationIntro) {
        this.navigationIntro = navigationIntro == null ? null : navigationIntro.trim();
    }

    public String getNavigationImage() {
        return navigationImage;
    }

    public void setNavigationImage(String navigationImage) {
        this.navigationImage = navigationImage == null ? null : navigationImage.trim();
    }

    public Integer getNavigationPlace() {
        return navigationPlace;
    }

    public void setNavigationPlace(Integer navigationPlace) {
        this.navigationPlace = navigationPlace;
    }

    public Integer getNavigationSort() {
        return navigationSort;
    }

    public void setNavigationSort(Integer navigationSort) {
        this.navigationSort = navigationSort;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Integer updatedById) {
        this.updatedById = updatedById;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(Integer deletedById) {
        this.deletedById = deletedById;
    }

    public Integer getNavigationStatus() {
        return navigationStatus;
    }

    public void setNavigationStatus(Integer navigationStatus) {
        this.navigationStatus = navigationStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", magagerWebId=").append(magagerWebId);
        sb.append(", navigationName=").append(navigationName);
        sb.append(", navigationLink=").append(navigationLink);
        sb.append(", navigationIntro=").append(navigationIntro);
        sb.append(", navigationImage=").append(navigationImage);
        sb.append(", navigationPlace=").append(navigationPlace);
        sb.append(", navigationSort=").append(navigationSort);
        sb.append(", linkAddress=").append(linkAddress);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", navigationStatus=").append(navigationStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}