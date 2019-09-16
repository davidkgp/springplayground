package com.test.spring.test.service;

import com.test.spring.test.beanplay.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testSingletonBeanWiring() {

        BeanPlaySingleton beanPlaySingleton = applicationContext.getBean(BeanPlaySingleton.class);
        beanPlaySingleton.trySingleton();
        beanPlaySingleton = applicationContext.getBean(BeanPlaySingleton.class);
        beanPlaySingleton.trySingleton();
        beanPlaySingleton = applicationContext.getBean(BeanPlaySingleton.class);
        beanPlaySingleton.trySingleton();
        beanPlaySingleton = applicationContext.getBean(BeanPlaySingleton.class);
        beanPlaySingleton.trySingleton();

        assertNotNull(beanPlaySingleton);

    }

    @Test
    public void testPrototypeBeanWiring() {

        BeanPlayPrototype beanPlayPrototype = applicationContext.getBean(BeanPlayPrototype.class);
        beanPlayPrototype.tryPrototype();
        beanPlayPrototype = applicationContext.getBean(BeanPlayPrototype.class);
        beanPlayPrototype.tryPrototype();
        beanPlayPrototype = applicationContext.getBean(BeanPlayPrototype.class);
        beanPlayPrototype.tryPrototype();

        assertNotNull(beanPlayPrototype);

    }

    @Test//so both beans are initialized once even though the one inside is prototype
    public void testSingletonBeanUsePrototypeWiring() {

        BeanSingletonUsePrototype beanSingletonUsePrototype = applicationContext.getBean(BeanSingletonUsePrototype.class);
        BeanPlayPrototype x1 = beanSingletonUsePrototype.beanPlay();
        x1.tryPrototype();

        BeanSingletonUsePrototype beanSingletonUsePrototype2 = applicationContext.getBean(BeanSingletonUsePrototype.class);
        BeanPlayPrototype x2 = beanSingletonUsePrototype2.beanPlay();
        x2.tryPrototype();


        assertNotNull(beanSingletonUsePrototype);

    }


    @Test
    public void testSingletonBeanUsePrototypeWiringLookup() {

        BeanSingletonUsePrototypeLookup beanSingletonUsePrototype = applicationContext.getBean(BeanSingletonUsePrototypeLookup.class);
        BeanPlayPrototype x1 = beanSingletonUsePrototype.beanPlay();
        x1.tryPrototype();

        BeanSingletonUsePrototypeLookup beanSingletonUsePrototype2 = applicationContext.getBean(BeanSingletonUsePrototypeLookup.class);
        BeanPlayPrototype x2 = beanSingletonUsePrototype2.beanPlay();
        x2.tryPrototype();


        assertEquals(beanSingletonUsePrototype, beanSingletonUsePrototype2);

    }

    @Test
    public void testSingletonBeanUsePrototypeWiringSupplier() {

        BeanSingletonUsePrototypeFunction beanSingletonUsePrototype = applicationContext.getBean(BeanSingletonUsePrototypeFunction.class);
        BeanPlayPrototype x1 = beanSingletonUsePrototype.beanPlay();
        x1.tryPrototype();

        BeanSingletonUsePrototypeFunction beanSingletonUsePrototype2 = applicationContext.getBean(BeanSingletonUsePrototypeFunction.class);
        BeanPlayPrototype x2 = beanSingletonUsePrototype2.beanPlay();
        x2.tryPrototype();


        assertEquals(beanSingletonUsePrototype, beanSingletonUsePrototype2);

    }

    @Test
    public void testSingletonBeanUsePrototypeWiringProxy() {

        BeanSingletonUsePrototypeProxy beanSingletonUsePrototype = applicationContext.getBean(BeanSingletonUsePrototypeProxy.class);
        BeanPlayPrototypeProxy x1 = beanSingletonUsePrototype.beanPlay();
        x1.tryPrototype();

        BeanSingletonUsePrototypeProxy beanSingletonUsePrototype2 = applicationContext.getBean(BeanSingletonUsePrototypeProxy.class);
        BeanPlayPrototypeProxy x2 = beanSingletonUsePrototype2.beanPlay();
        x2.tryPrototype();


        assertEquals(beanSingletonUsePrototype, beanSingletonUsePrototype2);

    }

}
