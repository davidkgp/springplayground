package com.test.spring.test.beanplay;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BeanPlayPrototypeProxy {

    private final long timeOfCreation;

    public BeanPlayPrototypeProxy() {

        timeOfCreation = System.currentTimeMillis();
    }

    public void tryPrototype() {
        System.out.println("Prototype here " + timeOfCreation);
    }

}
