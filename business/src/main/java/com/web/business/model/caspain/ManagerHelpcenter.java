package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerHelpcenter implements Serializable {
    private Integer id;

    private Integer managerWebId;

    private String aboutusTitle;

    private String aboutusIntro;

    private Integer aboutusSort;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDelete;

    private Date deletedAt;

    private Integer deletedById;

    private Integer aboutUsStatus;

    private String aboutusArticle;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerWebId() {
        return managerWebId;
    }

    public void setManagerWebId(Integer managerWebId) {
        this.managerWebId = managerWebId;
    }

    public String getAboutusTitle() {
        return aboutusTitle;
    }

    public void setAboutusTitle(String aboutusTitle) {
        this.aboutusTitle = aboutusTitle == null ? null : aboutusTitle.trim();
    }

    public String getAboutusIntro() {
        return aboutusIntro;
    }

    public void setAboutusIntro(String aboutusIntro) {
        this.aboutusIntro = aboutusIntro == null ? null : aboutusIntro.trim();
    }

    public Integer getAboutusSort() {
        return aboutusSort;
    }

    public void setAboutusSort(Integer aboutusSort) {
        this.aboutusSort = aboutusSort;
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

    public Integer getAboutUsStatus() {
        return aboutUsStatus;
    }

    public void setAboutUsStatus(Integer aboutUsStatus) {
        this.aboutUsStatus = aboutUsStatus;
    }

    public String getAboutusArticle() {
        return aboutusArticle;
    }

    public void setAboutusArticle(String aboutusArticle) {
        this.aboutusArticle = aboutusArticle == null ? null : aboutusArticle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerWebId=").append(managerWebId);
        sb.append(", aboutusTitle=").append(aboutusTitle);
        sb.append(", aboutusIntro=").append(aboutusIntro);
        sb.append(", aboutusSort=").append(aboutusSort);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", aboutUsStatus=").append(aboutUsStatus);
        sb.append(", aboutusArticle=").append(aboutusArticle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}