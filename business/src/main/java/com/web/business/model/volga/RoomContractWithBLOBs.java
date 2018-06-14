package com.web.business.model.volga;

import java.io.Serializable;

public class RoomContractWithBLOBs extends RoomContract implements Serializable {
    private String comments;

    private String evictionReason;

    private String ignoreOrder;

    private static final long serialVersionUID = 1L;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getEvictionReason() {
        return evictionReason;
    }

    public void setEvictionReason(String evictionReason) {
        this.evictionReason = evictionReason == null ? null : evictionReason.trim();
    }

    public String getIgnoreOrder() {
        return ignoreOrder;
    }

    public void setIgnoreOrder(String ignoreOrder) {
        this.ignoreOrder = ignoreOrder == null ? null : ignoreOrder.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", comments=").append(comments);
        sb.append(", evictionReason=").append(evictionReason);
        sb.append(", ignoreOrder=").append(ignoreOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}