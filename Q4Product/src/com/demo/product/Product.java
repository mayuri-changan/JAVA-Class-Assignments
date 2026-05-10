/*Product assignment
Class Product
Id, name, type (perishable/nonperishable)
Mfgdate,
For perishable
Exp-date
Price
Nonperishable ---- category (furniture, statitionary, utensils)
CalculateTax()
If product is perishable then tax = 5% of price
Otherwise
Tax= 15% of price+100*/


package com.demo.product;

import java.time.LocalDate;

public class Product {

    protected int id;
    protected String name;
    protected String type; // perishable / non-perishable
    protected LocalDate mfgDate;
    protected double price;

    public Product(int id, String name, String type, LocalDate mfgDate, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.mfgDate = mfgDate;
        this.price = price;
    }

    public void calculateTax() {
        double tax = 0;

        if (type.equalsIgnoreCase("perishable")) {
            tax = 0.05 * price;   // 5%
        } else {
            tax = (0.15 * price) + 100; // 15% + 100
        }

        System.out.println("Product: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
    }
}
