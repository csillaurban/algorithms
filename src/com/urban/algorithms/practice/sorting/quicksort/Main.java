package com.urban.algorithms.practice.sorting.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{51, 3, 67, 32, 10, 2, 10, 23, 140, 120, 82, 65};
        QuickSort quicksort = new QuickSort();
        quicksort.quickSort(array, 0, array.length - 1);
        quicksort.printArray(array);
    }
}
