package com.prasanta.basics.practice;

public class Shop {

    public static void main(String[] args) {

        DesignPatternBuilder designPatternBuilder = new DesignPatternBuilder();
        Phone p = designPatternBuilder.setBattery(234).setCamera(23).setOs("IOS").getPhone();
//        Phone p = new Phone("andoid","quallam",5.5,3100,50);
        System.out.println(p);
    }
}
