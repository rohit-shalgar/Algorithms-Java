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

    public int[] sortedSquaredArrayOpt(int[] array) {
        int[] output = new int[array.length];
        int start = 0, end = array.length - 1;
        int endIndexForOutputArray = array.length - 1;
        while (start <= end) {
            int currentStartElement = array[start];
            int currentEndElement = array[end];
            if (Math.abs(currentStartElement) > Math.abs(currentEndElement)) {
                output[endIndexForOutputArray] = currentStartElement * currentStartElement;
                start++;
            } else {
                output[endIndexForOutputArray] = currentEndElement * currentEndElement;
                end--;
            }
            endIndexForOutputArray--;
        }
        return output;
    }

}
