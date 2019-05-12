package com.urban.algorithms.practice.selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Selection selectionSort = new Selection();

        int [] intArray = new int[] {5, 3, 6, 2, 15, 12, 7};

        selectionSort.sort(intArray);
        System.out.println("Original array: " + Arrays.toString(intArray));

    }
}
