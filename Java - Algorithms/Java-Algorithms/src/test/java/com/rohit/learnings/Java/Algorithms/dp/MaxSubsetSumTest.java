package com.rohit.learnings.Java.Algorithms.dp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSubsetSumTest {

    private MaxSubsetSum maxSubsetSum;

    @Test
    public void testcase1_empty_input_array() {
        int expectedSum = 0;
        maxSubsetSum = new MaxSubsetSum(new int[]{});
        int actualSum = maxSubsetSum.getMaxSum();
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase2_array_with_one_element() {
        int expectedSum = 4;
        int[] input = new int[]{4};
        maxSubsetSum = new MaxSubsetSum(input);
        int actualSum = maxSubsetSum.getMaxSum();
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase3_array_with_two_elements() {
        int expectedSum = 10;
        int[] input = new int[]{4, 10};
        maxSubsetSum = new MaxSubsetSum(input);
        int actualSum = maxSubsetSum.getMaxSum();
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase4_happyPath() {
        int expectedSum = 330;
        int[] input = new int[]{75, 105, 120, 75, 90, 135};
        maxSubsetSum = new MaxSubsetSum(input);
        int actualSum = maxSubsetSum.getMaxSum();
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase5_empty_input_array() {
        int expectedSum = 0;
        int actualSum = MaxSubsetSum.getMaxSum(new int[]{});
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase6_array_with_one_element() {
        int expectedSum = 4;
        int[] input = new int[]{4};
        int actualSum = MaxSubsetSum.getMaxSum(input);
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase7_array_with_two_elements() {
        int expectedSum = 10;
        int[] input = new int[]{4, 10};
        int actualSum = MaxSubsetSum.getMaxSum(input);
        checkIfSumMatches(expectedSum, actualSum);
    }

    @Test
    public void testcase8_happyPath() {
        int expectedSum = 330;
        int[] input = new int[]{75, 105, 120, 75, 90, 135};
        int actualSum = MaxSubsetSum.getMaxSum(input);
        checkIfSumMatches(expectedSum, actualSum);
    }


    private void checkIfSumMatches(int expectedSum, int actualSum) {
        Assertions.assertThat(actualSum).isEqualTo(expectedSum);
    }
}
