package com.web.business.dao.caspain;

import com.web.business.model.caspain.UserProfile;
import com.web.business.model.caspain.UserProfileExample;
import com.web.business.model.caspain.UserProfileKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileMapper {
    int countByExample(UserProfileExample example);

    int deleteByExample(UserProfileExample example);

    int deleteByPrimaryKey(UserProfileKey key);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    List<UserProfile> selectByExample(UserProfileExample example);

    UserProfile selectByPrimaryKey(UserProfileKey key);

    int updateByExampleSelective(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}