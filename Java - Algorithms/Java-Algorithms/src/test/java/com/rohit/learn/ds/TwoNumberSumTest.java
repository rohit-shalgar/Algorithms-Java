package com.rohit.learn.ds;

import com.rohit.learn.datastructures.arrays.twonumbersum.TwoNumbersSumSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoNumberSumTest {

    @Test
    public void testcase1() {
        var input = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] expected = new int[]{11, -1};
        checkIfExpectedIsSameAsOutput(expected, targetSum, input);
    }

    @Test
    public void testcase2() {
        var input = new int[]{14};
        int targetSum = 15;
        int[] expected = new int[]{};
        checkIfExpectedIsSameAsOutput(expected, targetSum, input);
    }

    private void checkIfExpectedIsSameAsOutput(int[] expected, int targetSum, int[] input) {
        var twoNumbersSum = new TwoNumbersSumSolutions();
        var actual = twoNumbersSum.twoNumberSumBrute(input, targetSum);
        var actualOpt = twoNumbersSum.twoNumbersSumOpt(input,targetSum);
        Assertions.assertTrue(expected.length == actual.length);
        Assertions.assertTrue(Arrays.equals(actual,expected));
        Assertions.assertTrue(expected.length == actualOpt.length);
        Assertions.assertTrue(Arrays.equals(actualOpt,expected));
    }

}
