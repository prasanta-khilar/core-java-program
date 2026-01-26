package com.prasanta.basics.java11;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("joe","jullie");
        String[] name =list.toArray(new String[list.size()]);
        System.out.println(name.length);
        name = Arrays.stream(name).toArray(String[]::new);
        System.out.println(name.length);

    }
}
