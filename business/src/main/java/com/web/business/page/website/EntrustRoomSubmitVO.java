package com.web.business.page.website;

import lombok.Data;

/**
 * @author Sky
 * create 2018/06/11
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class EntrustRoomSubmitVO {
    //用户id（该网站的主账号）
    private Integer userId;

    //姓名
    private String nickname;

    //手机号
    private String phone;

    //短信验证码
    private String code;

    //入住时间
    private String checkinTime;

    //城市
    private String city;

    //区域
    private String district;

    //价格
    private String price;

    //其他要求
    private String remark;

}

