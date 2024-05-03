package com.rohit.learn.datastructures.sorting;

public class BubbleSort {
    public static int[] sort(int[] array) {
        boolean swapped = false;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapped = true;
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        } while (swapped);
        return array;
    }
}

