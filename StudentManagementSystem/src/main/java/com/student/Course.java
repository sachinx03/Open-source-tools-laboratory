package com.student;

public class Course {

    String code;
    String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {

        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }
}
//this code displays name and course code
