package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
    public static int getChange(int[] input) {
        if (input.length == 0) return 1;
        int change = 0;
        int[] sortedInput = input;
        Arrays.sort(sortedInput);
        for (int i = 0; i < sortedInput.length; i++) {
            int current = sortedInput[i];
            if (current > change + 1) {
                return change + 1;
            }
            change = change + current;
        }
        return change + 1;
    }
}
