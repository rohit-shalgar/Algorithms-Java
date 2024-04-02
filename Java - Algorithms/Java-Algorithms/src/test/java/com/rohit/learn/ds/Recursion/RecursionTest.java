package com.rohit.learn.ds.Recursion;

import com.rohit.learn.datastructures.recursion.Recursions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    @Test
    public void fibTest() {
        var expected = 5;
        var actual = Recursions.fibonacciSeries(6);
        var actualOpt = Recursions.fibonacciSeriesOpt(6);
        var actualOptConstantSpace = Recursions.fibonacciSeriesOpt(6);
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected, actualOpt);
        Assertions.assertEquals(expected, actualOptConstantSpace);
    }
}
