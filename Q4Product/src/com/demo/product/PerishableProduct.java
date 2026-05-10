package com.demo.product;

import java.time.LocalDate;

public class PerishableProduct extends Product {

    private LocalDate expDate;

    public PerishableProduct(int id, String name, LocalDate mfgDate,
                             LocalDate expDate, double price) {
        super(id, name, "perishable", mfgDate, price);
        this.expDate = expDate;
    }

    public void showDetails() {
        calculateTax();
        System.out.println("Mfg Date: " + mfgDate);
        System.out.println("Expiry Date: " + expDate);
        System.out.println("----------------------");
    }
}
