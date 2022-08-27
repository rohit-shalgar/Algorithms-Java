package com.rohit.learnings.Java.Algorithms;

import com.rohit.learnings.Java.Algorithms.sorting.Sorting;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class sortingTest {

    @Test
    public void testcase1() {
        int[] input = new int[]{8, 5, 5, 2, 9, 10};
        int[] expected = new int[]{2, 5, 5, 8, 9, 10};
        int[] actual = Sorting.bubbleSort(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
