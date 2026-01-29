package com.prasanta.basics.general;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {

    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        System.out.println("2nd Highest :"+secondHighest);
        Integer first = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second highest Number :"+first);
    }
}
