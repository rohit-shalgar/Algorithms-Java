package com.rohit.learnings.Java.Algorithms.sorting;

public class Sorting {

    //In place sorting. o(1) sc but o(n2) tc
    //each element is checked with next one and swapped if greater.
    public static int[] bubbleSort(int[] input) {
        if (input.length == 0) {
            return new int[0];
        }
        boolean isSorted = false;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < input.length - 1 - counter; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i, i + 1);
                    isSorted = false;
                }
            }
            counter++;
        }
        return input;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
