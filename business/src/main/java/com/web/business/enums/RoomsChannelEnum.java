package com.web.business.enums;

public enum RoomsChannelEnum {
	CHANNELONE(0,"58渠道"), CHANNELTWO(1,"嗨住"),CHANNETHREE(2,"水滴"),CHANNELFOURE(3,"平安");
	private int code;
    private String name;
    
	RoomsChannelEnum(){
		
	}
	RoomsChannelEnum(int code, String name) {
		this.code = code;
		this.name = name;
	}
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
}
