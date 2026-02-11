package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

//        int[] integersValue1 = {3, 4, 66, 44, 55, 77, 99, 10};
        List<Integer> integersValue = Arrays.asList(3, 4, 66, 44, 55, 77, 99, 10);
        System.out.println(integersValue);
//        System.out.println(integersValue1);
        List<Integer> evenNumberList = integersValue.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("Even number List : "+evenNumberList);

    }
}
