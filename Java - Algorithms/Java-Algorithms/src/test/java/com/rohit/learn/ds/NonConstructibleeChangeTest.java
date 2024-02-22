package com.rohit.learn.ds;

import com.rohit.learn.datastructures.arrays.nonconstructiblechange.NonConstrubleeChange;
import com.rohit.learnings.Java.Algorithms.arrays.NonConstructibleChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonConstructibleeChangeTest {
    @Test
    public void nonConstrutable() {
        int[] input = new int[]{5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        int actual = new NonConstrubleeChange().construct(input);
        Assertions.assertEquals(expected, actual);
    }
}
