package com.prasanta.basics.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class calculateSum {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = calculateRunningSum(nums);
        System.out.println(result); // Expected: [1, 3, 6, 10]
    }

    public static List<Integer> calculateRunningSum(List<Integer> nums) {
        List<Integer> runningSum = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            runningSum.add(sum);
        }

        return runningSum;
    }
}
