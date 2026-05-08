package com.abctel;

import java.util.Scanner;

public class Customer extends Person {
    static int counter = 100;
    int custId;
    String creditClass, plan;
    double discount;

    public Customer() {
        custId = counter++;
    }

    public void accept(Scanner sc) {
        super.accept(sc);

        System.out.print("Enter Credit Class: ");
        creditClass = sc.nextLine();

        System.out.print("Enter Discount: ");
        discount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Plan: ");
        plan = sc.nextLine();
    }

    public void display() {
        System.out.println("\nCustomer ID: " + custId);
        super.display();
        System.out.println("Credit: " + creditClass + ", Discount: " + discount + ", Plan: " + plan);
    }
}
