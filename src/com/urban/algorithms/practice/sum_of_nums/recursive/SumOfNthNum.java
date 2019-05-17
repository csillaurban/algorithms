package com.urban.algorithms.practice.sum_of_nums.recursive;

public class SumOfNthNum {

    public int sumHead(int n) {
        if(n >= 1) {
            return sumHead(n - 1) + n;
        }
        return n;
    }

    public int sumTail(int currentSum, int n) {
        if(n <= 1) {
            return currentSum + n;
        }
        return sumTail(currentSum + n, n - 1);
    }
}
