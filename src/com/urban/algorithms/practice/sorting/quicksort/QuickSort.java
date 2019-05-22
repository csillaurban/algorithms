package com.urban.algorithms.practice.sorting.quicksort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] array, int low, int high) {
        if(low >= high) {
            return;
        }

        int divider = partition(array, low, high);
        quickSort(array, low, divider-1);
        quickSort(array, divider+1, high);
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[low];

        int i = low, j = high;
        while(true) {
            while (array[i] <= pivot) {
                i++;
                if (i == high) {
                    break;
                }
            }

            while (array[j] > pivot) {
                j--;
                if (j == low) {
                    break;
                }
            }


            if (i >= j) {
                break;
            }

            swap(array, i, j);

        }

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
