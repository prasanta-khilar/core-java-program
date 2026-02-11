package com.prasanta.basics.program;

import java.util.Arrays;

public class LongestStringArray {

    //java program to find longest String from given array
    //String[] strArray = {"java","techie","Springboot","Microservices"};
    public static void main(String[] args) {
        String[] strArray = {"java","techie","Springboot","Microservices"};
        String longestSstring = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("Longest String : "+ longestSstring);
    }
}
