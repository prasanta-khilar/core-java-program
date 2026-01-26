package com.prasanta.basics.logical;

public class PrimeNumberSeries {
    public static void main(String[] args) {

        for (int no = 2; no < 100; no++) {
            boolean isPrime = true;
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(no + ",");
            }
        }

    }
}
