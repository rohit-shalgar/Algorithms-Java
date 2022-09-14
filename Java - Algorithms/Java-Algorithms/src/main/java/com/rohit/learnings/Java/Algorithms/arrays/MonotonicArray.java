package com.rohit.learnings.Java.Algorithms.arrays;

public class MonotonicArray {

    public static boolean isMonotonicOpt(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) isNonIncreasing = false;
            if (array[i] < array[i - 1]) isNonDecreasing = false;
        }
        return isNonDecreasing || isNonIncreasing;
    }

    public static boolean isMonotonic(int[] array) {
        if (array.length == 0 || array.length == 1) return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i]) continue;
            if (array[i + 1] > array[i]) return uptrend(array, i + 1);
            else return downtrend(array, i + 1);
        }
        return true;
    }


    private static boolean downtrend(int[] array, int i) {
        while (i < array.length - 1) {
            if (array[i + 1] > array[i]) return false;
        }
        return true;
    }

    private static boolean uptrend(int[] array, int i) {
        while (i < array.length - 1) {
            if (array[i + 1] < array[i]) return false;
        }
        return true;
    }
}
