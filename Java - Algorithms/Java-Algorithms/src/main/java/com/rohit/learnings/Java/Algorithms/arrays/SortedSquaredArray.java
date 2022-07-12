package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    public static int[] getSortedSquaredArray(int[] expected) {
        int[] sortedSquaredArray = new int[expected.length];
        for (int i = 0; i < expected.length; i++) {
            sortedSquaredArray[i] = expected[i] * expected[i];
        }
        Arrays.sort(sortedSquaredArray);
        return sortedSquaredArray;
    }

    public static int[] sortedSquaredArrayOpt(int[] expected) {
        int length = expected.length;
        int[] sortedSquaredArray = new int[length];
        int i = length - 1;
        int start = 0, end = i;
        while (start < length &&
                end >= 0 &&
                start <= end) {
            int startElement = expected[start];
            int endElement = expected[end];
            if (Math.abs(startElement) > Math.abs(endElement)) {
                sortedSquaredArray[i] = startElement * startElement;
                start += 1;
            } else {
                sortedSquaredArray[i] = endElement * endElement;
                end -= 1;
            }
            i--;
        }
        return sortedSquaredArray;
    }

}
