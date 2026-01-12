package com.prasanta.basics.java8;

public class Paytm implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {
        String txtDate = UPIPayment.datePattern("YYYY-MM-DD");
        return txtDate.toLowerCase();
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
