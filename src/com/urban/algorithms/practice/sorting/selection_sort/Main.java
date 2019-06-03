package com.urban.algorithms.practice.sorting.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Selection selectionSort = new Selection();
        String nums = "426781";

        int[] array = Arrays.stream(nums.split("")).mapToInt(item -> Integer.parseInt(item)).toArray();

        int [] intArray = new int[] {5, 3, 6, 2, 15, 12, 7};

        selectionSort.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }
}
