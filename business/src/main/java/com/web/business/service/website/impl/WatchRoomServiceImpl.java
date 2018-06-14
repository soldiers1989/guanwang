package com.web.business.service.website.impl;

import com.web.business.dao.caspain.CustomerResMapper;
import com.web.business.dao.caspain.RoomMapper;
import com.web.business.dao.volga.LayoutMapper;
import com.web.business.model.caspain.CustomerRes;
import com.web.business.model.caspain.RoomWithBLOBs;
import com.web.business.model.volga.Layout;
import com.web.business.model.volga.LayoutExample;
import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.business.service.website.WatchRoomServie;
import com.web.common.support.ResponseBodyVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Sky
 * create 2018/06/08
 * email sky.li@ixiaoshuidi.com
 **/
@Service
public class WatchRoomServiceImpl implements WatchRoomServie {

    @Resource
    private CustomerResMapper customerResMapper;
    @Resource(name = "caspainRoomMapper")
    private RoomMapper caspainRoomMapper;
    @Resource
    private LayoutMapper layoutMapper;

    @Override
    public ResponseBodyVO sendOrdersInfo(WatchRoomSubmitVO watchRoomSubmitVO) {
        CustomerRes customerRes = new CustomerRes();
        customerRes.setBookTime(watchRoomSubmitVO.getWatchTime());
        customerRes.setPhone(watchRoomSubmitVO.getPhone());
        customerRes.setComments(watchRoomSubmitVO.getComment() + watchRoomSubmitVO.getRemark());
        customerRes.setCreatedAt(new Date());
        customerRes.setCustomerType("public");
        customerRes.setName(watchRoomSubmitVO.getNickname());
        customerRes.setStatus((short) 1);
        customerRes.setSex("other");
        customerRes.setUrgency((short) 1);
        customerRes.setSource((short) 5);
        if (StringUtils.isBlank(watchRoomSubmitVO.getComment())) {
            //分散式(1)
            customerRes.setRoomSource((short) 1);
            //房间Id
            Integer roomId = watchRoomSubmitVO.getRoomId();
            RoomWithBLOBs roomWithBLOBs = caspainRoomMapper.selectByPrimaryKey(roomId);
            customerRes.setCreatedById(roomWithBLOBs.getCreatedById());
            customerRes.setRoomId(roomId);
        } else {
            //集中式(2)
            customerRes.setRoomSource((short) 2);
            //房型id
            Integer layoutId = watchRoomSubmitVO.getRoomId();
            Layout layout = layoutMapper.selectByPrimaryKey(layoutId);
            customerRes.setCreatedById(layout.getCreatedBy());
        }
        customerRes.setVersion(0);
        customerRes.setIsDelete(false);
        customerRes.setHeadcount((short) 1);
        customerResMapper.insert(customerRes);
        ResponseBodyVO result = new ResponseBodyVO(0, null, null);
        return result;
    }
}
