package com.urban.algorithms.practice.sorting.mergesort;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[]{51, 3, 67, 32, 10, 2, 10, 23, 140, 120, 82, 65};
        mergeSort.mergeSort(array, 0, array.length -1);
        mergeSort.printArray(array);
    }
}
