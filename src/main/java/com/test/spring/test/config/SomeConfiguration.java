package com.test.spring.test.config;

import com.test.spring.test.DependOnSomethingConcrete;
import com.test.spring.test.SomeConcreteJava;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {

    @Value("string value")
    private String stringValue;

    @Bean
    public DependOnSomethingConcrete getDependOnSomethingConcrete(SomeConcreteJava someConcreteJava){
        return new DependOnSomethingConcrete(someConcreteJava);
    }

    @Bean
    public SomeConcreteJava getSomeConcreteJava(){
        return new SomeConcreteJava(stringValue);
    }

}
