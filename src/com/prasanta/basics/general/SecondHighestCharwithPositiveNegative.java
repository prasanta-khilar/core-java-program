package com.prasanta.basics.general;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class SecondHighestCharwithPositiveNegative {


    public static void main(String[] args) {
        test("aabaabbcc");   // positive
        test("aaaaaaa");    // negative
        test("");           // negative
        test(null);         // negative
    }

    private static void test(String str) {

        if (str == null || str.isEmpty()) {
            System.out.println("Input: " + str + " → Second highest not available");
            return;
        }
        List<Map.Entry<Character, Long>> sorted = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        if (sorted.size() > 1) {
            System.out.println("Input: " + str + " → " + sorted.get(1).getKey());
        } else {
            System.out.println("Input: " + str + " → Second highest not available");
        }
    }
}
