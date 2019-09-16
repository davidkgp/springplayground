package com.test.spring.test.beanplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanSingletonUsePrototypeProxy {

    @Autowired
    private BeanPlayPrototypeProxy getPrototype;

    public BeanPlayPrototypeProxy beanPlay() {
        return getPrototype;

    }

}
