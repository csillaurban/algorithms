package com.urban.algorithms.practice.fibonacci.recursive;

public class Fibonacci {

    public int fibonacci (int n) {
        if(n <= 3) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
