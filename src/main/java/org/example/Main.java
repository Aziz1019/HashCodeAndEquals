package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("John", 123456789, "john123"));
        students.add(new Student("John", 123456789, "john123"));
        students.add(new Student("John", 123456789, "john123"));
        students.add(new Student("John", 12345678, "john123"));

        System.out.println(students);
    }
}