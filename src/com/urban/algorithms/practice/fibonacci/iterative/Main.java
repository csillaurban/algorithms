package com.urban.algorithms.practice.fibonacci.iterative;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        int nthNum = fibonacci.fibonacci(5);
        System.out.println(nthNum);
    }
}
