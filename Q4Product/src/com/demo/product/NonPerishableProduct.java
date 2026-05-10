package com.demo.product;

import java.time.LocalDate;

public class NonPerishableProduct extends Product {

    private String category; // furniture, stationery, utensils

    public NonPerishableProduct(int id, String name, String category,
                                LocalDate mfgDate, double price) {
        super(id, name, "non-perishable", mfgDate, price);
        this.category = category;
    }

    public void showDetails() {
        calculateTax();
        System.out.println("Mfg Date: " + mfgDate);
        System.out.println("Category: " + category);
        System.out.println("----------------------");
    }
}
