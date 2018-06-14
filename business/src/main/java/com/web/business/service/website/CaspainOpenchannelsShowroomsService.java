package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.OpenchannelsShowroomsWithBLOBs;
import com.web.business.page.website.HouseListVo;

public interface CaspainOpenchannelsShowroomsService {

	List<OpenchannelsShowroomsWithBLOBs> getRawDataByRoomId(List<Integer> roomIds, List<HouseListVo> houseListVos);

}
