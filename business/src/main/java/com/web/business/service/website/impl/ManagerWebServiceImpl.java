package com.web.business.service.website.impl;

import com.web.business.dao.caspain.ManagerWebMapper;
import com.web.business.model.caspain.ManagerWeb;
import com.web.business.model.caspain.ManagerWebExample;
import com.web.business.service.website.ManagerWebService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
@Service("managerWebService")
public class ManagerWebServiceImpl implements ManagerWebService {
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
