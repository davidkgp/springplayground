package com.test.spring.test.beanplay;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class BeanSingletonUsePrototypeLookup {

    @Lookup
    public BeanPlayPrototype beanPlay() {
        return null;

    }

}
