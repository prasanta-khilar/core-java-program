package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    //String.Join example
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("1", "23", "33", "44", "5", "6");
        String results = String.join(",", stringList);
        System.out.println(results);
        System.out.println("String join :"+results.startsWith("2"));


    }
}
