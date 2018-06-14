package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/18
 * email sky.li@ixiaoshuidi.com
 **/
public enum HomeSourceSettingShowLogicEnum {
    AREA_NEW(1, "区域最新房源"), AREA_BROWSE_MAX(2, "区域浏览最多的房源"), RECOMMEND_INDEX(3, "推荐到首页的房源");
    private int code;
    private String name;

    HomeSourceSettingShowLogicEnum() {
    }

    HomeSourceSettingShowLogicEnum(int code, String name) {
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

    public static HomeSourceSettingShowLogicEnum getByCode(int code) {
        for (HomeSourceSettingShowLogicEnum homeSourceSettingShowLogicEnum : HomeSourceSettingShowLogicEnum.values()) {
            if (homeSourceSettingShowLogicEnum.getCode() == code) {
                return homeSourceSettingShowLogicEnum;
            }
        }
        return null;
    }
}
