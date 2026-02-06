package com.prasanta.basics.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestLengthMultipleString {
    public static void main(String[] args) {
        String[] strValue = {"java", "springboot", "microservices", "api"};
        List<String> strings = Arrays.stream(strValue).collect(Collectors.groupingBy(String::length))
                .entrySet().stream().max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue).get();
        OptionalInt max = Arrays.stream(strValue).mapToInt(String::length).max();

        System.out.println(max);
        System.out.println(strings);
        String longest = Arrays.stream(strValue)
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longest); // microservices



    }
}
