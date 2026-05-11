/*Q10. Write a java program to create a Vector for storing Strings
Use Enumerator to navigate through Vector */
package com.vector;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Scanner;

public class TestVector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector<String> stringVector = new Vector<>();

        System.out.println("Enter 5 strings to store in Vector:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();
            stringVector.add(str);
        }

        System.out.println("\nContents of Vector using Enumeration:");
        Enumeration<String> e = stringVector.elements();

        while (e.hasMoreElements()) {
            String s = e.nextElement();
            System.out.println(s);
        }

        sc.close();
    }
}
