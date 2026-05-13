package com.demo.pc;

public class Test {

    public static void main(String[] args) {

        ProductBuffer buffer = new ProductBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
