package com.test.spring.test;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DependOnSomethingConcrete {
    final SomeConcreteJava someConcreteJava;

    public void doSomethingDependent(){
        System.out.println("Doing something dependent");
        someConcreteJava.doSomeConcrete();
    }

}
