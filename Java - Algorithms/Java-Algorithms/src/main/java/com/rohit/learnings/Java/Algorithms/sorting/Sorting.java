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

    public static int[] insertionSort(int[] input) {
        if (input.length == 0) return new int[0];
        for (int i = 1; i < input.length; i++) {
            while (i > 0 && input[i] < input[i - 1]) {
                swap(input, i, i - 1);
                i--;
            }
        }
        return input;
    }

    public static int[] selectionSort(int[] array) {
        if (array.length == 0) return new int[0];
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int current = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[current]) {
                    current = j;
                }
            }
            if (current < smallest) {
                swap(array, current, i);
            }
        }
        return array;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
