package com.prasanta.basics.logical;

public class ReverseNumber {
    public static void main(String[] args) {
        int no=5812;
        int revNo = 0;
        while (no!=0){
            int rem=no%10;//2
            revNo=revNo*10+rem;//2
            no = no/10;//581
        }
        System.out.println(revNo);
    }
}
