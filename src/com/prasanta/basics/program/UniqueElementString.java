package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementString {

    // java program to find all unique element from a given String
    //input: "ilovejavatechie"
    public static void main(String[] args) {

        String input = "ilovejavatechie";
        String[] results = input.split("");

        List<String> uniqueElement = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Unique element on given String :" + uniqueElement);
    }
}
