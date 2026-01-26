package com.prasanta.basics.logical;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int no=18;
        if(no<=1){
            System.out.println("Number is not prime");
            return;
        }
        boolean isPrime = true;
        for(int i=2;i<no;i++){
            if(no%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is prime Number ");
        }else {
            System.out.println("Number is not prime Number ");
        }
    }
}
