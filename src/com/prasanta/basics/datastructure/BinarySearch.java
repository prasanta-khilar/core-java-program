package com.prasanta.basics.datastructure;
import java.util.Arrays;

public class BinarySearch {


        public static void main(String[] args) {
            int[] arr = {5,10,2,20,15,13,13,56};
            int index = Arrays.binarySearch(arr, 15);

            System.out.println(index); // Output: 2
        }


}
