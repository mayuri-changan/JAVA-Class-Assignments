package com.hub;

public class ContractEmployee extends Employee {
    int hours;
    double rate;

    public void accept(java.util.Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Hours Worked: ");
        hours = sc.nextInt();
        System.out.print("Enter Rate per Hour: ");
        rate = sc.nextDouble();
        sc.nextLine();
    }

    public double calculateSalary() {
        return hours * rate;
    }
}
