package com.abctel;

import java.util.Scanner;

public class IndividualCustomer extends Customer {
    String phone;

    public void accept(Scanner sc) {
        super.accept(sc);

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    public void display() {
        super.display();
        System.out.println("Phone: " + phone);
    }
}
