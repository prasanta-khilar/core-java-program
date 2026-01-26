package com.prasanta.basics.java11;

public class StripTrailingMethod {
    public static void main(String[] args) {
        //stripTrailing() method -> This method is used to remove all trailing while
        //spaces from a string and returns  a new string.
        String str1 = "      hello, world";
        String str2 = "    hello       world";
        String str3 = "     Hello world         ";
        System.out.println("Using Stripped of str1 :"+str1.stripTrailing());
        System.out.println("Using Stripped of str2 :"+str2.stripTrailing());
        System.out.println("Using Stripped of str3 :"+str3.stripTrailing());
    }
}
