package com.rohit.learnings.Java.Algorithms.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstDuplicateValueTest {

    @Test
    public void testCase1() {
        var input = new int[]{2, 1, 3, 2, 3, 4, 5};
        var expected = 2;
        var actual = FirstDuplicateValue.firstDuplicateValue(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var input = new int[]{2, 1, 3, 3, 2, 4, 5};
        var expected = 3;
        var actual = FirstDuplicateValue.firstDuplicateValue(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var input = new int[]{2, 1, 3, 2, 3, 4, 5};
        var expected = 2;
        var actual = FirstDuplicateValue.firstDuplicateValue(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase4() {
        var input = new int[]{2, 1, 3, 3, 2, 4, 5};
        var expected = 3;
        var actual = FirstDuplicateValue.firstDuplicateValueOpt(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase5() {
        var input = new int[]{1,1};
        var expected = 1;
        var actual = FirstDuplicateValue.firstDuplicateValueOpt(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
