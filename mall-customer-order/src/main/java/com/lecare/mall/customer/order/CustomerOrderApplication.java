package com.lecare.mall.customer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CustomerOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerOrderApplication.class, args);
    }

}
