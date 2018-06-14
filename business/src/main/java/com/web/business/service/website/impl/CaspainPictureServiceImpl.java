package com.web.business.service.website.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.PictureMapper;
import com.web.business.dao.caspain.RoomPicturesMapper;
import com.web.business.model.caspain.Picture;
import com.web.business.model.caspain.PictureExample;
import com.web.business.model.caspain.PictureExample.Criteria;
import com.web.business.page.website.HouseListVo;
import com.web.business.model.caspain.RoomPictures;
import com.web.business.model.caspain.RoomPicturesExample;
import com.web.business.service.website.CaspainPictureService;

@Service
public class CaspainPictureServiceImpl implements CaspainPictureService{
	@Resource(name="caspainPictureMapper")
	private PictureMapper pictureMapper;
	@Resource(name="caspainRoomPicturesMapper")
	private RoomPicturesMapper roomPicturesMapper;
	@Override
	public List<Picture> getPictureUrlByRoomId(List<Integer> roomIds,List<HouseListVo> houseList) {
		//通过roomId从中间表获取pictureId
		List<Integer> pictureIds = new ArrayList<Integer>();
		RoomPicturesExample roomPicturesExample = new RoomPicturesExample();
		roomPicturesExample.setDistinct(true);
		RoomPicturesExample.Criteria RoomPicturesCriteria = roomPicturesExample.createCriteria();
		RoomPicturesCriteria.andRoomIdIn(roomIds);
		List<RoomPictures> roomPictures = roomPicturesMapper.selectByExample(roomPicturesExample);
		for (RoomPictures roomPicture : roomPictures) {
			Integer pictureId = roomPicture.getPictureId();
			pictureIds.add(pictureId);
		}
		roomPicturesExample.clear();
		//根据pictureId获取图片路径
		PictureExample pictureExample = new PictureExample();
		pictureExample.setDistinct(true);
		PictureExample.Criteria pictureCriteria = pictureExample.createCriteria();
		pictureCriteria.andIdIn(pictureIds);
		List<Picture> picturesUrl = pictureMapper.selectByExample(pictureExample);
		for (Picture picture : picturesUrl) {
			System.out.println(picture.getUrl());
			System.out.println(picture.getId());
		}
		for (int i = 0; i < houseList.size(); i++) {
			System.out.println(houseList.get(i).getImgUrl());
		}
		System.out.println();
		pictureExample.clear();
		return picturesUrl;
	}
}
