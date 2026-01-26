package com.prasanta.basics.logical;

public class SwapNumber {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
//        int temp = no1;
//        no1=no2;
//        no2=temp;
        //without using 3rd variable
        no1 = no1 + no2;//30
        no2 = no1 - no2;//10
        no1 = no1 - no2;//20
        System.out.println("Number 1 :" + no1);
        System.out.println("Number 2 :" + no2);
    }
}
