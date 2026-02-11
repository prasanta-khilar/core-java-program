package com.prasanta.basics.program;

import java.util.Arrays;
import java.util.List;

public class TotalNumberCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,1,2,3,4,5,6,77,88,44,23,44,55,6);
        List<String> listString = Arrays.asList("23","1","23","4","5","6","77","88","44","23","44","55","6","w","22");
        long countNumber = list.stream().count();
        System.out.println(countNumber);
        long countString = listString.stream().count();
        System.out.println(countString);
    }
}
