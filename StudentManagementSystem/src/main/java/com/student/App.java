package com.student;

public class App {

    public static void main(String[] args) {


        Student student =
        new Student(101,"Sachin","Computer Science");


        Teacher teacher =
        new Teacher(1,"John","Java");


        Course course =
        new Course("CS101","Programming");


        System.out.println("===== STUDENT =====");
        student.display();


        System.out.println();


        System.out.println("===== TEACHER =====");
        teacher.display();


        System.out.println();


        System.out.println("===== COURSE =====");
        course.display();

    }
}
