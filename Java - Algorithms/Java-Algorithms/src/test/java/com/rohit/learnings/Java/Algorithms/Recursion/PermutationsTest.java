package com.rohit.learnings.Java.Algorithms.Recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTest {

    @Test
    public void TestCase1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = Permutations.getPermutations(input);
        Assertions.assertTrue(perms.size() == 6);
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(1, 2, 3))));
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(1, 3, 2))));
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(2, 1, 3))));
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(2, 3, 1))));
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(3, 1, 2))));
        Assertions.assertTrue(contains(perms, new ArrayList<>(Arrays.asList(3, 2, 1))));
    }

    public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
        for (List<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}
