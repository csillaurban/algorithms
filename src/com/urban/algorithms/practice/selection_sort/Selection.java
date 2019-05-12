package com.urban.algorithms.practice.selection_sort;


public class Selection {

    public void sort(int[] intArray) {
        //length of the input array
        int n = intArray.length;

        //keep track of the first index of the unsorted part of the array
        for (int i = 0; i < n-1; i++) {
            //pick an index for starting the comparison
            int min_idx = i;
            //j is a pointer for comparing the items
            for (int j = i+1; j < n; j++) {
                //if the current item is smaller than the compared item
                if (intArray[j] < intArray[min_idx]) {
                    //register the place of the smallest item
                    min_idx = j;
                }
            }

            //swap the smallest item with the item in the first place of the unsorted part of the array
            swap(intArray, i, min_idx);
        }
    }

    private void swap(int[] intArray, int placeOfSmallestItem, int currentPlaceSmallestItem) {
        int temp = intArray[currentPlaceSmallestItem];
        intArray[currentPlaceSmallestItem] = intArray[placeOfSmallestItem];
        intArray[placeOfSmallestItem] = temp;
    }
}
