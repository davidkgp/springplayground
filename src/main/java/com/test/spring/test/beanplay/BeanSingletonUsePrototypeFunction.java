package com.test.spring.test.beanplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class BeanSingletonUsePrototypeFunction {

    @Autowired
    private Supplier<BeanPlayPrototype> getPrototype;

    public BeanPlayPrototype beanPlay() {
        return getPrototype.get();

    }

}
