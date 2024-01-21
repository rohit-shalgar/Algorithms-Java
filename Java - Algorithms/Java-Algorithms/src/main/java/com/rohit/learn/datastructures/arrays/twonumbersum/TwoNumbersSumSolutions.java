package com.rohit.learn.datastructures.arrays.twonumbersum;

import java.util.HashMap;

public class TwoNumbersSumSolutions {

    public int[] twoNumberSumBrute(int[] input, int sum) {
        for (int i = 0; i < input.length - 1; i++) {
            int first = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int second = input[j];
                if (first + second == sum) {
                    return new int[]{first, second};
                }
            }
        }
        return new int[0];
    }

    //This is correct , test cases need update
    public int[] twoNumbersSumOpt(int[] input, int sum) {
        var numbersStore = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {
            int current = input[i];
            int compliment = sum - current;
            if (numbersStore.containsKey(compliment)) {
                return new int[]{current, compliment};
            }
            numbersStore.put(current, current);
        }
        return new int[0];
    }
}
