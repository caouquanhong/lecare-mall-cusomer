package com.lecare.mall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//标识这是一个Eureka服务
@SpringBootApplication
public class MallEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallEurekaApplication.class, args);
    }

}
