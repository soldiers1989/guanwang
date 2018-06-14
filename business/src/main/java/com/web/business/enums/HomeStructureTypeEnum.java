package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/15
 * email sky.li@ixiaoshuidi.com
 **/
public enum HomeStructureTypeEnum {
    DISPERSED(1, "分散式"), CONCENTRATE(0, "集中式");

    private Integer code;
    private String name;

    HomeStructureTypeEnum() {
    }

    HomeStructureTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HomeStructureType{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
