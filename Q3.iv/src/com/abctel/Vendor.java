package com.abctel;

public class Vendor extends Person {
    static int counter = 1;
    int vendorId;
    String phone;
    String[] products;

    public Vendor() {
        vendorId = counter++;
    }

    public void accept(java.util.Scanner sc) {
        super.accept(sc);

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        products = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i + 1) + ": ");
            products[i] = sc.nextLine();
        }
    }

    public void display() {
        System.out.println("\nVendor ID: " + vendorId);
        super.display();
        System.out.println("Phone: " + phone);

        System.out.print("Products: ");
        for (String p : products)
            System.out.print(p + " ");
        System.out.println();
    }
}
