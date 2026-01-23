package com.prasanta.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddTogether {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,5,6,7,8,9,3);

        Map<Boolean, List<Integer>> result =
                list.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even: " + result.get(true));
        System.out.println("Odd : " + result.get(false));
    }
}
