package com.web.business.page.website;

import com.web.business.model.caspain.House;
import lombok.Data;

@Data
public class HouseListVo {
	//图片Id
	private Integer imgId;
	//图片路径
	private String imgUrl;
	//房源名称
	private String houseNam;
	//房源所在城市
	private String city;
	//房源所在区级行政区
	private String district;
	//房源所在商圈
	private String block;
	//经度坐标
	private String longitude;
	//纬度坐标
	private String latitude;
	//房间ID
	private Integer roomId;
	//地址
	private String address;
	//朝向
	private String toward;
	//面积
	private Double space;
	//楼层
	private String floorNum;
	//总楼层
	private String totalFloorNum;
	//房间数(户型)
	private Short roomNum;
	//餐厅
	private Integer livingroom;
	//卫生间
	private Integer washroom;
	//房屋配置
	private String[] roomConfig;
	//出租方式
	private String rent;
	//房源(特色)备注
	private String remark;
	//租金
	private Double price;
	//地铁站
	private String subway;
	//地铁站（经度坐标）
	private String subwayLong;
	//地铁站（纬度坐标）
	private String subwayLat;
}
