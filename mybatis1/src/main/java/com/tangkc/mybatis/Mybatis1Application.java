package com.tangkc.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tangkc.mybatis.mapper")
@SpringBootApplication
public class Mybatis1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis1Application.class, args);
    }

}
