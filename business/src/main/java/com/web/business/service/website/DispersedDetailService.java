package com.web.business.service.website;

import com.web.business.model.caspain.RoomAssets;
import com.web.business.page.website.DispersedRoomDetailVO;
import com.web.business.page.website.DispersedRoomieDetailVO;
import com.web.business.page.website.IndexHomeVO;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/27
 * email sky.li@ixiaoshuidi.com
 **/
public interface DispersedDetailService {
    /**
     * 根据roomId查询房间信息
     *
     * @param roomId
     * @return
     */
    DispersedRoomDetailVO findDetailInfoByRoomId(Integer roomId);

    /**
     * 查询房间配置
     *
     * @param roomId
     * @return
     */
    RoomAssets findRoomPlanning(Integer roomId);

    /**
     * 查询室友情况
     *
     * @param roomId
     * @return
     */
    List<DispersedRoomieDetailVO> findRoomieDetail(Integer roomId);

    /**
     * 查询相似房源
     *
     * @param roomId
     * @return
     */
    List<IndexHomeVO> findSimilarlyRooms(Integer roomId);
}
