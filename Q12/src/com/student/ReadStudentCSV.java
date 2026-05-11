package com.student;

import java.io.*;
import java.util.*;

public class ReadStudentCSV {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        String fileName = "students.csv"; // CSV file created in Q11

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) { // skip header
                    firstLine = false;
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String degree = parts[2];
                    String email = parts[3];

                    Student student = new Student(id, name, degree, email);
                    studentList.add(student);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Display all students
        if (studentList.isEmpty()) {
            System.out.println("No students found in file.");
        } else {
            System.out.println("\nStudents read from file:");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }
}
