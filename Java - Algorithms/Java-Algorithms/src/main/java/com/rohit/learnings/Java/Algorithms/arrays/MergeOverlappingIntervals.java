package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for (int[] nextInterval : sortedIntervals) {
            int currentEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];
            if (currentEnd >= nextIntervalStart) {
                currentInterval[1] = Math.max(currentEnd, nextIntervalEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
