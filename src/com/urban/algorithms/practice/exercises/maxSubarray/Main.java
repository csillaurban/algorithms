package com.urban.algorithms.practice.exercises.maxSubarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MaxSubarray maxSum = new MaxSubarray();
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] result = maxSum.maxSubarray(arr);
        System.out.println("The maxSum of subarray and subsequence: " + Arrays.toString(result));
    }
}
