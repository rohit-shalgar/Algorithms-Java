package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] difference = new int[]{0, 0};
        int closest = Integer.MAX_VALUE;
        for (int ele1 : arrayOne) {
            for (int ele2 : arrayTwo) {
                int diff = Math.abs(ele1 - ele2);
                if (diff < closest) {
                    closest = diff;
                    difference[0] = ele1;
                    difference[1] = ele2;
                }
            }
        }
        return difference;
    }

    public static int[] smallestDifferenceOpt(int[] arrayOne, int[] arrayTwo) {
        int[] difference = new int[]{0, 0};
        int closest = Integer.MAX_VALUE;
        int arrayOneIdx = 0, arrayTwoIdx = 0;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        while (arrayOneIdx < arrayOne.length && arrayTwoIdx < arrayTwo.length) {
            int ele1 = arrayOne[arrayOneIdx];
            int ele2 = arrayTwo[arrayTwoIdx];
            int currentDiff = Math.abs(ele1 - ele2);
            if (currentDiff == 0) return new int[]{ele1, ele2};
            else if (currentDiff < closest) {
                closest = currentDiff;
                difference[0] = ele1;
                difference[1] = ele2;
            }
            if (ele1 < ele2) arrayOneIdx += 1;
            else arrayTwoIdx += 1;
        }
        return difference;
    }
}
