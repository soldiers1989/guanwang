package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.OpenchannelsShowroomsMapper;
import com.web.business.dao.caspain.PictureMapper;
import com.web.business.model.caspain.OpenchannelsShowroomsExample;
import com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs;
import com.web.business.model.caspain.Picture;
import com.web.business.page.website.HouseListVo;
import com.web.business.service.website.CaspainOpenchannelsShowroomsService;
@Service
public class CaspainOpenchannelsShowroomsServiceImpl implements CaspainOpenchannelsShowroomsService{
	@Resource(name = "caspainOpenchannelsShowroomsMapper")
	private OpenchannelsShowroomsMapper openchannelsShowroomsMapper;
	@Resource(name = "caspainPictureMapper")
	private PictureMapper caspainPictureMapper;
	@Override
	public List<OpenchannelsShowroomsWithBLOBs> getRawDataByRoomId(List<Integer> roomIds,List<HouseListVo> houseListVos) {

		OpenchannelsShowroomsExample example = new OpenchannelsShowroomsExample();
		example.setDistinct(true);
		OpenchannelsShowroomsExample.Criteria criteria = example.createCriteria();
		criteria.andRoomIdIn(roomIds);
		List<OpenchannelsShowroomsWithBLOBs> rawDatas = openchannelsShowroomsMapper.selectByExampleWithBLOBs(example);
		for (OpenchannelsShowroomsWithBLOBs openchannelsShowrooms : rawDatas) {
			JSONObject rawDataJson = JSONObject.parseObject(openchannelsShowrooms.getRawData());
			String pictures = rawDataJson.getString("pictures");
			String pictureId = pictures.split(",")[0];
			String roomDesc = rawDataJson.getString("room_desc");
			Picture picture = caspainPictureMapper.selectByPrimaryKey(Integer.valueOf(pictureId));
			if (openchannelsShowrooms.getStatus()==3) {
				for (int i = 0; i < roomIds.size(); i++) {
					if(roomIds.get(i).equals(openchannelsShowrooms.getRoomId())){
						houseListVos.get(i).setRemark(roomDesc);
						houseListVos.get(i).setImgUrl(picture.getUrl());
					}
				}
			}
		} 
		return rawDatas;
	}
}
