package com.abctel;

public class CompanyCustomer extends Customer {
    String relationshipManager;
    double creditLine;
    int extensions;
    String[] numbers;

    public void accept(java.util.Scanner sc) {
        super.accept(sc);

        System.out.print("Enter Relationship Manager: ");
        relationshipManager = sc.nextLine();

        System.out.print("Enter Credit Line: ");
        creditLine = sc.nextDouble();

        System.out.print("Enter Extensions: ");
        extensions = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of phone numbers: ");
        int n = sc.nextInt();
        sc.nextLine();

        numbers = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextLine();
        }
    }

    public void display() {
        super.display();
        System.out.println("Relationship Manager: " + relationshipManager);
        System.out.println("Credit Line: " + creditLine);
        System.out.println("Extensions: " + extensions);

        System.out.print("Numbers: ");
        for (String num : numbers)
            System.out.print(num + " ");
        System.out.println();
    }
}
