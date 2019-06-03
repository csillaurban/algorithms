package com.urban.algorithms.practice.exercises.primeFinder;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    public List<Integer> findPrimes(int num1, int num2) {
        List<Integer> primes = new ArrayList<>();

        for (int i = num1; i <=num2 ; i++) {
            if(i == 2 | i == 3) {
                primes.add(i);
            } else {
                boolean prime = false;
                for (int j = 2; j <= i / 2 ; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }
                }
                if(prime) {
                    primes.add(i);
                }
            }
        }
        return primes;
    }
}
