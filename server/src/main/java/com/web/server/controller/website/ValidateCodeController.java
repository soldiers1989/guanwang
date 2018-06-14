package com.web.server.controller.website;

import com.alibaba.druid.sql.dialect.phoenix.visitor.PhoenixASTVisitor;
import com.alibaba.fastjson.JSONObject;
import com.web.business.page.website.ValidateCodeVO;
import com.web.common.support.ResponseBodyVO;
import com.web.common.utils.client.HttpClientUtil;
import com.web.common.utils.sms.SmsUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Sky
 * create 2018/06/07
 * email sky.li@ixiaoshuidi.com
 **/
//获取验证码
@Controller
public class ValidateCodeController {

    @Value("${sms.baseUrl}")
    private String smsUrl;


    //发送短信验证码
    @RequestMapping(value = "/sms/code", method = RequestMethod.POST)
    @ResponseBody
    public ResponseBodyVO getCode(@RequestBody ValidateCodeVO validateCodeVO) {
        String phone = validateCodeVO.getPhone();
        boolean bool = SmsUtil.sendCode(smsUrl, phone, 30);
        if (bool) {
            return new ResponseBodyVO(0, null, "发送成功");
        }
        return new ResponseBodyVO(-1, null, "发送失败");
    }


}
