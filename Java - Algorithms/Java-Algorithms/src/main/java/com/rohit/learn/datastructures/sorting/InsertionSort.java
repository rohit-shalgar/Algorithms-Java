package com.rohit.learn.datastructures.sorting;

public class InsertionSort {
    public static int[] insertionSOrt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int counter = i;
                while (counter >= 0) {
                    if (array[counter] > array[j]) {
                        int temp = array[j];
                        array[j] = array[counter];
                        array[counter ] = temp;
                    }
                    counter--;
                }

            }
        }
        return array;
    }
}
