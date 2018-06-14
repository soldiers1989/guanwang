package com.web.business.model.volga;

import java.io.Serializable;

public class ApartmentInfoWithBLOBs extends ApartmentInfo implements Serializable {
    private String subletReason;

    private String evictionReason;

    private static final long serialVersionUID = 1L;

    public String getSubletReason() {
        return subletReason;
    }

    public void setSubletReason(String subletReason) {
        this.subletReason = subletReason == null ? null : subletReason.trim();
    }

    public String getEvictionReason() {
        return evictionReason;
    }

    public void setEvictionReason(String evictionReason) {
        this.evictionReason = evictionReason == null ? null : evictionReason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subletReason=").append(subletReason);
        sb.append(", evictionReason=").append(evictionReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}