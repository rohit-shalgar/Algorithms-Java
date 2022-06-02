package com.rohit.learnings.Java.Algorithms.Recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PowerSetTest {

    @Test
    public void testCase1_PowerSetIterative() {
        List<Integer> inputArray = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> powerSets = PowerSet.getPowerSetsIterative(inputArray);
        Assertions.assertThat(powerSets.size()).isEqualTo(8);
        Assertions.assertThat(contains(powerSets, new int[]{})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{1})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{2})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{1, 2})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{3})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{1, 3})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{2, 3})).isTrue();
        Assertions.assertThat(contains(powerSets, new int[]{1, 2, 3})).isTrue();
    }

    private boolean contains(List<List<Integer>> powerSets, int[] testDataArray) {

        for (List<Integer> subArray : powerSets) {
            Collections.sort(subArray);
            if (compare(subArray, testDataArray)) {
                return true;
            }
        }
        return false;
    }

    private boolean compare(List<Integer> subArray, int[] testDataArray) {
        if (subArray.size() != testDataArray.length) {
            return false;
        }
        for (int i = 0; i < subArray.size(); i++) {
            if (subArray.get(i) != testDataArray[i]) {
                return false;
            }
        }
        return true;
    }
}
