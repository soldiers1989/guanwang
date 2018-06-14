package com.web.business.service.website;

import com.web.business.model.caspain.ManagerWeb;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
public interface ManagerWebService {
    /**
     * 根据组合域名查询官网信息
     *
     * @param undomainUrl
     * @return
     */
    ManagerWeb findManagerWebByUndomainUrl(String undomainUrl);

    /**
     * 根据域名查询官网信息
     *
     * @param domainName
     * @return
     */
    ManagerWeb findManagerWebByDomainUrl(String domainName);

}
