package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerArticle implements Serializable {
    private Integer id;

    private Integer managerWebId;

    private String titleName;

    private String subheadName;

    private String articleCovers;

    private String articleIntro;

    private Integer articleTypeId;

    private String articleAuthor;

    private Integer homePage;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDelete;

    private Date deletedAt;

    private Integer deletedById;

    private Integer articleStatus;

    private String articleContent;

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

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName == null ? null : titleName.trim();
    }

    public String getSubheadName() {
        return subheadName;
    }

    public void setSubheadName(String subheadName) {
        this.subheadName = subheadName == null ? null : subheadName.trim();
    }

    public String getArticleCovers() {
        return articleCovers;
    }

    public void setArticleCovers(String articleCovers) {
        this.articleCovers = articleCovers == null ? null : articleCovers.trim();
    }

    public String getArticleIntro() {
        return articleIntro;
    }

    public void setArticleIntro(String articleIntro) {
        this.articleIntro = articleIntro == null ? null : articleIntro.trim();
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor == null ? null : articleAuthor.trim();
    }

    public Integer getHomePage() {
        return homePage;
    }

    public void setHomePage(Integer homePage) {
        this.homePage = homePage;
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

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerWebId=").append(managerWebId);
        sb.append(", titleName=").append(titleName);
        sb.append(", subheadName=").append(subheadName);
        sb.append(", articleCovers=").append(articleCovers);
        sb.append(", articleIntro=").append(articleIntro);
        sb.append(", articleTypeId=").append(articleTypeId);
        sb.append(", articleAuthor=").append(articleAuthor);
        sb.append(", homePage=").append(homePage);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", articleStatus=").append(articleStatus);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}