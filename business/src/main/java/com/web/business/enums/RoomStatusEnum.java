package com.web.business.enums;

public enum RoomStatusEnum {
	APPLYING_STATUS(1,"申请中"),
	AUDIT_STATUS(2,"审核失败"), 
	PASS_STATUS(3,"审核通过,已发布"), 
	SOLE_OUT_STATUS(4,"已下架"), 
	CHANNEL_EXCEPTION_STATUS(5,"渠道异常");
	
	private int code;
	private String name;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	RoomStatusEnum(int code, String name) {
		this.code = code;
		this.name = name;
	}
	RoomStatusEnum() {
		
	}
}
