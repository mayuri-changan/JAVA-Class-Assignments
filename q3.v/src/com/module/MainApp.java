
/*Write a program to create class Exam, for each exam store exam id, name ,topic, date
of exam and array of questions.
For each question store question number, question, opt1,opt2,opt3,opt4,answers,marks
Create 2 exam objects One for java test and one for HTML test by storing 5 questions
in each exam
Ask user which exam user want to appear
1. Java
2. HTML
Conduct the test, and display the marks, if marks are >=3 the display
congratulations you completed the test.
Otherwise display message, better luck next time.
Then ask user do you want to continue. Do accordingly*/

package com.module;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Exam javaExam = new Exam();
        Exam htmlExam = new Exam();

        System.out.println("Enter Java Exam Details:");
        javaExam.accept(sc);

        System.out.println("\nEnter HTML Exam Details:");
        htmlExam.accept(sc);

        char ch = 0;

        do {
            System.out.println("\n1. Java Exam");
            System.out.println("2. HTML Exam");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int marks = 0;

            if (choice == 1)
                marks = javaExam.conduct(sc);
            else if (choice == 2)
                marks = htmlExam.conduct(sc);
            else {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.println("Total Marks: " + marks);

            if (marks >= 3)
                System.out.println("Congratulations!");
            else
                System.out.println("Better luck next time!");

            System.out.print("Continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch== 'y' || ch== 'Y');

        sc.close();
    }
}

