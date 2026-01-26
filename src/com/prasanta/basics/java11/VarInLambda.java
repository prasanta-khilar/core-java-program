package com.prasanta.basics.java11;

import java.util.function.BiFunction;

public class VarInLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add =
                (var a, var b) -> a + b;
        System.out.println(add.apply(5, 7));

    }
}
