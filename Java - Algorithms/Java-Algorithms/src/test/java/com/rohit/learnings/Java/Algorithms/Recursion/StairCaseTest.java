package com.rohit.learnings.Java.Algorithms.Recursion;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StairCaseTest {

    @Test
    public void testcase1_StairCaseTraversal() {
        StairCase stairCase = new StairCase(4, 2);
        Assertions.assertThat(stairCase.noOfWaysToTop()).isEqualTo(5);
    }

    @Test
    public void testcase2_StairCaseTraversalOptimized() {
        StairCase stairCase = new StairCase(4, 2);
        int possibleNumberOfWays = stairCase.noOfWaysToTopOptimized();
        Assertions.assertThat(possibleNumberOfWays).isEqualTo(5);
    }
}
