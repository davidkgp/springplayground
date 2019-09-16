package com.test.spring.test.beanplay;

import org.springframework.stereotype.Component;

@Component
public class BeanPlaySingleton {

    private final long timeOfCreation;

    public BeanPlaySingleton() {

        timeOfCreation = System.currentTimeMillis();
    }

    public void trySingleton() {
        System.out.println("Single ton here " + timeOfCreation);
    }
}
