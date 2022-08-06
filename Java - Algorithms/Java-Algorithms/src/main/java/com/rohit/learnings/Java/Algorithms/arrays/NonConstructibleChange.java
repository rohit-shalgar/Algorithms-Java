package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
    public static int getChange(int[] input) {
        int change = 0;
        Arrays.sort(input);
        for (int element : input) {
            if (element > change + 1) {
                return change + 1;
            }
            change = change + element;
        }
        return change + 1;
    }
}
