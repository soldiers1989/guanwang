package com.web.business.service.website.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.business.dao.caspain.RoomMapper;
import com.web.business.model.caspain.Room;
import com.web.business.model.caspain.RoomExample;
import com.web.business.service.website.CaspainRoomService;
@Service
public class CaspainRoomServiceImpl implements CaspainRoomService {
	@Resource(name="caspainRoomMapper")
	private RoomMapper caspainRoomMapper;
	@Override
	public List<Room> getRoomByHouseIds(List<Integer> houseIds) {
		RoomExample roomExample = new RoomExample();
		roomExample.setDistinct(true);
		roomExample.setLimitStart(0);
		roomExample.setPageSize(10);
		RoomExample.Criteria criteria = roomExample.createCriteria();
		criteria.andHouseIdIn(houseIds);
		List<Room> rooms = caspainRoomMapper.selectByExample(roomExample);
		return rooms;
	}

}
