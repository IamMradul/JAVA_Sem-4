package com.student;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.util.InvalidMarksException;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        try {
            service.addStudent(new Student(101, "Mradul", 91.5));
            service.addStudent(new Student(102, "Anshika", 78.0));
            service.addStudent(new Student(103, "siddharth", 105.0));
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        service.displayStudents();
    }
}