package com.prasanta.basics.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,24,4,5,56,7,58,5,4,53);
        System.out.println("1.Given the List of Integer ,Find 1st element of the List using Streams");
        Integer integer = integerList.stream().findFirst().get();
        System.out.println(integer);
        System.out.println("2.Given the List of Integer ,Find total no of element present in  List using Streams");
        Long count  = integerList.stream().count();
        System.out.println(count);
        System.out.println("3.Given the List of Integer ,Find even and odd present  in  List using Streams");
        List<Integer> integerEven = integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(integerEven);
        List<Integer> integerOdd = integerList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(integerOdd);
        System.out.println("4.Given the List of Integer ,Find the all number starting with 5 using Streams");
        List<Integer> startWith5 = integerList.stream().filter(s->s.toString().startsWith("5")).collect(Collectors.toList());
        System.out.println(startWith5);
        System.out.println("5.Given the List of Integer ,Find the dupilcate numbers in List using Streams");
        List<Integer> duplicateValue = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateValue);
        Set<Integer> temp = new HashSet<>();
        List<Integer> duplicateSet = integerList.stream().filter(s->!temp.add(s)).collect(Collectors.toList());
        System.out.println(duplicateSet);

    }
}
