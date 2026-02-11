package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatString {
    // java program to find first non repeat element from a given String
    //input: "ilovejavatechie"
    //out : l:2
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        String[] results = input.split("");

//        List<String> nonRepeatElement =
        String firstNonRepeatElement = Arrays.stream(results)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() == 1)// First non repeat character
//                .stream().filter(x -> x.getValue() > 1) //First repeat CHaracter
                .findFirst().get().getKey();
        System.out.println("First non repeat element : "+firstNonRepeatElement);
    }
}
