package com.prasanta.basics.program;

import java.util.stream.IntStream;

public class SkipAndLimits {
    //Skips and limit method use case based example print : 2to 9
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
    }
}
