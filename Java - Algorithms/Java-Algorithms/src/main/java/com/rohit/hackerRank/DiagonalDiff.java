package com.rohit.hackerRank;

import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int rowSize = arr.size();
        int diagOne = 0;
        int diagTwo = 0;
        for (int i = 0; i < rowSize; i++) {
            diagOne = diagOne + arr.get(i).get(i);
        }
        for (int i = 0; i < rowSize; i++) {
            diagTwo = diagTwo + arr.get(i).get(rowSize - i - 1);
        }
        return Math.abs(diagOne - diagTwo);

    }
}
