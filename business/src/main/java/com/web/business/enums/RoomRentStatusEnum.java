package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/29
 * email sky.li@ixiaoshuidi.com
 **/
public enum RoomRentStatusEnum {
    RENTED("rented", "已出租"),
    EMPTY("empty", "未出租");
    private String code;
    private String name;

    RoomRentStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
