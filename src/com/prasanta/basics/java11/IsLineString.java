package com.prasanta.basics.java11;

import java.util.stream.Stream;

public class IsLineString {

    public static void main(String[] args) {
        // lines() method
        //This method splits a string using line terminators and returns a stream
        //Return the stream of lines of multi linr string
        String str = "This is first line . \n This is second line \n.";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
    }
}
