package com.chan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chan.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Chan
 * @Date: 2019/7/13 14:06
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    @Qualifier(value = "userServiceImpl")
//    @Reference
    private UserServiceImpl userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return userService.hello();
    }

}
