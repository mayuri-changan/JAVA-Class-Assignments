package com.student;

import java.util.*;
import java.io.*;

public class ReadStudentOOS {

    private static final String FILE_NAME = "students.dat"; // file created in Q13

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        List<Student> studentList = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME);
            return;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
            return;
        }

        // Display all students
        if (studentList == null || studentList.isEmpty()) {
            System.out.println("No students found in file.");
        } else {
            System.out.println("\nStudents read from file:");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }
}
