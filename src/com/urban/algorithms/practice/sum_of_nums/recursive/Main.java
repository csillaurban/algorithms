package com.urban.algorithms.practice.sum_of_nums.recursive;

public class Main {
    public static void main(String[] args) {
        SumOfNthNum sum = new SumOfNthNum();
        int head = sum.sumHead(3);
        int tail = sum.sumTail(0, 3);
        System.out.println("Headsum: " + head);
        System.out.println("Tailsum: " + tail);
    }
}
