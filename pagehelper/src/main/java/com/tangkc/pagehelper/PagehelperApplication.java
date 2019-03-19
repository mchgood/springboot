package com.tangkc.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("mapper.tangkc.pagehelper.mapper")
@SpringBootApplication
public class PagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PagehelperApplication.class, args);
    }

}
