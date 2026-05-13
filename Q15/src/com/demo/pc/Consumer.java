package com.demo.pc;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Consumer extends Thread {

    ProductBuffer buffer;

    public Consumer(ProductBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {

        try {
            Product p = buffer.get();

            double amount = p.qty * p.price + (0.10 * p.price);

            System.out.println("Consumer processed product: " + p.pname);

            FileOutputStream fos = new FileOutputStream("productamount.dat");
            PrintWriter pw = new PrintWriter(fos);

            pw.println(p.id + ":" + p.pname + ":" + p.qty + ":" + p.price + ":" + amount);

            pw.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
