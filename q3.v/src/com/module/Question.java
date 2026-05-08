/*5. Write a program to create class Exam, for each exam store examid, name ,topic, date
of exam and array of questions.
For each question store qno, question, opt1,opt2,opt3,opt4,ans,marks
Create 2 exam objects One for java test and one for Html test by storing 5 questions
in each exam
Ask user which exam user want to appear
1. Java
2. HTML
Conduct the test, and display the marks, if marks are >=3 the display
congratulations you completed the test.
Otherwise display message, better luck next time.
Then ask user do you want to continue. Do accordingly */
package com.module;

import java.util.Scanner;

public class Question {
    int qno;
    String question, opt1, opt2, opt3, opt4;
    int ans, marks;

    public void accept(int num, Scanner sc) {
        qno = num;

        System.out.print("Enter Question: ");
        question = sc.nextLine();

        System.out.print("Option 1: ");
        opt1 = sc.nextLine();

        System.out.print("Option 2: ");
        opt2 = sc.nextLine();

        System.out.print("Option 3: ");
        opt3 = sc.nextLine();

        System.out.print("Option 4: ");
        opt4 = sc.nextLine();

        System.out.print("Correct Option: ");
        ans = sc.nextInt();

        System.out.print("Marks: ");
        marks = sc.nextInt();
        sc.nextLine();
    }

    public int ask(Scanner sc) {
        System.out.println("\nQ" + qno + ": " + question);
        System.out.println("1. " + opt1);
        System.out.println("2. " + opt2);
        System.out.println("3. " + opt3);
        System.out.println("4. " + opt4);

        System.out.print("Your Answer: ");
        int user = sc.nextInt();

        if (user == ans)
            return marks;
        else
            return 0;
    }
}
