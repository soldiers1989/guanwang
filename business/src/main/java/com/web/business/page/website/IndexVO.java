package com.web.business.page.website;

import com.web.business.model.caspain.ManagerNavigation;
import com.web.business.model.caspain.ManagerWeb;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
public class IndexVO {
    //城市
    private LinkedHashSet<String> cities = new LinkedHashSet<>();
    //网站设置
    private ManagerWeb managerWeb;
    //网站导航(首)
    private List<ManagerNavigation> headManagerNavigations;
    //网站导航(尾)
    private List<ManagerNavigation> tailManagerNavigations;
    //网站首页模块
    private List<IndexManagerModelVO> managerModelVOs;

    public IndexVO() {
    }

    public IndexVO(ManagerWeb managerWeb, List<ManagerNavigation> headManagerNavigations, List<ManagerNavigation> tailManagerNavigations, List<IndexManagerModelVO> managerModelVOs) {
        this.managerWeb = managerWeb;
        this.headManagerNavigations = headManagerNavigations;
        this.tailManagerNavigations = tailManagerNavigations;
        this.managerModelVOs = managerModelVOs;
    }

    public ManagerWeb getManagerWeb() {
        return managerWeb;
    }

    public void setManagerWeb(ManagerWeb managerWeb) {
        this.managerWeb = managerWeb;
    }

    public List<ManagerNavigation> getHeadManagerNavigations() {
        return headManagerNavigations;
    }

    public void setHeadManagerNavigations(List<ManagerNavigation> headManagerNavigations) {
        this.headManagerNavigations = headManagerNavigations;
    }

    public List<ManagerNavigation> getTailManagerNavigations() {
        return tailManagerNavigations;
    }

    public void setTailManagerNavigations(List<ManagerNavigation> tailManagerNavigations) {
        this.tailManagerNavigations = tailManagerNavigations;
    }

    public List<IndexManagerModelVO> getManagerModelVOs() {
        return managerModelVOs;
    }

    public void setManagerModelVOs(List<IndexManagerModelVO> managerModelVOs) {
        this.managerModelVOs = managerModelVOs;
    }

    public LinkedHashSet<String> getCities() {
        return cities;
    }

    public void setCities(LinkedHashSet<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "IndexVO{" +
                "cities=" + cities +
                ", managerWeb=" + managerWeb +
                ", headManagerNavigations=" + headManagerNavigations +
                ", tailManagerNavigations=" + tailManagerNavigations +
                ", managerModelVOs=" + managerModelVOs +
                '}';
    }
}
