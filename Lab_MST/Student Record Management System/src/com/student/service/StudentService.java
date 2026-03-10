package com.student.service;

import com.student.model.Student;
import com.student.util.InvalidMarksException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static final String FILE_NAME = "students.txt";
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) throws InvalidMarksException {
        if (student.getMarks() < 0 || student.getMarks() > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100 for student ID " + student.getStudentId());
        }

        students.add(student);

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(student.getStudentId() + "," + student.getName() + "," + student.getMarks() + System.lineSeparator());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error while writing student data: " + e.getMessage());
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}