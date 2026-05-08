package com.abctel;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vendor[] vendors = new Vendor[10];
        Customer[] customers = new Customer[10];

        int vCount = 0, cCount = 0;
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Vendor");
            System.out.println("2. Add Customer");
            System.out.println("3. Display Vendors");
            System.out.println("4. Display Customers");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    vendors[vCount] = new Vendor();
                    vendors[vCount].accept(sc);
                    vCount++;
                    break;

                case 2:
                    System.out.println("1. Individual 2. Company");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1)
                        customers[cCount] = new IndividualCustomer();
                    else
                        customers[cCount] = new CompanyCustomer();

                    customers[cCount].accept(sc);
                    cCount++;
                    break;

                case 3:
                    for (int i = 0; i < vCount; i++)
                        vendors[i].display();
                    break;

                case 4:
                    for (int i = 0; i < cCount; i++)
                        customers[i].display();
                    break;

                case 5:
                    System.out.println("Exit...");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
