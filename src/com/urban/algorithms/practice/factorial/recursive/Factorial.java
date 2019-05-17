package com.urban.algorithms.practice.factorial.recursive;

public class Factorial {

    public int factorial (int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
