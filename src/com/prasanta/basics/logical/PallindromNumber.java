package com.prasanta.basics.logical;

public class PallindromNumber {
    public static void main(String[] args) {
        int no=12521;
        int revNo=0;
        int temp = no;
        while (temp!=0){
            int rem=temp%10;
            revNo=revNo*10+rem;
            temp=temp/10;
        }
        if(no==revNo){
            System.out.println("Its Palindrom Number");
        }else {
            System.out.println("Its not Palindrom Number");
        }
    }
}
