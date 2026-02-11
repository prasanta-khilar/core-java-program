package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortEvenAndOdd {
    public static void main(String[] args) {
        int[] input = {5, 12, 3, 21, 8, 7, 19, 102, 201 };


        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i : input) {
            if ((i & 1) == 1) {
                odd.add(i);
            } else even.add(i);
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println("Odd:" + odd);
        System.out.println("Even:" + even);
        even.addAll(odd);
        System.out.println(even);

        int[] evenodd = {12,4,3,2,6,5,7,9,11};
        List<Integer> evenV = new ArrayList<>();
        List<Integer> oddV = new ArrayList<>();
        Arrays.stream(evenodd).forEach(i -> (i % 2 == 0 ? evenV : oddV).add(i));
        evenV.addAll(oddV);
        System.out.println(evenV);
    }

}
