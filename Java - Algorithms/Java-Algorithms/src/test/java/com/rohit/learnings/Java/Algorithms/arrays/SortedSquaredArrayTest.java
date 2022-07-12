package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedSquaredArrayTest {

    @Test
    public void testcase1_singleElement() {
        int[] expected = new int[]{1};
        int[] actual = SortedSquaredArray.
                getSortedSquaredArray(expected);
        Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testcase2_multipleElements() {
        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 4, 9};
        int[] actual = SortedSquaredArray.
                getSortedSquaredArray(input);
        Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testcase3_NegativeElements() {
        int[] input = new int[]{-3, -1, 1, 2, 3};
        int[] expected = new int[]{1, 1, 4, 9, 9};
        int[] actual = SortedSquaredArray.
                getSortedSquaredArray(input);
        Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testcase4_singleElement() {
        int[] expected = new int[]{1};
        int[] actual = SortedSquaredArray.
                sortedSquaredArrayOpt(expected);
        Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testcase5_multipleElements() {
        int[] input = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 4, 9};
        int[] actual = SortedSquaredArray.
                sortedSquaredArrayOpt(input);
        Assertions.assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void testcase6_NegativeElements() {
        int[] input = new int[]{-3, -1, 1, 2, 3};
        int[] expected = new int[]{1, 1, 4, 9, 9};
        int[] actual = SortedSquaredArray.
                sortedSquaredArrayOpt(input);
        Assertions.assertThat(expected).isEqualTo(actual);
    }
}
