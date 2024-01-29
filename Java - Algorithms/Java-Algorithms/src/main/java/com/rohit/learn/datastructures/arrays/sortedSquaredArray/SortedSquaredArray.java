package com.rohit.learn.datastructures.arrays.sortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArray {

    public int[] sortedSquaredArrayBrute(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            output[i] = currentElement * currentElement;
        }
        Arrays.sort(output);
        return output;
    }
}
