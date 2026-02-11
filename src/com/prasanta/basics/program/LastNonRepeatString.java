package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LastNonRepeatString {
    public static void main(String[] args) {
        String str = "hi there";

        String strValue = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).reduce((first, second) -> second)
                .get();

        System.out.println(strValue);

    }
}
