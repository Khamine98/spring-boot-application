package com.example.aliboututo.demoApp.student;

import java.time.LocalDate;

public class Student {

    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Student() {

    }

    public Student(String firstname, String lastname, LocalDate dateOfBirth, String email, int age) {
        this.firstname = firstname;
        this.age = age;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.lastname = lastname;
    }
}
