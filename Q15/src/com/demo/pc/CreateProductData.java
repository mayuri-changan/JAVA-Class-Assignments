package com.demo.pc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateProductData {

    public static void main(String[] args) {

        try {
            // Create Product object
            Product p = new Product(1, "Laptop", 2, 50000);

            // Create file productdata.dat
            FileOutputStream fos = new FileOutputStream("productdata.dat");

            // Write object into file
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
            fos.close();

            System.out.println("productdata.dat created successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
