package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReArrangePositiveNegative {


    public static void main(String[] args) {

        int[] input = {20, 70, -40, 30, -10};
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        Arrays.stream(input).forEach(i->(i<0?negative:positive).add(i));
        positive.addAll(negative);
        System.out.println(positive);
        List<Integer> collect = positive.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
