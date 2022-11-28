package com.rohit.learnings.Java.Algorithms.binarysearch;

import com.rohit.learnings.Java.Algorithms.binarysearch.BinarySearchIterative;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchIterativeTest {

    @Test
    public void testcase1_elementIsFound() {
        int expectedIndex = 3;
        int[] input = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        int actualIndex = BinarySearchIterative.binarySearch(input, target);

        Assertions.assertThat(actualIndex).isEqualTo(expectedIndex);
    }

    @Test
    public void testcase2_elementIsNotFound() {
        int expectedIndex = -1;
        int[] input = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 74;
        int actualIndex = BinarySearchIterative.binarySearch(input, target);

        Assertions.assertThat(actualIndex).isEqualTo(expectedIndex);
    }

    @Test
    public void testcase3_elementIsFoundAtTheFirstAppearence() {
        int expectedIndex = 4;
        int[] input = new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 45;
        int actualIndex = BinarySearchIterative.binarySearch(input, target);

        Assertions.assertThat(actualIndex).isEqualTo(expectedIndex);
    }
}
