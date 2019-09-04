package com.test.spring.test.service;

import com.test.spring.test.DependOnSomethingConcrete;
import com.test.spring.test.TheDataNeedsMyData;
import com.test.spring.test.dto.Student;
import com.test.spring.test.repositories.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    final StudentRepo studentRepo;

    final TheDataNeedsMyData need;

    final DependOnSomethingConcrete somethingConcrete;

    public Student getDataForStudent() {
        need.doSomethingWithData();
        somethingConcrete.doSomethingDependent();
        return studentRepo.getStudentDataFromDB();
    }
}
