package com.web.business.service.website;

import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.common.support.ResponseBodyVO;

/**
 * @author Sky
 * create 2018/06/08
 * email sky.li@ixiaoshuidi.com
 **/
public interface WatchRoomServie {

    /**
     * 新增预约记录
     *
     * @param watchRoomSubmitVO
     * @return
     */
    ResponseBodyVO sendOrdersInfo(WatchRoomSubmitVO watchRoomSubmitVO);
}
