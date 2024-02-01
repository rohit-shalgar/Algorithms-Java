package com.rohit.learn.ds;

import com.rohit.learn.datastructures.arrays.sortedSquaredArray.SortedSquaredArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedSquaredArrayTest {

    @Test
    public void testSortedSquaredArray() {
        var input = new int[]{1, 3, 5, 7, 8, 9};
        var expected = new int[]{1, 9, 25, 49, 64, 81};
        var actual = new SortedSquaredArray();
        checkIfActualMatchesInput(actual,input,expected);

        //data #2
        input = new int[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        expected = new int[]{0,0,1,1,1,4,4,9,169,361,400,2500};
        checkIfActualMatchesInput(actual,input,expected);
    }

    private void checkIfActualMatchesInput(SortedSquaredArray sortedSquaredArray, int[] input, int[] expected) {
        var actual = sortedSquaredArray.sortedSquaredArrayBrute(input);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(expected[i] == actual[i]);
        }
        var actualOpt = sortedSquaredArray.sortedSquaredArrayOpt(input);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(expected[i] == actualOpt[i]);
        }
    }

}
