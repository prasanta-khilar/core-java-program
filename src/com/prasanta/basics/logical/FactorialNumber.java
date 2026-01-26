package com.prasanta.basics.logical;

public class FactorialNumber {
    public static void main(String[] args) {
        //5! = 5 x 4 x 3 x 2 x 1 = 120
        int no = 5;

        if (no < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;  // Variable to store the factorial result

            // Calculate factorial using a loop
            for (int i = 1; i <= no; i++) {
                fact = fact * i;
            }

            // Display the result
            System.out.println("Factorial of " + no + " is: " + fact);
        }
    }
}
