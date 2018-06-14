package com.web.business.page.website;

import lombok.Data;

@Data
public class ApartmentListVo {
	//公寓的Id
	private Integer apartmentId;
	//公寓名称
	private String apartmentNam;
	//公寓电话
	private String apartmentPhone;
	//公寓所在城市
	private String city;
	//所在区级行政区
	private String district;
	//所在商圈
	private String block;
	//附近地铁站
	private String subway;
	//地址
	private String apartmentAddress;
	//经度坐标
	private String longitude;
	//纬度坐标
	private String latitude;
	//公寓图片
	private String imgUrl;
	//门店信息
	private String storeNam;
	//房间Id
	private Integer roomId;
	//面积
	private Double space;
	//朝向
	private String toward;
	//楼层
	private Short floorNum;
	//总楼层
	private Short totalFloorNum;
	//房间数(户型)
	private Short roomNum;
	//餐厅
	private Integer livingroom;
	//卫生间
	private Integer washroom;
	//租金
	private Double price;
}
