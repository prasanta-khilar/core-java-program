package com.prasanta.basics.program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "triangle";
        String s2 = "integral";

//        String s1 = "CAT";
//
//        String s2 = "ACT";
        boolean equals = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.joining())
                .equals(Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.joining()));
        System.out.println(equals);
        String collect1 = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.joining());
        System.out.println(collect1);
    }
}
