package com.test.spring.test.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Student {

    private final String name;
    private final int age;
    private final String nickName;

}
