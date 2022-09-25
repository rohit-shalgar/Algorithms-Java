package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPeakTest {

    @Test
    public void testCase1() {
        var input = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        var expected = 6;
        var actual = LongestPeak.longestPeak(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
