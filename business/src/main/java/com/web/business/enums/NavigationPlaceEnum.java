package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/16
 * email sky.li@ixiaoshuidi.com
 **/
public enum NavigationPlaceEnum {
    HEAD(1, "头部导航"), TAIL(2, "尾部导航");
    private int code;
    private String name;

    NavigationPlaceEnum(int code, String name) {
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
