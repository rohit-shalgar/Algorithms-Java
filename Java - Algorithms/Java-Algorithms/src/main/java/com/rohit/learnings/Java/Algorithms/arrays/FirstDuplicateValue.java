package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstDuplicateValue {
    public static int firstDuplicateValue(int[] input) {
        int index = Integer.MAX_VALUE;
        boolean duplicateFound = false;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j] && j < index) {
                    index = j;
                    duplicateFound = true;
                }
            }
        }
        if (duplicateFound)
            return input[index];
        else
            return -1;
    }

    public static int firstDuplicateValueOpt(int[] input) {
        Set<Integer> duplicateIndexes = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            var value = input[i];
            if (duplicateIndexes.contains(value)) {
                return value;
            }
            duplicateIndexes.add(value);
        }
        return -1;
    }
}
