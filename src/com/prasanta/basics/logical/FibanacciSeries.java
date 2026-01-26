package com.prasanta.basics.logical;

public class FibanacciSeries {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13
        int no1 = 0;
        int no2 = 1;
        int n = 15;
        System.out.print("Fibonacci Series :" + no1 + "," + no2);
        for (int i = 1; i <= n; i++) {
            int sum = no1 + no2;
            System.out.print("," + sum);
            no1 = no2;
            no2 = sum;
        }
    }
}
