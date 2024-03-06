package com.rohit.learn.datastructures.arrays.smallestAbsoluteDiff;

import java.util.Arrays;

public class SmallestAbsDiff {
    public static int[] smallestDiff(int[] array1, int[] array2) {
        int difference = Integer.MAX_VALUE;
        int arrayOne = 0;
        int arrayTwo = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int total = Math.abs(array1[i] - array2[j]);
                if (total < difference) {
                    arrayOne = array1[i];
                    arrayTwo = array2[j];
                    difference = total;
                }
            }
        }
        return new int[]{arrayOne, arrayTwo};
    }

    public static int[] smallestDiffOptm(int[] array1, int[] array2) {
        int difference = Integer.MAX_VALUE;
        Arrays.sort(array1);
        Arrays.sort(array2);
        int arr1Index = 0;
        int arr2Index = 0;
        int arrayOne = 0;
        int arrayTwo = 0;
        while (arr1Index < array1.length && arr2Index < array2.length) {
            int arr1Element = array1[arr1Index];
            int arr2Element = array2[arr2Index];
            if (arr1Element > arr2Element) {
                arr2Index++;
            } else if (arr2Element > arr1Element) {
                arr1Index++;
            } else {
                return new int[]{arr1Element, arr2Element};
            }
            int currentDiff = Math.abs(arr1Element - arr2Element);
            if (currentDiff < difference) {
                arrayOne = arr1Element;
                arrayTwo = arr2Element;
                difference = currentDiff;
            }

        }

        return new int[]{arrayOne, arrayTwo};
    }

}
