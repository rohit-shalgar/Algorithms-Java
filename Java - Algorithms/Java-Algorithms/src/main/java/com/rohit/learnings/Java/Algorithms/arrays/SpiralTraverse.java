package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> traverse(int[][] array) {
        List<Integer> traversalOutput = new ArrayList<>();
        int startCol = 0;
        int endCol = array[0].length - 1;
        int startRow = 0;
        int endRow = array.length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                traversalOutput.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                traversalOutput.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) break;
                traversalOutput.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                if (startCol == endCol) break;
                traversalOutput.add(array[row][startCol]);
            }
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
        return traversalOutput;
    }
}
