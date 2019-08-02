package com.chan;

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
@SpringBootApplication
public class PostApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PostApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PostApplication.class, args);
        log.info("commodity start...");
    }

}
