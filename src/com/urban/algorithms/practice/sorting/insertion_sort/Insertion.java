package com.urban.algorithms.practice.sorting.insertion_sort;

public class Insertion {

    public void sort(int[] intArray) {
        int lengthOfArray = intArray.length;

        //pointer to the first index of the unsorted part of the array
        for (int i = 0; i < lengthOfArray; i++) {
            //pointer for comparing the items backwards
            for (int j = i; j > 0 && intArray[j] < intArray[j - 1]; j--) {
                swap(intArray, j, j-1);
            }
        }
    }

    private void swap(int[] intArray, int placeOfSmaller, int placeToMove) {
        int temp = intArray[placeOfSmaller];
        intArray[placeOfSmaller] = intArray[placeToMove];
        intArray[placeToMove] = temp;
    }
}
