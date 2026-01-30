package com.prasanta.basics.designpattern.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CardPayment());
        paymentContext.pay(1000);
        paymentContext.setPaymentStrategy(new UpiPayment());
        paymentContext.pay(500);
        paymentContext.setPaymentStrategy(new NetBankingPayment());
        paymentContext.pay(2000);
    }
}
