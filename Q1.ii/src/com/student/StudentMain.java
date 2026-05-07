package com.student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            s[i] = new Student();
            s[i].accept(sc);
        }

        for (int i = 0; i < 2; i++) {
            s[i].display();
        }

        sc.close();
    }
}
