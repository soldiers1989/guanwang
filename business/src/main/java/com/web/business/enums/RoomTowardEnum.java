package com.web.business.enums;

public enum RoomTowardEnum {
    TOWARD_UNKNOW("unknown", "未知"),
    TOWARD_SOUTH("south", "朝南"),
    TOWARD_NOETH("north", "朝北"),
    TOWARD_EAST("east", "朝东"),
    TOWARD_WEST("west", "朝西"),
    TOWARD_SOUTHNORTH("southnorth", "朝南北"),
    TOWARD_EASTSWEST("eastwest", "朝东西"),
    TOWARD_EASTSOUTH("eastsouth", "朝东南"),
    TOWARD_EASTNORTH("eastnorth", "东北"),
    TOWARD_WESTSOUTH("westsouth", "朝西南"),
    TOWARD_WESTNORTH("westnorth", "朝西北");
    private String code;
    private String name;

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

    RoomTowardEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    RoomTowardEnum() {
    }

    public static RoomTowardEnum getByCode(String code) {
        for (RoomTowardEnum roomTowardEnum : RoomTowardEnum.values()) {
            if (roomTowardEnum.getCode().equals(code)) {
                return roomTowardEnum;
            }
        }
        return null;
    }
}
