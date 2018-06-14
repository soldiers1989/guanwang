package com.web.business.page.website;

import lombok.Data;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class DispersedRoomieDetailVO {
    //房间名称
    private String roomName;
    //室友名称
    private String roomieName;
    //房间面积
    private Integer roomSpace;
    //朝向
    private String roomToward;
    //独立卫浴
    private Boolean independentToilet;
    //独立阳台
    private Boolean independentBalcony;
    //房间价格
    private Integer price;
    //出租状态
    private String rentStatus;
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomieName() {
		return roomieName;
	}
	public void setRoomieName(String roomieName) {
		this.roomieName = roomieName;
	}
	public Integer getRoomSpace() {
		return roomSpace;
	}
	public void setRoomSpace(Integer roomSpace) {
		this.roomSpace = roomSpace;
	}
	public String getRoomToward() {
		return roomToward;
	}
	public void setRoomToward(String roomToward) {
		this.roomToward = roomToward;
	}
	public Boolean getIndependentToilet() {
		return independentToilet;
	}
	public void setIndependentToilet(Boolean independentToilet) {
		this.independentToilet = independentToilet;
	}
	public Boolean getIndependentBalcony() {
		return independentBalcony;
	}
	public void setIndependentBalcony(Boolean independentBalcony) {
		this.independentBalcony = independentBalcony;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getRentStatus() {
		return rentStatus;
	}
	public void setRentStatus(String rentStatus) {
		this.rentStatus = rentStatus;
	}
    
}

