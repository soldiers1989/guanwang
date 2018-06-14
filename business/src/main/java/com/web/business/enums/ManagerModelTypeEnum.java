package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/17
 * email sky.li@ixiaoshuidi.com
 **/
public enum ManagerModelTypeEnum {
    INDEXPAGE(1, "首页轮显"), IMAGE(2, "图片"), HOMESOURCE(3, "房源"), ARTICLE(4, "文章");
    private int code;
    private String name;

    ManagerModelTypeEnum() {
    }

    ManagerModelTypeEnum(int code, String name) {
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

    public static ManagerModelTypeEnum getByCode(int code) {
        for (ManagerModelTypeEnum managerModelTypeEnum : ManagerModelTypeEnum.values()) {
            if (managerModelTypeEnum.getCode() == code) {
                return managerModelTypeEnum;
            }
        }
        return null;
    }
}
