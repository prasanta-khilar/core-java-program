package com.prasanta.basics.designpattern.strategypattern;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
