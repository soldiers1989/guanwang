package com.web.business.page.website;

import lombok.Data;

/**
 * @author Sky
 * create 2018/06/08
 * email sky.li@ixiaoshuidi.com
 **/
@Data
public class WatchRoomSubmitVO {
    //房间Id
    private Integer roomId;

    //姓名
    private String nickname;

    //手机号
    private String phone;

    //短信验证码
    private String code;

    //看房时间
    private String watchTime;

    //预约看房备注(表单数据)
    private String remark;

    //房型预约数据
    private String comment;
}
