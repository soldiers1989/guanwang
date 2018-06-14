package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/29
 * email sky.li@ixiaoshuidi.com
 **/
public enum ApartmentAssetsEnum {
    BED("bed", "床"),
    WARDROBES("wardrobes", "衣柜"),
    DESKS("desks", "书桌"),
    AIR_CONDITIONINGS("air_conditionings", "空调"),
    HEAT("heat", "暖气"),
    TELEVISIONS("televisions", "电视机"),
    GAS("gas", "燃气"),
    MICROWAVE("microwave", "微波炉"),
    INDUCTION_COOKER("induction_cooker", "电磁炉"),
    WATER_HEATERS("water_heaters", "热水器"),
    WASHING_MACHINES("washing_machines", "洗衣机"),
    FRIDGE("fridge", "冰箱"),
    INTERNET("internet", "WIFI"),
    SOFA("sofa", "沙发"),
    KITCHENS("kitchens", "橱柜"),
    RANGE_HOOD("range_hood", "油烟机"),
    TAG_TOILET("tag_toilet", "独立卫生间"),
    WINDOWS("windows", "飘窗");


    private String code;
    private String name;

    ApartmentAssetsEnum(String code, String name) {
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
