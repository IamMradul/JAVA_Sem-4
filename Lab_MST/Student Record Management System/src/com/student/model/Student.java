package com.student.model;

public class Student {
    private final int studentId;
    private final String name;
    private final double marks;

    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "', marks=" + marks + "}";
    }
}