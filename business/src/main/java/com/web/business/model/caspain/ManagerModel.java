package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerModel implements Serializable {
    private Integer id;

    private Integer managerWebId;

    private String modelName;

    private String subheadName;

    private Integer modelSort;

    private Integer modelType;

    private Integer titleShow;

    private String modelIntro;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDelete;

    private Date deletedAt;

    private Integer deletedById;

    private Integer modelStatus;

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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getSubheadName() {
        return subheadName;
    }

    public void setSubheadName(String subheadName) {
        this.subheadName = subheadName == null ? null : subheadName.trim();
    }

    public Integer getModelSort() {
        return modelSort;
    }

    public void setModelSort(Integer modelSort) {
        this.modelSort = modelSort;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    public Integer getTitleShow() {
        return titleShow;
    }

    public void setTitleShow(Integer titleShow) {
        this.titleShow = titleShow;
    }

    public String getModelIntro() {
        return modelIntro;
    }

    public void setModelIntro(String modelIntro) {
        this.modelIntro = modelIntro == null ? null : modelIntro.trim();
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

    public Integer getModelStatus() {
        return modelStatus;
    }

    public void setModelStatus(Integer modelStatus) {
        this.modelStatus = modelStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", managerWebId=").append(managerWebId);
        sb.append(", modelName=").append(modelName);
        sb.append(", subheadName=").append(subheadName);
        sb.append(", modelSort=").append(modelSort);
        sb.append(", modelType=").append(modelType);
        sb.append(", titleShow=").append(titleShow);
        sb.append(", modelIntro=").append(modelIntro);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", modelStatus=").append(modelStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}