package com.example.aliboututo.demoApp.student;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {



    public List<Student> findAllStudents() {

        return List.of(
                new Student("amine", "khaled", LocalDate.now(), "kh.amine98@gmail.com", 34),
                new Student("amine", "khaled", LocalDate.now(), "kh.amine98@gmail.com", 34)
        );
    }

}
