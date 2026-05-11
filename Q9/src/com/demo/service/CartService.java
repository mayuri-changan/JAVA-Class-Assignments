package com.demo.service;

import com.demo.model.Product;
import java.util.*;

public class CartService {

    // Static list of products
    public static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "Shoes", 3000, 10));
        products.add(new Product(2, "Shirt", 1500, 20));
        products.add(new Product(3, "Bag", 2000, 15));
        products.add(new Product(4, "Watch", 5000, 5));
        products.add(new Product(5, "Jeans", 2000, 12));
        products.add(new Product(6, "Cap", 500, 25));
        products.add(new Product(7, "Sunglasses", 1200, 10));
        products.add(new Product(8, "Belt", 700, 18));
        products.add(new Product(9, "T-Shirt", 1000, 30));
        products.add(new Product(10, "Jacket", 4000, 7));
    }

    // Map to store username -> cart products
    private Map<String, List<Product>> userCart = new HashMap<>();

    private Scanner sc = new Scanner(System.in);

    // Display products
    public void displayProducts() {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Buy products for user
    public void buyProducts() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        List<Product> cart = new ArrayList<>();
        boolean more = true;

        while (more) {
            displayProducts();
            System.out.print("Enter product id to buy: ");
            int pid = sc.nextInt();
            sc.nextLine();

            Product selected = null;
            for (Product p : products) {
                if (p.getId() == pid) {
                    selected = p;
                    break;
                }
            }

            if (selected == null) {
                System.out.println("Invalid product id.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            if (qty > selected.getQty()) {
                System.out.println("Not enough stock.");
                continue;
            }

            // Reduce stock
            selected.setQty(selected.getQty() - qty);

            // Add to cart
            cart.add(new Product(selected.getId(), selected.getName(), selected.getPrice(), qty));
            System.out.println("Added to cart: " + selected.getName() + " x" + qty);

            System.out.print("Do you want to buy more products? (y/n): ");
            String ans = sc.nextLine();
            more = ans.equalsIgnoreCase("y");
        }

        // Store cart
        if (userCart.containsKey(username)) {
            userCart.get(username).addAll(cart);
        } else {
            userCart.put(username, cart);
        }

        // Display total amount
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice() * p.getQty();
        }
        System.out.println("Total amount: " + total + "/-");
    }

    // Send delivery of cart
    public void sendDelivery() {
        if (userCart.isEmpty()) {
            System.out.println("No carts available.");
            return;
        }

        System.out.println("Users with cart:");
        for (String user : userCart.keySet()) {
            System.out.println(user);
        }

        System.out.print("Enter username for delivery: ");
        String username = sc.nextLine();

        List<Product> cart = userCart.get(username);
        if (cart == null) {
            System.out.println("User not found.");
            return;
        }

        // Display bill
        System.out.println("\nBill for " + username + ":");
        double total = 0;
        for (Product p : cart) {
            double amt = p.getPrice() * p.getQty();
            total += amt;
            System.out.println(p.getName() + " x" + p.getQty() + " = " + amt);
        }
        System.out.println("Total Amount: " + total + "/-");

        System.out.print("Do you want to deliver this order? (y/n): ");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            System.out.println("Order delivered successfully!");
            userCart.remove(username);
        } else {
            System.out.println("Returning to main menu.");
        }
    }
}
