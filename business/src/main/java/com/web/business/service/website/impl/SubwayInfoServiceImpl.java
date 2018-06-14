package com.web.business.service.website.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.web.business.model.api.SubwayStationVo;
import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.SubwayInfoMapper;
import com.web.business.model.caspain.SubwayInfo;
import com.web.business.model.caspain.SubwayInfoExample;
import com.web.business.service.website.SubwayInfoService;
@Service
public class SubwayInfoServiceImpl implements SubwayInfoService {
	@Resource
	private SubwayInfoMapper subwayInfoMapper;

	@Override
	public Map<String,ArrayList<SubwayStationVo>> getSubwayLinesByCity(String city) {
		if(city==null){
			city="上海";
		}
		SubwayInfoExample subwayInfoExample = new SubwayInfoExample();
		subwayInfoExample.createCriteria().andCityNameEqualTo(city);
		List<SubwayInfo> subways = subwayInfoMapper.selectByExample(subwayInfoExample);
		List<String> subwayLines = new ArrayList<String>();
		List<String> subwayStations = new ArrayList<String>();
		Map<String,ArrayList<SubwayStationVo>> subwayLineAndStation = new HashMap<>();
		for (int i=0;i< subways.size();i++) {
			String line = subways.get(i).getSubwayLine();
			if (!subwayLines.contains(line)) {
				subwayLines.add(line);
				ArrayList<SubwayStationVo> stations = subwayInfoMapper.getSubwayStationsByLines(city,line);
				subwayLineAndStation.put(line,stations);
			}
		}
		//System.out.println(subwayLineAndStation);
		return subwayLineAndStation;
	}
}
