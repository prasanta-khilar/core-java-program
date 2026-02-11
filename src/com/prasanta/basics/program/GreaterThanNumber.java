package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThanNumber {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,1,6,7,9,4,10,15);

        List<Integer> results = number.stream().filter(t->t>4).sorted().collect(Collectors.toList());
        System.out.println(results);

        List<Integer> results1 = number.stream().filter(t->t%2!=0).sorted().collect(Collectors.toList());
        System.out.println(results1);
    }
}
