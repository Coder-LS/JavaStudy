package com.zg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.xxx.xxx.mapper"})
public class application {

    public static void main(String[] args){
        // 运行spring应用
        SpringApplication.run(application.class, args);
    }
}