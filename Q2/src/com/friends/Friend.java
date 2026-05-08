/*Q2. Write a java program to store information of your friends
id,name,lastname,hobbies,mobno,email,bdate,address
note: hobbies- a friend may have multiple hobbies

Accept all friends details and store it in an array

And do the following.
1. Display All Friend
2. Search by id
3. Search by name
4. Display all friend with a particular hobby
5. Exit */

package com.friends;

import java.util.Scanner;

public class Friend 
{
    int id;
    String name;
    String lastname;
    String[] hobbies;
    String mobileNumber;
    String email;
    String birthdate;
    String address;

    public void acceptData(Scanner sc)
    {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter First Name: ");
        name = sc.nextLine();

        System.out.print("Enter Last Name: ");
        lastname = sc.nextLine();

        System.out.print("Enter Mobile No: ");
        mobileNumber = sc.nextLine();

        System.out.print("Enter Email: ");
        email = sc.nextLine();

        System.out.print("Enter Birthdate: ");
        birthdate = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter number of hobbies: ");
        int n = sc.nextInt();
        sc.nextLine();

        hobbies = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter hobby " + (i + 1) + ": ");
            hobbies[i] = sc.nextLine();
        }
    }

    public void display()
    {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name + " " + lastname);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Address: " + address);

        System.out.print("Hobbies: ");
        for (String h : hobbies) {
            System.out.print(h + " ");
        }
        System.out.println();
    }

    public boolean hasHobby(String h) 
    {
        for (String hobby : hobbies)
        {
            if (hobby.equalsIgnoreCase(h))
            {
                return true;
            }
        }
        return false;
    }
}
