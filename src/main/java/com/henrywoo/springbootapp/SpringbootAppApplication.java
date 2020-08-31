package com.henrywoo.springbootapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.henrywoo.springbootapp.mapper")
public class SpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppApplication.class, args);
    }

}
