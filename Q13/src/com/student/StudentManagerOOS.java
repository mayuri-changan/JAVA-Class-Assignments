package com.student;

import java.util.*;
import java.io.*;

public class StudentManagerOOS {

    private static List<Student> studentList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static final String FILE_NAME = "students.dat"; // file to store objects

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit and save to file");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    saveToFile();
                    System.out.println("Data saved to " + FILE_NAME + ". Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Degree: ");
        String degree = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Student student = new Student(id, name, degree, email);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\nAll Students:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    private static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentList);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
