package com.chan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import user.UserService;

/**
 * @Auther: Chan
 * @Date: 2019/7/13 14:06
 * @Description:
 */
@RestController
public class CommodityController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return userService.hello();
    }

}
