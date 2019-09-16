package com.test.spring.test.beanplay;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanPlayPrototype {

    private final long timeOfCreation;

    public BeanPlayPrototype() {

        timeOfCreation = System.currentTimeMillis();
    }

    public void tryPrototype() {
        System.out.println("Prototype here " + timeOfCreation);
    }

}
