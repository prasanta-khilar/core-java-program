package com.prasanta.basics.java8;

import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String str = "prasanta";

        String reduce = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a);
        System.out.println(reduce);
       String reverseString = Stream.of(str.split("")).reduce("",(a,b)->b+a);
        System.out.println(reverseString);
    }
}
