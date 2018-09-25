package com.wx.nr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wx.nr.dao")
public class NrApplication {

    public static void main(String[] args) {
        SpringApplication.run(NrApplication.class, args);
    }
}
