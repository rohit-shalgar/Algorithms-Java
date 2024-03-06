package com.rohit.learn.datastructures.arrays.threeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public List<Integer[]> threeNumberSumOpt(int[] input, int sum) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < input.length - 2; i++) {
            int current = input[i];
            int rightIndex = i + 1;
            int leftIndex = input.length - 1;
            while (rightIndex < leftIndex) {
                int currentSum = current + input[rightIndex] + input[leftIndex];
                if (currentSum == sum) {
                    Integer[] currentArray = {current, input[rightIndex], input[leftIndex]};
                    output.add(currentArray);
                    leftIndex--;
                    rightIndex++;
                } else if (currentSum > sum) {
                    leftIndex--;
                } else {
                    rightIndex++;
                }
            }
        }
        return output;
    }

}
