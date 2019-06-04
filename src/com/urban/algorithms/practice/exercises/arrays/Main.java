package com.urban.algorithms.practice.exercises.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 1, 2, 3, 7, 8, 6, 4};
        int[] arr2 = {1, 2, 5, 3, 7, 8, 6, 4};
        MinimumBribes minimumBribes = new MinimumBribes();
        minimumBribes.minimumBribes(arr1);
        System.out.println("=========================");
        minimumBribes.minimumBribes(arr2);
    }
}
