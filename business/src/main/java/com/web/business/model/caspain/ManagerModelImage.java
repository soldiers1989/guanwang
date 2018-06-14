package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerModelImage implements Serializable {
    private Integer id;

    private Integer modelTypeId;

    private String linkUrl;

    private String slideshowImage;

    private Integer imageSort;

    private Integer showWay;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDelete;

    private Date deletedAt;

    private Integer deletedById;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Integer modelTypeId) {
        this.modelTypeId = modelTypeId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getSlideshowImage() {
        return slideshowImage;
    }

    public void setSlideshowImage(String slideshowImage) {
        this.slideshowImage = slideshowImage == null ? null : slideshowImage.trim();
    }

    public Integer getImageSort() {
        return imageSort;
    }

    public void setImageSort(Integer imageSort) {
        this.imageSort = imageSort;
    }

    public Integer getShowWay() {
        return showWay;
    }

    public void setShowWay(Integer showWay) {
        this.showWay = showWay;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modelTypeId=").append(modelTypeId);
        sb.append(", linkUrl=").append(linkUrl);
        sb.append(", slideshowImage=").append(slideshowImage);
        sb.append(", imageSort=").append(imageSort);
        sb.append(", showWay=").append(showWay);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}