/*3. Write a menu driven program to maintain student information. Modify Student class
created in previous assignment. Add a member gpa in student class, add a function in
student class to return GPA of a student
calculateGPA()
gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3
Create an array to store Multiple students.
1. Display All Student
2. Search by id
3. Search by name
4. calculate GPA of a student
5. Exit */

package com.student;
import java.util.Scanner;
public class Student {
    int studid;
    String name;
    int m1, m2, m3;
    double gpa;

    public void acceptData(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public double calculateGPA() {
        gpa = (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
        return gpa;
    }

    public void display() {
        System.out.println("\nID: " + studid);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
    }
}
