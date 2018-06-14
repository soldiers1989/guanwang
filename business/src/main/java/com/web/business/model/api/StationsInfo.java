package com.web.business.model.api;

public class StationsInfo {
	//是否开通
	private int is_practical;
	//地铁站名
	private String name;
	//地铁站Uid
	private String uid;
	//地理像素坐标x
	private double x;
	//地理像素坐标y
	private double y;
	public int getIs_practical() {
		return is_practical;
	}
	public void setIs_practical(int is_practical) {
		this.is_practical = is_practical;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "StationsInfo [is_practical=" + is_practical + ", name=" + name + ", uid=" + uid + ", x=" + x + ", y="
				+ y + "]";
	}
	public StationsInfo(int is_practical, String name, String uid, double x, double y) {
		super();
		this.is_practical = is_practical;
		this.name = name;
		this.uid = uid;
		this.x = x;
		this.y = y;
	}
	public StationsInfo() {
		super();
	}
}
