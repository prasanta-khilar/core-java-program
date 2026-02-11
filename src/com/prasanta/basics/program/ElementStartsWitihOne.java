package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartsWitihOne {

    //Java Program to find all elements from array who starts with 1
//    int[] numbers= {5,9,11,2,8,21,1};
    public static void main(String[] args) {
        int[] numbers= {5,9,11,2,8,21,1};
        List<String> startsWithOne = Arrays.stream(numbers).boxed()
                .map(s -> s + "")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Starts with one : "+startsWithOne);
    }

}
