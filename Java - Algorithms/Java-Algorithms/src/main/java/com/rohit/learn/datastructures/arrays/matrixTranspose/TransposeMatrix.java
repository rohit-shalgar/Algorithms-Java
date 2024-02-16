package com.rohit.learn.datastructures.arrays.matrixTranspose;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] input) {
        int[][] output = new int[input[0].length][input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                output[i][j] = input[j][i];
            }
        }
        return output;
    }
}
