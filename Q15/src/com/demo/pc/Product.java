/*Q15. Write a producer consumer program using inter thread communication
producer - will read a product from a file from productdata.dat
consumer - will calculate amount qty * price + 10% price
write it into a file id:pname:qty:price:amount productamount.dat*/


package com.demo.pc;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {
    int id;
    String pname;
    int qty;
    double price;

    public Product(int id, String pname, int qty, double price) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }
}
