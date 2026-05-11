/*Q8.
Add following option in Q7. assignment
5. Add a new tree in existing list
6. Accept tree name from user. Display all cities in which the tree exists */

package com.citytrees;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TreeMap to store City -> List of Trees (sorted by city)
        TreeMap<String, List<String>> cityTreesMap = new TreeMap<>();

        int choice;

        do {
            System.out.println("\n--- City Trees Menu ---");
            System.out.println("1. Find list of trees for a city");
            System.out.println("2. Delete list of a particular city");
            System.out.println("3. Add new entry in TreeMap");
            System.out.println("4. Display all city names and list of trees");
            System.out.println("5. Add a new tree in existing list");
            System.out.println("6. Display all cities in which a tree exists");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter City Name: ");
                    String city = sc.nextLine();
                    List<String> trees = cityTreesMap.get(city);
                    if (trees != null) {
                        System.out.println("Trees in " + city + ": " + trees);
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter City Name to delete: ");
                    String delCity = sc.nextLine();
                    if (cityTreesMap.remove(delCity) != null) {
                        System.out.println("City removed successfully.");
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter City Name: ");
                    String newCity = sc.nextLine();
                    if (cityTreesMap.containsKey(newCity)) {
                        System.out.println("City already exists!");
                    } else {
                        System.out.print("Enter number of trees: ");
                        int n = sc.nextInt();
                        sc.nextLine();
                        List<String> newTrees = new ArrayList<>();
                        for (int i = 0; i < n; i++) {
                            System.out.print("Enter Tree " + (i + 1) + ": ");
                            newTrees.add(sc.nextLine());
                        }
                        cityTreesMap.put(newCity, newTrees);
                        System.out.println("City added successfully.");
                    }
                    break;

                case 4:
                    System.out.println("\nAll Cities and Trees:");
                    for (Map.Entry<String, List<String>> entry : cityTreesMap.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.print("Enter City Name to add a new tree: ");
                    String cityName = sc.nextLine();
                    List<String> existingTrees = cityTreesMap.get(cityName);
                    if (existingTrees != null) {
                        System.out.print("Enter Tree Name to add: ");
                        String treeName = sc.nextLine();
                        existingTrees.add(treeName);
                        System.out.println("Tree added successfully.");
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Tree Name to search: ");
                    String searchTree = sc.nextLine();
                    System.out.println("Cities containing " + searchTree + ":");

                    // Using Iterator
                    Iterator<Map.Entry<String, List<String>>> it = cityTreesMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, List<String>> entry = it.next();
                        if (entry.getValue().contains(searchTree)) {
                            System.out.println(entry.getKey());
                        }
                    }

                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
