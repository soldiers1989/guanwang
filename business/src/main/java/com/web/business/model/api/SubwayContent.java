package com.web.business.model.api;

import java.util.List;

public class SubwayContent {
	private List<SubwayInfo> subwayInfos;

	public List<SubwayInfo> getSubwayInfos() {
		return subwayInfos;
	}

	public void setSubwayInfos(List<SubwayInfo> subwayInfos) {
		this.subwayInfos = subwayInfos;
	}

	@Override
	public String toString() {
		return "SubwayContent [subwayInfos=" + subwayInfos + "]";
	}

	public SubwayContent(List<SubwayInfo> subwayInfos) {
		super();
		this.subwayInfos = subwayInfos;
	}

	public SubwayContent() {
		super();
	}
	
}
