package com.web.business.page.website;

import com.web.business.model.caspain.ManagerArticle;
import com.web.business.model.caspain.ManagerModelArticle;
import com.web.business.model.caspain.ManagerModelImage;
import lombok.Data;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/

public class IndexManagerModelVO {
    //模块标题
    private String managerModelTitle;
    //模块副标题
    private String managerModelSubTitle;
    //模块中图片的显示方式(1.轮显 2.顺序显示)
    private Integer imageShowWay;
    //模块中的图片(首页轮显和图片)
    private List<ManagerModelImage> managerModelImages;
    //模块中的文章的显示方式(1.左右结构。2.列表)
    private Integer articleShowWay;
    //模块中的文章
    private List<ManagerArticle> managerArticles;
    //精品房源模块下的房源数量
    private Integer indexHomeNum;
    //精品房源模块下的房源信息
    private List<IndexHomeVO> homeVOS;

    public IndexManagerModelVO() {
    }

    public IndexManagerModelVO(String managerModelTitle, String managerModelSubTitle, Integer imageShowWay, List<ManagerModelImage> managerModelImages, Integer articleShowWay, List<ManagerArticle> managerArticles, Integer indexHomeNum, List<IndexHomeVO> homeVOS) {
        this.managerModelTitle = managerModelTitle;
        this.managerModelSubTitle = managerModelSubTitle;
        this.imageShowWay = imageShowWay;
        this.managerModelImages = managerModelImages;
        this.articleShowWay = articleShowWay;
        this.managerArticles = managerArticles;
        this.indexHomeNum = indexHomeNum;
        this.homeVOS = homeVOS;
    }

    public Integer getImageShowWay() {
        return imageShowWay;
    }

    public void setImageShowWay(Integer imageShowWay) {
        this.imageShowWay = imageShowWay;
    }

    public String getManagerModelTitle() {
        return managerModelTitle;
    }

    public void setManagerModelTitle(String managerModelTitle) {
        this.managerModelTitle = managerModelTitle;
    }

    public String getManagerModelSubTitle() {
        return managerModelSubTitle;
    }

    public void setManagerModelSubTitle(String managerModelSubTitle) {
        this.managerModelSubTitle = managerModelSubTitle;
    }

    public List<ManagerModelImage> getManagerModelImages() {
        return managerModelImages;
    }

    public void setManagerModelImages(List<ManagerModelImage> managerModelImages) {
        this.managerModelImages = managerModelImages;
    }

    public Integer getArticleShowWay() {
        return articleShowWay;
    }

    public void setArticleShowWay(Integer articleShowWay) {
        this.articleShowWay = articleShowWay;
    }

    public List<ManagerArticle> getManagerArticles() {
        return managerArticles;
    }

    public void setManagerArticles(List<ManagerArticle> managerArticles) {
        this.managerArticles = managerArticles;
    }

    public Integer getIndexHomeNum() {
        return indexHomeNum;
    }

    public void setIndexHomeNum(Integer indexHomeNum) {
        indexHomeNum = indexHomeNum;
    }

    public List<IndexHomeVO> getHomeVOS() {
        return homeVOS;
    }

    public void setHomeVOS(List<IndexHomeVO> homeVOS) {
        this.homeVOS = homeVOS;
    }

    @Override
    public String toString() {
        return "IndexManagerModelVO{" +
                "managerModelTitle='" + managerModelTitle + '\'' +
                ", managerModelSubTitle='" + managerModelSubTitle + '\'' +
                ", managerModelImages=" + managerModelImages +
                ", articleShowWay=" + articleShowWay +
                ", managerArticles=" + managerArticles +
                ", indexHomeNum=" + indexHomeNum +
                ", homeVOS=" + homeVOS +
                '}';
    }
}
