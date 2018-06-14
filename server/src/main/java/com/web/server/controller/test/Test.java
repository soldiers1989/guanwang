package com.web.server.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sky
 * create 2018/05/09
 * email sky.li@ixiaoshuidi.com
 **/
@Controller
@RequestMapping(value = "{userid}")
public class Test {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        System.out.println("hello======test");
        return "index";

    }

}
