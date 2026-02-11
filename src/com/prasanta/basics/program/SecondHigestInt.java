package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigestInt {

//Find 2nd highest number from given array
    // int[] input = {2,3,6,9,5,11,21};
    public static void main(String[] args) {
        int[] input = {2,3,6,9,5,11,21};

        Integer secondHighest = Arrays.stream(input).boxed()
                .sorted(Comparator.reverseOrder()) // 2nd highest number , output : 11
//                .sorted() // 2nd lowest number , output :3
                .skip(1)
                .findFirst()
                .get();
        System.out.println("second Highest Integer: "+secondHighest);

        List<Integer> listValue= Arrays.asList(1,4,7,2,3);
        Integer list = listValue.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Highest from List integer: "+list);
    }
}
