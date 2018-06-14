package com.web.business.service.website.impl;

import com.alibaba.fastjson.JSONObject;
import com.web.business.dao.caspain.*;
import com.web.business.dao.volga.ApartmentMapper;
import com.web.business.model.caspain.*;
import com.web.business.page.website.EntrustRoomSubmitVO;
import com.web.business.page.website.WatchRoomSubmitVO;
import com.web.business.service.website.EntrustRoomService;
import com.web.common.support.ResponseBodyVO;
import com.web.common.utils.ConstUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author Sky
 * create 2018/06/10
 * email sky.li@ixiaoshuidi.com
 **/
@Service
public class EntrustRoomServiceImpl implements EntrustRoomService {

    private static final Logger LOG = LoggerFactory.getLogger(EntrustRoomServiceImpl.class);

    @Resource
    private HuangheDistrictMapper huangheDistrictMapper;
    @Resource
    private CustomerResMapper customerResMapper;

    @Override
    public ResponseBodyVO sendEntrustInfo(EntrustRoomSubmitVO entrustRoomSubmitVO) {
        CustomerRes customerRes = new CustomerRes();
        String[] prices = entrustRoomSubmitVO.getPrice().split(";");
        customerRes.setMinRent(prices[0]);
        customerRes.setMaxRent(prices[1]);
        customerRes.setCreatedById(entrustRoomSubmitVO.getUserId());
        customerRes.setPhone(entrustRoomSubmitVO.getPhone());
        customerRes.setComments(entrustRoomSubmitVO.getRemark());
        customerRes.setCreatedAt(new Date());
        customerRes.setCustomerType("public");
        customerRes.setName(entrustRoomSubmitVO.getNickname());
        customerRes.setStatus((short) 1);
        customerRes.setSex("other");
        customerRes.setUrgency((short) 1);
        customerRes.setSource((short) 5);
        customerRes.setRoomSource((short) 1);
        customerRes.setVersion(0);
        customerRes.setHeadcount((short) 1);
        customerRes.setIsDelete(false);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            customerRes.setWantedDay(dateFormat.parse(entrustRoomSubmitVO.getCheckinTime()));
        } catch (ParseException e) {
            LOG.error("日期解析出错:{}", e.getMessage());
            e.printStackTrace();
        }
        customerRes.setAddress(entrustRoomSubmitVO.getCity() + "-" + entrustRoomSubmitVO.getDistrict());
        customerResMapper.insert(customerRes);
        ResponseBodyVO result = new ResponseBodyVO(0, null, null);
        return result;
    }

    @Override
    public String getDistrictsByCity(String city, Integer userId) {
        HuangheDistrictExample huangheDistrictExample = new HuangheDistrictExample();
        huangheDistrictExample.createCriteria().andCityEqualTo(city);
        List<HuangheDistrict> huangheDistricts = huangheDistrictMapper.selectByExample(huangheDistrictExample);
        String districts = "";
        for (int i = 0; i < huangheDistricts.size(); i++) {
            if (i != huangheDistricts.size() - 1) {
                districts += huangheDistricts.get(i).getDistrict() + ",";
            } else {
                districts += huangheDistricts.get(i).getDistrict();
            }
        }
        return districts;
    }
}
