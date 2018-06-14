package com.web.business.service.website;

import com.web.business.page.website.IndexHomeVO;
import com.web.business.page.website.IndexVO;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @author Sky
 * create 2018/05/14
 * email sky.li@ixiaoshuidi.com
 **/
public interface IndexService {
    /**
     * 官网首页模块展示
     *
     * @param city
     * @param managerWebId
     * @return
     */
    IndexVO findMiddleIndexVO(String city, IndexVO indexVO, Integer managerWebId);

    /**
     * 官网首页头部展示
     *
     * @param city
     * @param managerWebId
     * @return
     */
    IndexVO findHeadIndexVO(String city, IndexVO indexVO, Integer managerWebId);

    /**
     * 官网首页尾部展示
     *
     * @param managerWebId
     * @return
     */
    IndexVO findTailIndexVO(IndexVO indexVO, Integer managerWebId);


}
