package com.web.business.enums;

/**
 * @author Sky
 * create 2018/05/18
 * email sky.li@ixiaoshuidi.com
 **/
public enum ArticleShowLogicEnum {
    NEWARTICLE(1, "最新文章"), INDEXARTICLE(2, "推荐到首页的文章");
    private int code;
    private String name;

    ArticleShowLogicEnum() {
    }

    ArticleShowLogicEnum(int code, String name) {
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
