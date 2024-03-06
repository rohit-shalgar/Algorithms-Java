package com.rohit.learn.ds.arrays;


import com.rohit.learn.datastructures.arrays.smallestAbsoluteDiff.SmallestAbsDiff;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestAbsDiffTest {
    @Test
    public void smallestDiffTest() {
        var expected = new int[]{28, 26};
        var actual = SmallestAbsDiff.smallestDiffOptm(
                new int[]{-1, 5, 10, 20, 28, 3},
                new int[]{26, 134, 135, 15, 17}
        );
        Assertions.assertEquals(expected[0], actual[0]);
        Assertions.assertEquals(expected[1], actual[1]);
    }
}
