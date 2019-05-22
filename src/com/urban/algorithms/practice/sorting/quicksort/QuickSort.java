package com.urban.algorithms.practice.sorting.quicksort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] array, int low, int high) {
        //base case
        if(low >= high) {
            return;
        }

        //divider of array, its position is sorted
        int divider = partition(array, low, high);
        //recursive call on the left and the right side of the array from the divider
        quickSort(array, low, divider-1);
        quickSort(array, divider+1, high);
    }

    public int partition(int[] array, int low, int high) {
        //pivot: the first element of the array
        int pivot = array[low];

        int i = low, j = high;
        while(true) {
            //while az element of the array is smaller than the pivot --> step forward
            while (array[i] <= pivot) {
                i++;
                //if it is reach the end of the array, break
                if (i == high) {
                    break;
                }
            }

            //while az element of the array is bigger than the pivot --> step backward
            while (array[j] > pivot) {
                j--;
                //if it is reach the start, break
                if (j == low) {
                    break;
                }
            }

            //if the two pointers cross --> break
            if (i >= j) {
                break;
            }

            //if i and j pointers stop (i reaches a bigger element than pivot and j reaches a smaller element of pivot
            // swap the two elements
            swap(array, i, j);

        }
        //if the pointers cross: swap the starting element with j --> j is in sorted position
        swap(array, low, j);
        return j;
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
