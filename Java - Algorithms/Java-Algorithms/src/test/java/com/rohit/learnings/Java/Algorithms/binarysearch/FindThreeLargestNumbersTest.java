package com.rohit.learnings.Java.Algorithms.binarysearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindThreeLargestNumbersTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{10, 10, 10};
        int[] actual = FindThreeLargestNumbers.find(input);
        Assertions.assertThat(actual).isEqualTo(input);
    }

    @Test
    public void testcase2() {
        int[] input = new int[]{12, 10, 12};
        int[] expected = new int[]{10, 12, 12};
        int[] actual = FindThreeLargestNumbers.find(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {
        int[] input = new int[]{10, 5, 9, 10, 12};
        int[] expected = new int[]{10, 10, 12};
        int[] actual = FindThreeLargestNumbers.find(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {
        int[] input = new int[]{141, 560, -2, -98, 7, 12};
        int[] expected = new int[]{12, 141, 560};
        int[] actual = FindThreeLargestNumbers.find(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {
        int[] input = new int[]{55, 43, 11, 3, -3, 10};
        int[] expected = new int[]{11, 43, 55};
        int[] actual = FindThreeLargestNumbers.find(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }


}
