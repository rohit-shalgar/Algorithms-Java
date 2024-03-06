package com.rohit.learn.ds.arrays;

import com.rohit.learn.datastructures.arrays.threeNumberSum.ThreeNumberSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ThreeNumberSumTest {

    @Test
    public void threeNumbersSumTest() {
        var expected = List.of(new Integer[]{-8, 2, 6},
                new Integer[]{-8, 3, 5}, new Integer[]{-6, 1, 5});
        var actual = new ThreeNumberSum().threeNumberSumOpt(
                new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
        Assertions.assertTrue(compare(expected, actual));
    }

    private boolean compare(List<Integer[]> expected, List<Integer[]> actual) {
        System.out.println(actual.size());
        if (expected.size() != actual.size()) return false;
        return true;
    }
}
