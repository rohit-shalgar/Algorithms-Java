package com.rohit.learn.ds;

import com.rohit.learn.datastructures.arrays.matrixTranspose.TransposeMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransPosematrix {
    @Test
    public void transPoseMatrix() {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = new TransposeMatrix().transposeMatrix(input);
        Assertions.assertTrue(actual.length == expected.length);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                Assertions.assertEquals(expected[i][j], actual[i][j]);
            }
        }

    }
}
