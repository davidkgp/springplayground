package com.test.spring.test;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TheDataNeedsMyData{
    private final Mydata myData;

    public void doSomethingWithData(){
        System.out.println("In doSomethingWithData");
        myData.inMyData();
    }
}
