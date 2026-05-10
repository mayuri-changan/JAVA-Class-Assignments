/*Q7. Write a java program to store List of Commonly found trees
in each city.

The List should be sorted on city names
Accept name of city and list of tree names from user. And perform following:

1. Find list of trees for a city
2. Delete List of a particular city
3. Add new entry in treemap
Check whether city name already exists
4. Display all city names and List of trees (Use Iterator and foreach) */


package com.citytrees;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TreeMap sorts by city names automatically
        TreeMap<String, List<String>> cityTreesMap = new TreeMap<>();

        int choice;

        do {
            System.out.println("\n--- City Trees Menu ---");
            System.out.println("1. Find list of trees for a city");
            System.out.println("2. Delete list of a particular city");
            System.out.println("3. Add new entry in TreeMap");
            System.out.println("4. Display all city names and list of trees");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter City Name to find trees: ");
                    String city = sc.nextLine();
                    if (cityTreesMap.containsKey(city)) {
                        System.out.println("Trees in " + city + ": " + cityTreesMap.get(city));
                    } else {
                        System.out.println("City not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter City Name to delete: ");
                    String delCity = sc.nextLine();
                    if (cityTreesMap.remove(delCity) != null) {
                        System.out.println("City entry deleted successfully.");
                    } else {
                        System.out.println("City not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter City Name to add: ");
                    String newCity = sc.nextLine();
                    if (cityTreesMap.containsKey(newCity)) {
                        System.out.println("City already exists! Cannot add.");
                    } else {
                        List<String> trees = new ArrayList<>();
                        System.out.print("Enter number of trees: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter tree " + (i + 1) + " name: ");
                            String tree = sc.nextLine();
                            trees.add(tree);
                        }

                        cityTreesMap.put(newCity, trees);
                        System.out.println("City added successfully.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Display All Cities and Trees (Iterator) ---");
                    Iterator<Map.Entry<String, List<String>>> it = cityTreesMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, List<String>> entry = it.next();
                        System.out.println("City: " + entry.getKey() + ", Trees: " + entry.getValue());
                    }

                    System.out.println("\n--- Display All Cities and Trees (foreach) ---");
                    for (Map.Entry<String, List<String>> entry : cityTreesMap.entrySet()) {
                        System.out.println("City: " + entry.getKey() + ", Trees: " + entry.getValue());
                    }
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
