package com.example.aliboututo.demoApp.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents(){

        return List.of(
                new Student("amine", "khaled", LocalDate.now(),"kh.amine98@gmail.com",34),
                new Student("amine", "khaled", LocalDate.now(),"kh.amine98@gmail.com",34)
        );

    }

}
