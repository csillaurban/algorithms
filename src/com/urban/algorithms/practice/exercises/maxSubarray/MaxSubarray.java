package com.urban.algorithms.practice.exercises.maxSubarray;

public class MaxSubarray {

    public int[] maxSubarray(int[] arr) {
        int[] result = new int[2];
        //register the current max sum
        int currentMax = 0;
        //register the current positive sum of subarray
        int positiveSumOfSubarray = 0;
        //register how many neg and pos numbers in the array
        int positiveCounter = 0;
        int negativeCounter = 0;

        //if there is one item in the array: return this
        if(arr.length == 1) {
            result[0] = arr[0];
            result[1] = arr[0];
            return result;
        }

        //count the negative and positive numbers
        for(int i=0; i <arr.length; i++) {
            if(arr[i] < 0) {
                negativeCounter += 1;
            } else {
                positiveCounter += 1;
            }
        }

        //if there are positive numbers, calculate the maxSum of subarray
        if(positiveCounter != 0) {
            for(int i = 0; i < arr.length; i++) {
                positiveSumOfSubarray += arr[i];
                if(positiveSumOfSubarray < 0) {
                    positiveSumOfSubarray = 0;
                }
                if(currentMax < positiveSumOfSubarray) {
                    currentMax = positiveSumOfSubarray;
                }
            }
            result[0] = currentMax;
        }

        //CALCULATE THE MAXSUM OF SUBSEQUENCE

        //create two array for neg and pos numbers
        int[] negArr = new int[negativeCounter];
        int[] posArr = new int[positiveCounter];
        //pointer to the indices of the arrays
        int negIdx = 0;
        int posIdx = 0;

        //fill the arrays
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                posArr[posIdx] = arr[i];
                posIdx++;
            } else if(arr[i] < 0) {
                negArr[negIdx] = arr[i];
                negIdx++;
            }
        }


        //if there are pos numbers: sum
        if(posArr.length != 0) {
            int posSum = 0;
            for(int i = 0; i < posArr.length; i++) {
                posSum += posArr[i];
            }
            result[1] = posSum;
        //if there are just negative sum, find the greatest and return it in both cases
        } else {
            int negMin = negArr[0];
            for(int i =0; i <negArr.length; i++) {
                if(negArr[i] >= negMin) {
                    negMin = negArr[i];
                }
            }
            result[0] = negMin;
            result[1] = negMin;
        }

        return result;
    }

}
