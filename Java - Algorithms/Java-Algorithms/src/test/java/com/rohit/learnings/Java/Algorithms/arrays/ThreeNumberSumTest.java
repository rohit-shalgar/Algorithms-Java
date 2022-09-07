package com.rohit.learnings.Java.Algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSumTest {
    private boolean compare(List<Integer[]> triplets1, List<Integer[]> triplets2) {
        if (triplets1.size() != triplets2.size()) return false;
        for (int i = 0; i < triplets1.size(); i++) {
            if (!Arrays.equals(triplets1.get(i), triplets2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        List<Integer[]> expected = new ArrayList<Integer[]>();
        expected.add(new Integer[] {-8, 2, 6});
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 1, 5});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        Assertions.assertTrue(this.compare(output, expected));
    }
}
