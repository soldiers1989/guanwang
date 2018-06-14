package com.web.business.service.website;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.business.model.caspain.Area;
import com.web.business.model.caspain.AreaExample;

public interface CaspainAreaService {

    List<String> getAreaByCity(String city);
    
}
