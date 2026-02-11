package com.prasanta.basics.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class DuplicateInteger {
    public static void main(String[] args) {
        int[] input = {12,42,62,35,35,44,33,23,12,42,33};
        Set<Integer> set = new HashSet<>();
//        Arrays.stream(input).filter(e-> !set.add(e)).forEach(System.out::println);*#21#  ##002#
        List<Integer> integerList = stream(input).filter(e -> !set.add(e)).boxed().sorted().collect(Collectors.toList());
        System.out.println(integerList);
//using grouping by
        List<Integer> collect = Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
