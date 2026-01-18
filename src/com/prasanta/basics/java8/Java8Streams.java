package com.prasanta.basics.java8;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,24,4,5,56,7,8,58,5,4,53);
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
        System.out.println("6.Given the List of Integer ,Find maximum and minimum value present in List using Streams");
        Integer maxValue = integerList.stream().max(Integer::compareTo).get();
        System.out.println(maxValue);
        Integer minValue = integerList.stream().min(Integer::compareTo).get();
        System.out.println(minValue);
        System.out.println("7.Given the List of Integer ,sort asc and desc order for all the value present in List using Streams");
        List<Integer> sortedAsc = integerList.stream().sorted().toList();
        System.out.println(sortedAsc);
        List<Integer> sortedDesc = integerList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedDesc);
        System.out.println("8.Check array contain duplicate value or not .");
        int[] array = {2,4,6,7,8,9,4,2,11,15,7};
        Set<Integer> set = new HashSet<>();
        List<Integer> dupValue = Arrays.stream(array).boxed().filter(n -> !set.add(n)).toList();//using HashSet
        System.out.println(dupValue);
        List<Integer> dupUsingGrpBy = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(n->n.getValue()>1)
                        .map(Map.Entry::getKey).toList();
        System.out.println(dupUsingGrpBy);
        System.out.println("9.java 8 program to perform square on list element and filter numbers greater than 50.");
        List<Integer> multiplyWithGreaterThan50 = integerList.stream().map(n->n*n).filter(n->n>50).toList();
        System.out.println(multiplyWithGreaterThan50);
        System.out.println("10.java 8 program to sort the array.");
        List<Integer> toSort = Arrays.stream(array).sorted().boxed().toList();
        System.out.println(toSort);
        System.out.println("11.how to use map to convert words into Uppercase .");
        List<String> words = Arrays.asList("dev","byte","school");
        List<String> uppercases = words.stream().map(n -> n.toUpperCase()).toList();
        System.out.println(uppercases);
        System.out.println("12.find max element in an array");
        int asInt = Arrays.stream(array).max().getAsInt();
        System.out.println(asInt);


    }
}
