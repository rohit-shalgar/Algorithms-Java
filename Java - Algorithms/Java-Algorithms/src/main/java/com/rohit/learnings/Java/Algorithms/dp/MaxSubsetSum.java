package com.rohit.learnings.Java.Algorithms.dp;

public class MaxSubsetSum {

    private final int[] maxSumAtEachIndex;
    private final int length;

    public MaxSubsetSum(int[] input) {
        maxSumAtEachIndex = input.clone();
        length = maxSumAtEachIndex.length;
    }

    public int getMaxSum() {
        if (length <= 2) {
            return handleBaseCases();
        }
        for (int i = 2; i < length; i++) {
            updateMaxValueAtEachIndex(i);
        }
        return maxSumAtEachIndex[length - 1];
    }

    private int handleBaseCases() {
        if (maxSumAtEachIndex.length == 0) {
            return 0;
        } else if (maxSumAtEachIndex.length == 1) {
            return maxSumAtEachIndex[0];
        } else if (maxSumAtEachIndex.length == 2) {
            return Math.max(maxSumAtEachIndex[0], maxSumAtEachIndex[1]);
        }
        return 0;
    }

    private void updateMaxValueAtEachIndex(int i) {
        maxSumAtEachIndex[i] = Math.max(maxSumAtEachIndex[i - 1],
                (maxSumAtEachIndex[i - 2] + maxSumAtEachIndex[i]));
    }

    public static int getMaxSum(int[] input) {
        if (input.length == 0) {
            return 0;
        } else if (input.length == 1) {
            return input[0];
        }
        int firstIndex = input[0];
        int secondIndex = Math.max(input[0], input[1]);
        for (int i = 2; i < input.length; i++) {
            int current = Math.max(secondIndex, firstIndex + input[i]);
            firstIndex = secondIndex;
            secondIndex = current;
        }
        return secondIndex;
    }
}
