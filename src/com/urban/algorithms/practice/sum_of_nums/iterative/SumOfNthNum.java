package com.urban.algorithms.practice.sum_of_nums.iterative;

public class SumOfNthNum {

    public int sum(int n) {
        int sum = 0;
        if(n<0) {
            return -1;
        }

        for (int i = 0; i <=n; i++) {
            sum += i;
        }
        return sum;
    }
}
