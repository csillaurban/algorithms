package com.urban.algorithms.practice.fibonacci.iterative;

public class Fibonacci {

    public int fibonacci(int n) {
        int previousNum = 0;
        int fib = 1;

        for (int i = 3; i <= n; i++) {
            int temp = fib;
            fib += previousNum;
            previousNum = temp;
        }

        return fib;
    }
}
