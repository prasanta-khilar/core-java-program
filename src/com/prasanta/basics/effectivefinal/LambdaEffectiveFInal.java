package com.prasanta.basics.effectivefinal;

import java.util.function.Consumer;

public class LambdaEffectiveFInal {

    public static void main(String[] args) {
        int localVariable = 100;
        Consumer<Integer> consumer = (a)->{
            System.out.println(a+localVariable);
        };
consumer.accept(localVariable);
    }
}
