package com.test.spring.test.repositories;

import com.test.spring.test.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    public Student getStudentDataFromDB(){
        return new Student("Tom Hardy",35,"The Tommy");
    }
}
