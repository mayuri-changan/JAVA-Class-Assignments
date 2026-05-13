package com.demo.pc;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Producer extends Thread {

    ProductBuffer buffer;

    public Producer(ProductBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        try {
            FileInputStream fis = new FileInputStream("productdata.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // read one product object
            Product p = (Product) ois.readObject();

            System.out.println("Producer reads product: " + p.pname);

            buffer.put(p);

            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
