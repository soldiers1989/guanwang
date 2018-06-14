package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.ManagerHelpcenter;

public interface HelpCenterService {

	List<ManagerHelpcenter> getAboutusInfor();

	ManagerHelpcenter getAboutusById(Integer id);

}
