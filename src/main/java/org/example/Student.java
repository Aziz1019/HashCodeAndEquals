package org.example;

import java.util.Objects;

public class Student {
    private String name;
    private Integer phoneNumber;
    private String username;


    public Student(String name, Integer phoneNumber, String username) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.username = username;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return phoneNumber.equals(student.phoneNumber) && username.equals(student.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, username);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", username='" + username + '\'' +
                '}';
    }

}
