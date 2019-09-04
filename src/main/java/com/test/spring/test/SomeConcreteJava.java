package com.test.spring.test;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SomeConcreteJava {

    private final String value;

    public void doSomeConcrete(){
        System.out.println("Doing something concrete here "+value);
    }
}
