package com.demo.product;

import java.time.LocalDate;

public class ProductDemo {

    public static void main(String[] args) {

        // Perishable product
        PerishableProduct milk = new PerishableProduct(
                1,
                "Milk",
                LocalDate.of(2026, 4, 20),
                LocalDate.of(2026, 4, 25),
                50
        );

        // Non-perishable product
        NonPerishableProduct chair = new NonPerishableProduct(
                2,
                "Chair",
                "Furniture",
                LocalDate.of(2025, 12, 1),
                2000
        );

        milk.showDetails();
        chair.showDetails();
    }
}
