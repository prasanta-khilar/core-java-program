package com.prasanta.basics.program;

public class Order {


    String productName;
    int value;
    String location;

    @Override
    public String toString() {
        return "Order{" +
                "productname='" + productName + '\'' +
                ", value=" + value +
                ", location='" + location + '\'' +
                '}';
    }

    public Order(String productname, int value, String location) {
        this.productName = productname;
        this.value = value;
        this.location = location;
    }

    public String getProductname() {
        return productName;
    }

    public void setProductname(String productname) {
        this.productName = productname;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
