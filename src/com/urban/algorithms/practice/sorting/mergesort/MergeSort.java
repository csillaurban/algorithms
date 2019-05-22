package com.urban.algorithms.practice.sorting.mergesort;


public class MergeSort {

    public void mergeSort(int[] array, int low, int high) {
        if(low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    public void merge(int[] array, int low, int middle, int high) {
        int length1 = middle - low + 1;
        int length2 = high - middle;
        int[] temp1 = new int[length1];
        int[] temp2 = new int[length2];

        for (int i = 0; i < length1; i++) {
            temp1[i] = array[low + i];
        }
        for (int j = 0; j < length2; j++) {
            temp2[j] = array[middle + 1 + j];
        }

        int l = 0, m = 0, k = low;

        while(l < length1 && m < length2) {
            if(temp1[l] <= temp2[m]) {
                array[k] = temp1[l];
                l++;
            } else {
                array[k] = temp2[m];
                m++;
            }
            k++;
        }

        while(l < length1) {
            array[k] = temp1[l];
            l++;
            k++;
        }

        while(m < length2) {
            array[k] = temp2[m];
            m++;
            k++;
        }

    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
