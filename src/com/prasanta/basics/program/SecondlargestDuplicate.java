package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondlargestDuplicate {

    public static void main(String[] args) {

        String str = "abbcccddddddccccccc";
        Map.Entry<String, Long> stringLongMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().get();

        System.out.println(stringLongMap);



    }
}
