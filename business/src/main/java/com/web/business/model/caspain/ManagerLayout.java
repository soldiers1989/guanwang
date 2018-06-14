package com.web.business.model.caspain;

import java.io.Serializable;
import java.util.Date;

public class ManagerLayout implements Serializable {
    private Integer id;

    private Integer managerWebId;

    private String titleName;

    private String layoutIntro;

    private Date createdAt;

    private Integer createdById;

    private Date updatedAt;

    private Integer updatedById;

    private Integer isDelete;

    private Date deletedAt;

    private Integer deletedById;

    private Integer layoutStatus;

    private String layoutContent;

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

    public String getLayoutIntro() {
        return layoutIntro;
    }

    public void setLayoutIntro(String layoutIntro) {
        this.layoutIntro = layoutIntro == null ? null : layoutIntro.trim();
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

    public Integer getLayoutStatus() {
        return layoutStatus;
    }

    public void setLayoutStatus(Integer layoutStatus) {
        this.layoutStatus = layoutStatus;
    }

    public String getLayoutContent() {
        return layoutContent;
    }

    public void setLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent == null ? null : layoutContent.trim();
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
        sb.append(", layoutIntro=").append(layoutIntro);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdById=").append(createdById);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedById=").append(updatedById);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", deletedById=").append(deletedById);
        sb.append(", layoutStatus=").append(layoutStatus);
        sb.append(", layoutContent=").append(layoutContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}