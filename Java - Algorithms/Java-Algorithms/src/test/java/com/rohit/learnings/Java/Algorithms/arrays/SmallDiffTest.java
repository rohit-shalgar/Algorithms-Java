package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallDiffTest {

    @Test
    public void testCase1() {
        int[] expected = {28, 26};
        int[] actual = SmallestDifference.smallestDifference(
                new int[]{-1, 5, 10, 20, 28, 3},
                new int[]{26, 134, 135, 15, 17}
        );
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
