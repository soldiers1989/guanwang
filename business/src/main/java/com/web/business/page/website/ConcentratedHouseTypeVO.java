package com.web.business.page.website;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sky
 * create 2018/05/29
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class ConcentratedHouseTypeVO {
    //房型id
    private Integer layoutId;
    //房型名称
    private String name;
    //房型信息(房型面积，房型几室几厅)
    private String info;
    //房型最小价格
    private Integer minPrice;
    //房型最大价格
    private Integer maxPrice;
    //房型图片
    private List<String> images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
