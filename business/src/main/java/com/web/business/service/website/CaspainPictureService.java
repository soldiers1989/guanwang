package com.web.business.service.website;

import java.util.List;

import com.web.business.model.caspain.Picture;
import com.web.business.page.website.HouseListVo;

public interface CaspainPictureService {

	List<Picture> getPictureUrlByRoomId(List<Integer> roomIds, List<HouseListVo> houseList);

}
