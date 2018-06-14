package com.web.business.page.website;

import lombok.Data;

/**
 * @author Sky
 * create 2018/05/28
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class ConcentratedApartmentDetailVO {
    //集中式公寓id
    private Integer id;
    //集中式公寓名称
    private String name;
    //门店名称
    private String storeName;
    //门店电话
    private String storePhone;
    //集中式公寓最低价格
    private Integer minPrice;
    //集中式公寓最高价格
    private Integer maxPrice;
    //集中式公寓地址
    private String address;
    //横幅照片
    private String imageUrl;

    //公寓纬度
    private String latitude;
    //公寓经度
    private String longitude;

}
