package com.prasanta.basics;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 18 / 0;
            System.out.println("bye");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}