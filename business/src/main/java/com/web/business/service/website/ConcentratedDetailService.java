package com.web.business.service.website;

import com.web.business.model.volga.RoomAssets;
import com.web.business.page.website.ConcentratedApartmentDetailVO;
import com.web.business.page.website.ConcentratedHouseTypeVO;
import com.web.business.page.website.IndexHomeVO;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/28
 * email sky.li@ixiaoshuidi.com
 **/
public interface ConcentratedDetailService {
    /**
     * 查询公寓详细信息
     *
     * @param apartmentId
     * @return
     */
    ConcentratedApartmentDetailVO findApartmentDetail(Integer apartmentId);

    /**
     * 查询所有房型信息
     *
     * @param apartmentId
     * @return
     */
    List<ConcentratedHouseTypeVO> findAllHouseTypes(Integer apartmentId);

    /**
     * 查询公寓下的配置
     *
     * @param apartmentId
     * @return
     */
    RoomAssets findApartmentAssets(Integer apartmentId);

    /**
     * 查询集中式和分散式相似的房源信息
     *
     * @param apartmentId
     * @return
     */
    List<IndexHomeVO> findSimilarlyRooms(Integer apartmentId);
}
