package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonConstructibleChangeTest {

    @Test
    public void testcase1_emptyInputList() {
        int changeExpected = 1;
        int actualChange = NonConstructibleChange.getChange(new int[0]);
        Assertions.assertThat(actualChange).isEqualTo(changeExpected);
    }

    @Test
    public void testcase2_sortedInput() {
        int changeExpected = 4;
        int actualChange = NonConstructibleChange.getChange(new int[]{1, 2, 5});
        Assertions.assertThat(actualChange).isEqualTo(changeExpected);
    }

    @Test
    public void testcase3_unsortedInput() {
        int changeExpected = 20;
        int actualChange = NonConstructibleChange.getChange(
                new int[]{5, 7, 1, 1, 2, 3, 22});
        Assertions.assertThat(actualChange).isEqualTo(changeExpected);
    }

    @Test
    public void testcase4_sameCoinsInTheInput() {
        int changeExpected = 6;
        int actualChange = NonConstructibleChange.getChange(
                new int[]{1, 1, 1, 1, 1});
        Assertions.assertThat(actualChange).isEqualTo(changeExpected);
    }

}
