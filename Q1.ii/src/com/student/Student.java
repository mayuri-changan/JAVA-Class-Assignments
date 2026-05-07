/*Write a program to maintain student information. For each student store student id, name, m1,
m2 and m3 (marks of 3 subjects ). Accept information for 2 students and display it as
follows.
Student Details:
____________
Student Id
Name: Divya
M1 : 78
M2: 86
M3: 89 */

package com.student;

import java.util.Scanner;

public class Student {
    int studid;
    String name;
    int m1, m2, m3;

    public void accept(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter M1: ");
        m1 = sc.nextInt();

        System.out.print("Enter M2: ");
        m2 = sc.nextInt();

        System.out.print("Enter M3: ");
        m3 = sc.nextInt();
    }

    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("____________");
        System.out.println("Student Id: " + studid);
        System.out.println("Name: " + name);
        System.out.println("M1 : " + m1);
        System.out.println("M2 : " + m2);
        System.out.println("M3 : " + m3);
    }
}




