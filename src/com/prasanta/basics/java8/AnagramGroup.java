package com.prasanta.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramGroup {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "act", "eat", "ate", "tea", "tac");
        list.stream()
                .collect(Collectors.groupingBy(s -> {
                    char[] c = s.toCharArray();
                    Arrays.sort(c);
                    return String.valueOf(c);
                }))
                .values().forEach(System.out::println);
    }

}
