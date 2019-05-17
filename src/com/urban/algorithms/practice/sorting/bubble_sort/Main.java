package com.urban.algorithms.practice.sorting.bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bubble bubbleSort = new Bubble();
        int[] array = new int[] {12, 5, 20, 3, 1};
        bubbleSort.sort(array);
        System.out.println("sorted array: " + Arrays.toString(array));
    }
}
