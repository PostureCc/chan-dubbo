package com.chan.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import user.UserService;

/**
 * @Auther: Chan
 * @Date: 2019/7/13 14:32
 * @Description:
 */
//设置接口调用的最大超时时间 重试机制3次
@Service(timeout = 1000)
@Component(value = "userServiceImpl")
public class UserServiceImpl implements UserService {

    @Override
    public String hello() {
        System.err.println("hello...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

}
