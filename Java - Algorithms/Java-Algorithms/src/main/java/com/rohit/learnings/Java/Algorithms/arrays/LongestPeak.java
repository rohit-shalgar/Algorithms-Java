package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
            if (!isPeak) {
                i += 1;
                continue;
            }
            int leftIdx = i - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) leftIdx--;
            int rightIdx = i + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) rightIdx++;
            int tempPeakLength = rightIdx - leftIdx - 1;
            if (tempPeakLength > longestPeakLength) longestPeakLength = tempPeakLength;
            i = rightIdx;
        }
        return longestPeakLength;
    }
}
