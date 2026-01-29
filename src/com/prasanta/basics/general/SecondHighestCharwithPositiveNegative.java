package com.prasanta.basics.general;

import java.util.*;
import java.util.stream.*;

public class SecondHighestCharwithPositiveNegative {

    public static Optional<Character> secondHighestChar(String str) {

        // Negative scenarios
        if (str == null || str.length() < 2) {
            return Optional.empty();
        }

        Map<Character, Long> freqMap =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.counting()));

        // Need at least 2 distinct characters
        if (freqMap.size() < 2) {
            return Optional.empty();
        }

        long maxFreq = freqMap.values()
                .stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        return freqMap.entrySet()
                .stream()
                .filter(e -> e.getValue() < maxFreq)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        test("aabaabbcc");  // positive
        test("aaaaaaaa");  // negative
        test("a");         // negative
        test("");          // negative
        test(null);        // negative
    }

    private static void test(String str) {
        System.out.println("Input: " + str + " => " +
                secondHighestChar(str).orElse(null));
    }
}
