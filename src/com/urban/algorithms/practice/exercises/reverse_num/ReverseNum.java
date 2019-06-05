package com.urban.algorithms.practice.exercises.reverse_num;

import java.util.Arrays;

public class ReverseNum {
    public int reverse(int x) {
        int reversed = 0;

        int num = x;
        int prevNum = 0;

        while(num!=0) {
            int digit = num % 10;

            reversed = reversed * 10 + digit;
            if((reversed - digit) / 10 != prevNum) {
                System.out.println("overflow");
                return 0;
            }
            prevNum = reversed;
            num /= 10;


        }
        System.out.println("The reversed number: " + reversed);
        return reversed;

    }
}
