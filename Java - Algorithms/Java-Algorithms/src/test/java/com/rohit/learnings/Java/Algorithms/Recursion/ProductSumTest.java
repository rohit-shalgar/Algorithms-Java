package com.rohit.learnings.Java.Algorithms.Recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSumTest {

    @Test
    public void TestCase1() {
        List<Object> test =
                new ArrayList<>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        Assertions.assertThat(ProductSum.getProductSum(test)).isEqualTo(12);
    }
}
