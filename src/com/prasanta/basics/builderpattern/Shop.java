package com.prasanta.basics.builderpattern;

public class Shop {
    public static void main(String[] args) {
//        Phone phone = new Phone("Android",6,"QualComm",5.5,3100);
//        System.out.println(phone);
        Phone phone = new PhoneBuilder().setOs("IOS").setBattery(3000).getPhone();
        System.out.println(phone);

    }
}
