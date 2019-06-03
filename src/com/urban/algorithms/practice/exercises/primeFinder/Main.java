package com.urban.algorithms.practice.exercises.primeFinder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrimeFinder primeFinder = new PrimeFinder();
        List<Integer> primes = primeFinder.findPrimes(1, 13);
        System.out.println("Primes: " + primes);
    }
}
