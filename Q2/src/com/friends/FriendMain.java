package com.friends;

import java.util.Scanner;

public class FriendMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of friends: ");
        int size = sc.nextInt();
        sc.nextLine();

        Friend[] friends = new Friend[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details of Friend " + (i + 1));
            friends[i] = new Friend();
            friends[i].acceptData(sc);
        }

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display All Friends");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Display by Hobby");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    for (Friend f : friends) {
                        f.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (Friend f : friends) {
                        if (f.id == id) {
                            f.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Friend not found!");
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    found = false;

                    for (Friend f : friends) {
                        if (f.name.equalsIgnoreCase(name)) {
                            f.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Friend not found!");
                    break;

                case 4:
                    System.out.print("Enter Hobby: ");
                    String hobby = sc.nextLine();
                    found = false;

                    for (Friend f : friends) {
                        if (f.hasHobby(hobby)) {
                            f.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("No friend with this hobby!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
