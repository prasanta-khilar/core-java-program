package com.prasanta.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStartingLetter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana","apple","annar","mango","grapes","blueberry");

        Map<Character, List<String>> result =
                fruits.stream()
                        .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(result);
    }
}
