package com.hub;

public class SalariedEmployee extends Employee {
    double basic;

    public void accept(java.util.Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double pf = 0.12 * basic;
        return basic + da + hra - pf;
    }
}
