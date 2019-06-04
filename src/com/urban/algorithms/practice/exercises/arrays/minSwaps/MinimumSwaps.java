package com.urban.algorithms.practice.exercises.arrays.minSwaps;

import java.util.Arrays;

/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
 * without any duplicates. You are allowed to swap any two elements.
 * You need to find the minimum number of swaps required to sort the array in ascending order.
 */

public class MinimumSwaps {
    public int minSwaps(int[] arr) {
        int[] sortedArray = new int[arr.length];
        System.arraycopy(arr, 0, sortedArray, 0, arr.length);
        Arrays.sort(sortedArray);
        int swapping = 0;

        for(int i = 0; i < sortedArray.length; i++) {
            int j = i;
            if(arr[i] != sortedArray[i]) {
                while(j < arr.length) {
                    if(arr[j] == sortedArray[i]) {
                        swap(arr, i, j);
                        swapping++;
                        break;
                    } else{
                        j++;
                    }
                }
            }
        }

        return swapping;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
