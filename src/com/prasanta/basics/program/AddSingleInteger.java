package com.prasanta.basics.program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddSingleInteger {
    public static void main(String[] args) {
        int number= 8888  ;
        long sum = Stream.of(String.valueOf(number).split(""))
                .collect(Collectors.summarizingInt(Integer::parseInt))
                .getSum();

        System.out.println(sum);
    }

}
