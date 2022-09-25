package com.rohit.learnings.Java.Algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOfProductsTest {

    @Test
    public void testcase1() {
        var expected = new int[]{8, 40, 10, 20};
        var input = new int[]{5, 1, 4, 2};
        var actual = ArrayOfProducts.arrayOfProducts(input);
        checkIfActualValuesIsAsExpected(actual, expected);
    }

    @Test
    public void testcase2() {
        var expected = new int[]{8, 40, 10, 20};
        var input = new int[]{5, 1, 4, 2};
        var actual = ArrayOfProducts.arrayOfProductsOpt(input);
        checkIfActualValuesIsAsExpected(actual, expected);
    }
    private void checkIfActualValuesIsAsExpected(int[] actual, int[] expected) {
        Assertions.assertFalse(actual.length != expected.length);
        for (int i = 0; i < actual.length; i++) {
            Assertions.assertFalse(expected[i] != actual[i]);
        }
    }
}
