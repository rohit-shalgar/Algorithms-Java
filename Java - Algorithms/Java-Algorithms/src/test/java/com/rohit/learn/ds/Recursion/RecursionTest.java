package com.rohit.learn.ds.Recursion;

import com.rohit.learn.datastructures.recursion.Recursions;
import jdk.dynalink.linker.LinkerServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void productSumTest() {
        var expected = 12;
        List<Object> input = new ArrayList<>(Arrays.asList(
                5, 2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(Arrays.asList(6, new ArrayList<Object>(
                        Arrays.asList(-13, 8)
                ), 4)
                )));
        var actual = Recursions.productSum(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powerSetTest() {
        var input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> output = Recursions.powerSet(input);
        Assertions.assertEquals(8, output.size());
        Assertions.assertTrue(output.contains(new ArrayList<>()));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(1))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(2))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(3))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(1,2))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(1,3))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(2,3))));
        Assertions.assertTrue(output.contains(new ArrayList<>(Arrays.asList(1,2,3))));
    }
}
