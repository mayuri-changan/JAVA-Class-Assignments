package com.hub;

public class Vendor extends Employee {
    int noOfEmployees;
    double amount;

    public void accept(java.util.Scanner sc) {
        super.accept(sc);
        System.out.print("Enter No of Employees: ");
        noOfEmployees = sc.nextInt();

        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        return amount + amount * 0.18; 
    }
}
