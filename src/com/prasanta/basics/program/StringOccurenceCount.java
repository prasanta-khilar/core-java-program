package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOccurenceCount {
    public static void main(String[] args) {
// Java program to count the occurence of each character in a string ?
        // input :  ilovejavatechie
        //output: {a=2, c=1, t=1, e=3, v=2, h=1, i=2, j=1, l=1, o=1}
        String input = "ilovejavatechie";

        String[] results = input.split("");

        System.out.println("Convert String to Arrays: " + Arrays.toString(results));

        Map<String, List<String>> map = Arrays.stream(results).collect(Collectors.groupingBy(s -> s));
        System.out.println("Grouping the elements: " + map);
        Map<String, Long> mapObject = Arrays.stream(results).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Counting the each occurence:" + mapObject);


        List<String> stringList = Arrays.asList("Shiva", "Shyam", "Shyam", "Santosh", "Prasanth", "Aaditya");
        Map<String, Long> mapObject1 = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Counting of each String:" + mapObject1);

        String cities = "Delhi,Agra,Bihar,UP,Delhi,Agra,Bihar,UP,Delhi,Bihar,Delhi,Agra,Delhi";

        Map<String, Long> mapObjectcity = Stream.of(cities.split(",")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Counting of each String mapObjectcity:" + mapObjectcity);
        TreeMap<String, Long> groupByCitiesMap = Stream.of(cities.split(","))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
        System.out.println("Counting of cities as ascending order:" + groupByCitiesMap);
    }
}
