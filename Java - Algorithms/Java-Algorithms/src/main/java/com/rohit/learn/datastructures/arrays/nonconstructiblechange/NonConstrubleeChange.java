package com.rohit.learn.datastructures.arrays.nonconstructiblechange;

import java.util.Arrays;

public class NonConstrubleeChange {
    public int construct(int[] input) {
        int nonConstructableChange = 0;
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            int currentElement = input[i];
            if (currentElement > nonConstructableChange + 1) {
                return nonConstructableChange + 1;
            } else {
                nonConstructableChange = nonConstructableChange + currentElement;
            }
        }
        return nonConstructableChange + 1;
    }
}
