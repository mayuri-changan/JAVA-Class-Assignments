package com.demo.grade;

import java.util.Scanner;

public class GradeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade (DISTINCTION/FIRST/SECOND/PASS/FAIL): ");
        String input = sc.next().toUpperCase();

        try {
            Grade g = Grade.valueOf(input);

            System.out.println("Minimum Marks: " + g.getMinMarks());
            System.out.println("Maximum Marks: " + g.getMaxMarks());

        } catch (Exception e) {
            System.out.println("Invalid Grade Entered");
        }

        sc.close();
    }
}
