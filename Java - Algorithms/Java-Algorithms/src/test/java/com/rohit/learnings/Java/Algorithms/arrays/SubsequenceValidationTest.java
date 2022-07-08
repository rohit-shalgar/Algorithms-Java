package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubsequenceValidationTest {
    private int[] array;

    @BeforeEach
    public void setup() {
        array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
    }


    @Test
    public void testcase1_validSequence() {
        int[] subsequence = new int[]{1, 6, -1, 10};
        boolean result = SubsequenceValidation.isValidSequence(array
                , subsequence);

        isSubsequence(result);
    }

    @Test
    public void testcase2_inValidSequence() {
        int[] subsequence = new int[]{1, 10, 6};
        boolean result = SubsequenceValidation.isValidSequence(array
                , subsequence);

        isNotAValidSubsequence(result);
    }

    @Test
    public void testcase3_allSequenceElementsAreSame() {
        int[] subsequence = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        boolean result = SubsequenceValidation.isValidSequence(array
                , subsequence);

        isSubsequence(result);
    }

    @Test
    public void testcase4_onlyOneElementInTheSequence() {
        int[] subsequence = new int[]{5};
        boolean result = SubsequenceValidation.isValidSequence(array
                , subsequence);

        isSubsequence(result);
    }

    @Test
    public void testcase5_validSequence() {
        int[] subsequence = new int[]{1, 6, -1, 10};
        boolean result = SubsequenceValidation.
                isValidSequenceOptimized(array, subsequence);

        isSubsequence(result);
    }

    @Test
    public void testcase6_inValidSequence() {
        int[] subsequence = new int[]{1, 10, 6};
        boolean result = SubsequenceValidation.
                isValidSequenceOptimized(array, subsequence);

        isNotAValidSubsequence(result);
    }

    @Test
    public void testcase7_allSequenceElementsAreSame() {
        int[] subsequence = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        boolean result = SubsequenceValidation.
                isValidSequenceOptimized(array, subsequence);

        isSubsequence(result);
    }

    @Test
    public void testcase8_onlyOneElementInTheSequence() {
        int[] subsequence = new int[]{5};
        boolean result = SubsequenceValidation.
                isValidSequenceOptimized(array, subsequence);

        isSubsequence(result);
    }

    private void isSubsequence(boolean result) {
        Assertions.assertThat(result).isTrue();
    }

    private void isNotAValidSubsequence(boolean result) {
        Assertions.assertThat(result).isFalse();
    }
}
