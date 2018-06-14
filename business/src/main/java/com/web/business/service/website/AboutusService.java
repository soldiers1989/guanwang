package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.ManagerAboutus;

public interface AboutusService {

	List<ManagerAboutus> getAboutusInfor();

	ManagerAboutus getAboutusById(Integer id);

}
