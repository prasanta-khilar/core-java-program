package com.prasanta.basics.program;

import java.util.function.Consumer;

public class EffectivelyFinal {

    public static void main(String[] args) {
        int localVariable=100;
        Consumer<Integer> consumer = (a)->{
                System.out.println(localVariable);
        };
        consumer.accept(localVariable);
    }
}
