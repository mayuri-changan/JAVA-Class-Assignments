package com.student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i] = new Student();
            students[i].acceptData(sc);
        }

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display All Students");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Calculate GPA");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    for (Student s : students)
                        s.display();
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.studid == id) {
                            s.display();
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found!");
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    found = false;

                    for (Student s : students) {
                        if (s.name.equalsIgnoreCase(name)) {
                            s.display();
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    found = false;

                    for (Student s : students) {
                        if (s.studid == sid) {
                            System.out.println("GPA = " + s.calculateGPA());
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Student not found!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
