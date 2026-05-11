package com.demo.test;

import com.demo.service.CartService;
import java.util.Scanner;

public class TestCartProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService service = new CartService();

        int choice;
        do {
            System.out.println("\n--- User Cart Menu ---");
            System.out.println("1. Buy Products");
            System.out.println("2. Send the delivery of cart");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    service.buyProducts();
                    break;
                case 2:
                    service.sendDelivery();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
