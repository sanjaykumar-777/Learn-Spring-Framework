package com.example.sanjay_kumar777.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    /**
     * Field based dependency injection
     */

    private DataService dataService;

    /**
     * setter based dependency injecction
     * @return
     */
    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("setter based injection");
        this.dataService = dataService;
    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
