package com.prasanta.basics.designpattern.strategypattern;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}
