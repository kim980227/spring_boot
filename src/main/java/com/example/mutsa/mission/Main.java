package com.example.mutsa.mission;

public class Main {
    public static void main(String[] args) {
        Lecture l = new Lecture("kim", "teacher");
        Student s = new Student("lee", "student");
        l.speak();
        System.out.println("-----------------------------");
        s.speak();
    }
}
