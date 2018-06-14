package com.web.business.model.api;

import java.util.List;

public class SubwayInfo {
	//地铁线路名
	private String lineName;
	//地铁线路UID
	private String lineUid;
	//未知
	private String pairLineUid;
	//地铁站详情
	private List<StationsInfo> stationsInfos;
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineUid() {
		return lineUid;
	}
	public void setLineUid(String lineUid) {
		this.lineUid = lineUid;
	}
	public String getPairLineUid() {
		return pairLineUid;
	}
	public void setPairLineUid(String pairLineUid) {
		this.pairLineUid = pairLineUid;
	}
	public List<StationsInfo> getStationsInfos() {
		return stationsInfos;
	}
	public void setStationsInfos(List<StationsInfo> stationsInfos) {
		this.stationsInfos = stationsInfos;
	}
	@Override
	public String toString() {
		return "SubwayInfo [lineName=" + lineName + ", lineUid=" + lineUid + ", pairLineUid=" + pairLineUid
				+ ", stationsInfos=" + stationsInfos + "]";
	}
	public SubwayInfo(String lineName, String lineUid, String pairLineUid, List<StationsInfo> stationsInfos) {
		super();
		this.lineName = lineName;
		this.lineUid = lineUid;
		this.pairLineUid = pairLineUid;
		this.stationsInfos = stationsInfos;
	}
	public SubwayInfo() {
		super();
	}
}
