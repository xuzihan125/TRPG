package com.trpg.version1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan({"com.trpg.version1.mybatis.dao"})
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class Version1Application {

    public static void main(String[] args) {
        SpringApplication.run(Version1Application.class, args);
    }

}
