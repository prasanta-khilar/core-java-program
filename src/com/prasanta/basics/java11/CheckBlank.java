package com.prasanta.basics.java11;

public class CheckBlank {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " \t \n";
        String str3 = "hello";
        boolean isBlankStr1 = str1.isBlank();
        boolean isBlankStr2 = str2.isBlank();
        boolean isBlankStr3 = str3.isBlank();
        System.out.println("First Result is  str1   :"+isBlankStr1);
        System.out.println("Second Result is str2   :"+isBlankStr2);
        System.out.println("Third Result is  str3   :"+isBlankStr3);

    }
}
