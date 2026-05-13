package com.demo.pc;

public class ProductBuffer {

    private Product product;
    private boolean available = false;

    // PRODUCER puts data
    public synchronized void put(Product product) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        this.product = product;
        available = true;
        notify();
    }

    // CONSUMER gets data
    public synchronized Product get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        available = false;
        notify();
        return product;
    }
}
