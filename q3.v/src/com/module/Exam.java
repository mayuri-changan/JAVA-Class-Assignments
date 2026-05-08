package com.module;

import java.util.Scanner;

public class Exam {
    int examid;
    String name, topic, date;
    Question[] q = new Question[5];

    public void accept(Scanner sc) {
        System.out.print("Enter Exam ID: ");
        examid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Topic: ");
        topic = sc.nextLine();

        System.out.print("Enter Date: ");
        date = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Question " + (i + 1));
            q[i] = new Question();
            q[i].accept(i + 1, sc);
        }
    }

    public int conduct(Scanner sc) {
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += q[i].ask(sc);
        }

        return total;
    }
}
