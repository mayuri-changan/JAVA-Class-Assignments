package com.hub;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[20];
        int count = 0;

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display by Type");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Display All Employees");
            System.out.println("6. Salary by Designation");
            System.out.println("7. Display 5 Employees by Department");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("1.Salaried 2.Contract 3.Vendor");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        emp[count] = new SalariedEmployee();
                    } else if (type == 2) {
                        emp[count] = new ContractEmployee();
                    } else {
                        emp[count] = new Vendor();
                    }

                    emp[count].accept(sc);
                    count++;
                    break;

                case 2:
                    System.out.println("Enter type: 1.Salaried 2.Contract 3.Vendor");
                    int t = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if ((t == 1 && emp[i] instanceof SalariedEmployee) ||
                            (t == 2 && emp[i] instanceof ContractEmployee) ||
                            (t == 3 && emp[i] instanceof Vendor)) {
                            emp[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].id == id)
                            emp[i].display();
                    }
                    break;

                case 4:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].name.equalsIgnoreCase(name))
                            emp[i].display();
                    }
                    break;

                case 5:
                    for (int i = 0; i < count; i++)
                        emp[i].display();
                    break;

                case 6:
                    System.out.print("Enter Designation: ");
                    String des = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (emp[i].designation.equalsIgnoreCase(des)) {

                            if (emp[i] instanceof SalariedEmployee)
                                System.out.println(((SalariedEmployee) emp[i]).calculateSalary());

                            else if (emp[i] instanceof ContractEmployee)
                                System.out.println(((ContractEmployee) emp[i]).calculateSalary());

                            else if (emp[i] instanceof Vendor)
                                System.out.println(((Vendor) emp[i]).calculateSalary());
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    int c = 0;

                    for (int i = 0; i < count && c < 5; i++) {
                        if (emp[i].dept.equalsIgnoreCase(dept)) {
                            emp[i].display();
                            c++;
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exit...");
                    break;
            }

        } while (choice != 8);
    }
}
