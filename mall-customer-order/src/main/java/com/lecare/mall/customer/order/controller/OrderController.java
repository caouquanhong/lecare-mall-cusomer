package com.lecare.mall.customer.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("test")
    public String test(){
        System.out.println("zhixingle");
        return "";
    }
}
