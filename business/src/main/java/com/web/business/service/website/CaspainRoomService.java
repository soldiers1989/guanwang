package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.Room;

public interface CaspainRoomService {

	List<Room> getRoomByHouseIds(List<Integer> houseIds);
	

}
