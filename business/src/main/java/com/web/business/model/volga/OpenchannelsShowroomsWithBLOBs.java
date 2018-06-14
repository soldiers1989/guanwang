package com.web.business.model.volga;

import java.io.Serializable;

public class OpenchannelsShowroomsWithBLOBs extends OpenchannelsShowrooms implements Serializable {
    private String extra;

    private String rawData;

    private static final long serialVersionUID = 1L;

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData == null ? null : rawData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", extra=").append(extra);
        sb.append(", rawData=").append(rawData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}