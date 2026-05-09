package com.demo.employee;

import java.util.HashSet;

public class EmployeeHashSetDemo {
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(101, "Amit", 50000, "IT", "Developer"));
        set.add(new Employee(102, "Neha", 60000, "HR", "Manager"));
        set.add(new Employee(103, "Raj", 55000, "IT", "Tester"));

        // Duplicate ID → will NOT be added
        set.add(new Employee(101, "Amit Updated", 70000, "Finance", "Lead"));

        System.out.println("Employees in HashSet:");

        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
