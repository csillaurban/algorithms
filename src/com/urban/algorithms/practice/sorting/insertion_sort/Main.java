package com.urban.algorithms.practice.sorting.insertion_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        int[] intArray = new int[] {8, 2, 45, 9, 10, 5};
        insertion.sort(intArray);
        System.out.println("Sorted array: "+ Arrays.toString(intArray));
    }
}
