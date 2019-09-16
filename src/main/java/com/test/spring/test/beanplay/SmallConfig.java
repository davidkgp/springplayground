package com.test.spring.test.beanplay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class SmallConfig {

    @Bean
    public Supplier<BeanPlayPrototype> getBeanPlayPrototype() {
        return () -> new BeanPlayPrototype();
    }

}
