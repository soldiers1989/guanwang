package com.web.business.service.website;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.web.business.model.api.SubwayStationVo;
import com.web.business.model.caspain.SubwayInfo;

public interface SubwayInfoService {

	Map<String,ArrayList<SubwayStationVo>> getSubwayLinesByCity(String city);

}
