package com.test.spring.test.controller;

import com.test.spring.test.dto.Student;
import com.test.spring.test.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MyController {

    @Autowired
    StudentService studentService;

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getStudent(){

        Student student = studentService.getDataForStudent();
        return student!=null ? new ResponseEntity<>(student, HttpStatus.OK):new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/printBeans")
    public ResponseEntity<String> getAllBeans(){

        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
