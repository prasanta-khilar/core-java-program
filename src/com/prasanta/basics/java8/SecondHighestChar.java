package com.prasanta.basics.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestChar {
    public static void main(String[] args) {

        String str = "aabaabbcc";

        List<Map.Entry<Character, Long>> sorted =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .toList();

        if (sorted.size() > 1) {
            System.out.println(sorted.get(1).getKey());
        } else {
            System.out.println("Second highest not available");
        }

    }
}
