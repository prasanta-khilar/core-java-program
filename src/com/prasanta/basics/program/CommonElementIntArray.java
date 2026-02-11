package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementIntArray {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7));

        List<Integer> result = list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
