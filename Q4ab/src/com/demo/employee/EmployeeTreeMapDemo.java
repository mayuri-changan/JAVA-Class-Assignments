package com.demo.employee;

import java.util.TreeMap;
import java.util.Map;

public class EmployeeTreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, Employee> map = new TreeMap<>();

        map.put(101, new Employee(101, "Amit", 50000, "IT", "Developer"));
        map.put(102, new Employee(102, "Neha", 60000, "HR", "Manager"));
        map.put(103, new Employee(103, "Raj", 55000, "IT", "Tester"));

        // Duplicate key → overwrites previous value
        map.put(101, new Employee(101, "Amit Updated", 70000, "Finance", "Lead"));

        System.out.println("Employees in TreeMap (Sorted by ID):");

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
