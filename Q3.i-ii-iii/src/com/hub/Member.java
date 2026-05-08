package com.hub;

public class Member {
    static int counter = 100;
    int id;
    String name, mobile, email, type;
    double amount;

    public Member() {
        id = counter++;
    }

    public void accept(java.util.Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mobile: ");
        mobile = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Membership Type: ");
        type = sc.nextLine();

        System.out.print("Enter Amount Paid: ");
        amount = sc.nextDouble();
        sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Type: " + type);
    }
}
