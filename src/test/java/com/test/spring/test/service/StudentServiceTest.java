package com.test.spring.test.service;

import com.test.spring.test.DependOnSomethingConcrete;
import com.test.spring.test.Mydata;
import com.test.spring.test.SomeConcreteJava;
import com.test.spring.test.TheDataNeedsMyData;
import com.test.spring.test.dto.Student;
import com.test.spring.test.repositories.StudentRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    StudentService studentService;
    StudentRepo studentRepo;
    TheDataNeedsMyData needsMyData;
    DependOnSomethingConcrete somethingConcrete;


    @Test
    void getDataForStudent() {
        studentRepo = Mockito.mock(StudentRepo.class);
        needsMyData = Mockito.spy(new TheDataNeedsMyData(new Mydata()));
        somethingConcrete = Mockito.spy(new DependOnSomethingConcrete(new SomeConcreteJava("MeraNaam")));
        doCallRealMethod().when(needsMyData).doSomethingWithData();
        doCallRealMethod().when(somethingConcrete).doSomethingDependent();
        when(studentRepo.getStudentDataFromDB()).thenReturn(new Student("Haskel",23,"Hask"));
        studentService = new StudentService(studentRepo,needsMyData,somethingConcrete);
        assertEquals(new Student("Haskel",23,"Hask"),studentService.getDataForStudent());
    }
}