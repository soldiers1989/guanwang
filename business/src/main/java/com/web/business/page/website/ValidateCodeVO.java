package com.web.business.page.website;

import lombok.Data;

/**
 * @author Sky
 * create 2018/06/07
 * email sky.li@ixiaoshuidi.com
 **/
//验证码对象
@Data
public class ValidateCodeVO {
    //验证手机号
    private String phone;

    private String csrfmiddlewaretoken;
}
