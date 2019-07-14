package com.chan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Auther: Chan
 * @Date: 2019/7/13 13:47
 * @Description:
 */
@Log4j2
// 开启基于注解的dubbo功能（主要是包扫描@DubboComponentScan）
// 也可以在配置文件中使用dubbo.scan.base-package来替代   @EnableDubbo
@EnableDubbo
@SpringBootApplication
public class UserApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UserApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        log.info("user start...");
    }

}
