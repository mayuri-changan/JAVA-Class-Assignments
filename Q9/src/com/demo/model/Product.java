/*Q9. Design a java project for managing user cart.
store username as key and list of products as value.
Step 1. Create a ArrayList of Product objects //Existing products for sell
<Hint: Use static block add 10 products use hardcoded values>
for each product strore id, name,price,qty
step 2. Display following menu
1. Buy Products
2. Send the delivery of cart

if user selects 1. Buy Products
Display List of all available products
e.g
1. Shoes
2. shirts
3. Bags
Choice: 1
ask qty - 2

display Amount - 6000/-
Store cart for the user
Username is key , list of products as value

if user selects 2. Send the delivery of cart
display list of usernames
Accept username and Display bill for the user
Then ask user do you want to deliver (y/n)
if yes
display message order delivered and
delete that cart from the list
if no then show the previous menu.

Project structure
com.demo.model
product.java

com.demo.service
CartService

com.demo.test
TestCartProduct  */

package com.demo.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    @Override
    public String toString() {
        return id + ". " + name + " | Price: " + price + " | Qty Available: " + qty;
    }
}
