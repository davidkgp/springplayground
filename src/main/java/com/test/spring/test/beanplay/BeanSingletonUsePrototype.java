package com.test.spring.test.beanplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanSingletonUsePrototype {


    @Autowired
    private BeanPlayPrototype beanPlayPrototype;

    private final long timeOfCreation;

    public BeanSingletonUsePrototype() {

        timeOfCreation = System.currentTimeMillis();
    }

    public BeanPlayPrototype beanPlay() {
        System.out.println("Here is usage " + timeOfCreation);
        return beanPlayPrototype;

    }

}
