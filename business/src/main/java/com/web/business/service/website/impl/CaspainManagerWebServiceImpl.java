package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.ManagerWebMapper;
import com.web.business.model.caspain.ManagerWeb;
import com.web.business.model.caspain.ManagerWebExample;
import com.web.business.service.website.CaspainManagerWebService;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
@Service("caspainManagerWebService")
public class CaspainManagerWebServiceImpl implements CaspainManagerWebService {
    @Resource
    private ManagerWebMapper managerWebMapper;

    @Override
    public ManagerWeb findManagerWebByUndomainUrl(String undomainUrl) {
        ManagerWebExample example = new ManagerWebExample();
        example.createCriteria().andUndomainUrlEqualTo(undomainUrl);
        List<ManagerWeb> managerWebs = managerWebMapper.selectByExample(example);
        return managerWebs.get(0);
    }

    @Override
    public ManagerWeb findManagerWebByDomainUrl(String domainName) {
        ManagerWebExample example = new ManagerWebExample();
        example.createCriteria().andDomainUrlEqualTo(domainName);
        List<ManagerWeb> managerWebs = managerWebMapper.selectByExample(example);
        return managerWebs.get(0);
    }
}
