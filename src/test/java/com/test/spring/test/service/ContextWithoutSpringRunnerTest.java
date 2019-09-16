package com.test.spring.test.service;

import com.test.spring.test.DependOnSomethingConcrete;
import com.test.spring.test.SomeConcreteJava;
import com.test.spring.test.config.SomeConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class ContextWithoutSpringRunnerTest {

    @Test
    public void testGetBeansWithoutStartingSpringBoot(){

        AbstractApplicationContext context
                = new AnnotationConfigApplicationContext(SomeConfiguration.class);
        DependOnSomethingConcrete obj = context.getBean(DependOnSomethingConcrete.class);
        obj.doSomethingDependent();
        SomeConcreteJava obj2 = context.getBean(SomeConcreteJava.class);
        obj2.doSomeConcrete();
        Assert.assertNotNull(obj);
        Assert.assertNotNull(obj2);


    }
}
