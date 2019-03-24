package com.tangkc.loginrestful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tangkc.loginrestful.dao")
@SpringBootApplication
public class OginrestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OginrestfulApplication.class, args);
    }

}
