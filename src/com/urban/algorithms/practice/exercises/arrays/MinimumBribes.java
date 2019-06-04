package com.urban.algorithms.practice.exercises.arrays;



public class MinimumBribes {

    public void minimumBribes(int[] q) {
        int bribes = 0;

        for (int i = q.length -1; i >=0; i--) {
            if(q[i] - (i+1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            int j = 0;
            
            if(q[i] -2 > 0){
                j = q[i] - 2;
            }

            while(j < i) {
                if(q[j] > q[i]) {
                    j++;
                    bribes++;
                } else {
                    j++;
                }
            }
        }


        System.out.println(bribes);
    }

}
