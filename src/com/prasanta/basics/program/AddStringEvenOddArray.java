package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStringEvenOddArray {
    public static void main(String[] args) {
        int[] input = {2,5,7,9,11,10,13};
        List even = new ArrayList();
        List odd = new ArrayList();
        Arrays.stream(input).boxed().filter(i -> i % 2 == 0 ? even.add(i+":Even"):odd.add(i+":Odd")).collect(Collectors.toList());

        even.addAll(odd);
        System.out.println(even);

    }
}
