package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> targetPairs = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            int rightIdx = i + 1;
            int leftIdx = array.length - 1;
            while (rightIdx < leftIdx) {
                int currentSum = array[i] + array[rightIdx] + array[leftIdx];
                if (currentSum > targetSum) leftIdx--;
                else {
                    if (currentSum == targetSum) {
                        targetPairs.add(new Integer[]{array[i], array[rightIdx], array[leftIdx]});
                    }
                    rightIdx++;
                }
            }
        }
        return targetPairs;
    }
}
