package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceStringList {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("prasanta", "prasanta", "arun", "arun", "arun");

        List<Map.Entry<String, Long>> collect = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(collect);
        Map<String, Long> collect1 = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);


    }
}
