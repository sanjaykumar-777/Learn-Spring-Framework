package com.example.sanjay_kumar777.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    /**
     * Constructor based dependency injection
     * @param businessService
     */
    public MyWebController(BusinessService businessService){
        super();
        this.businessService = businessService;
    }
    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}
