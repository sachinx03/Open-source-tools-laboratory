package com.student;

public class Teacher {

    int id;
    String name;
    String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public void display() {

        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
