package com.web.business.service.website;

import com.web.business.page.website.EntrustRoomSubmitVO;
import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.common.support.ResponseBodyVO;

/**
 * @author Sky
 * create 2018/06/10
 * email sky.li@ixiaoshuidi.com
 **/
public interface EntrustRoomService {
    /**
     * 保存委托信息
     *
     * @param entrustRoomSubmitVO
     * @return
     */
    ResponseBodyVO sendEntrustInfo(EntrustRoomSubmitVO entrustRoomSubmitVO);

    /**
     * 根据城市查询所有区域
     *
     * @param city
     * @param userId
     * @return
     */
    String getDistrictsByCity(String city, Integer userId);
}
