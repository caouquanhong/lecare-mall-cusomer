package com.lecare.mall.mall.customer.gateway;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 路由配置
 */
@EnableEurekaClient
@SpringCloudApplication
public class MallCustomerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCustomerGatewayApplication.class, args);
    }

}
