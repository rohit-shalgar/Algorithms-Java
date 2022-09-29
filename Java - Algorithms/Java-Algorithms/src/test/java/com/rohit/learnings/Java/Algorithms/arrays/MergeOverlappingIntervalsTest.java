package com.rohit.learnings.Java.Algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeOverlappingIntervalsTest {

    @Test
    public void TestCase1() {
        int[][] intervals =
                new int[][]{
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] expected =
                new int[][]{
                        {1, 2},
                        {3, 8},
                        {9, 10}
                };
        int[][] actual = MergeOverlappingIntervals.mergeOverlappingIntervals(intervals);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                Assertions.assertTrue(expected[i][j] == actual[i][j]);
            }
        }
    }
}
