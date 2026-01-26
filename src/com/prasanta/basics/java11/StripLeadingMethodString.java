package com.prasanta.basics.java11;

public class StripLeadingMethodString {
    public static void main(String[] args) {
        // stripLeading() method -> It uses to remove all leading white spaces from a string
        // and it returns a new string
        String str1 = "      hello, world";
        String str2 = "    hello       world";
        String str3 = "     Hello world         ";
        System.out.println("Using Stripped of str1 :"+str1.stripLeading());
        System.out.println("Using Stripped of str2 :"+str2.stripLeading());
        System.out.println("Using Stripped of str3 :"+str3.stripLeading());
    }
}
