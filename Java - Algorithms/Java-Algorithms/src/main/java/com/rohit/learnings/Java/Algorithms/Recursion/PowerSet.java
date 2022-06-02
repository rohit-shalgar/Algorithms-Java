/*
    GIVEN AN INPUT ARRAY OF INTEGERS - [1,2,3]
    the function should return output as - [[],[1],[1,2],[2],[3],[2,3],[1,2,3],[1,3]]
    2^n * n
 */

package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> getPowerSetsIterative(List<Integer> input) {
        List<List<Integer>> powerSets = new ArrayList<>();
        List<Integer> emptyPowerSet = new ArrayList<>();
        powerSets.add(emptyPowerSet);
        for (Integer number : input) {
            int existingPowerSetsLength = powerSets.size();
            for (int i = 0; i < existingPowerSetsLength; i++) {
                List<Integer> existingPowerSet = new ArrayList<>(powerSets.get(i));
                existingPowerSet.add(number);
                powerSets.add(existingPowerSet);
            }

        }
        return powerSets;
    }

    public static List<List<Integer>> getPowerSetsRecursive(List<Integer> input) {
        return getPowerSetsRecursiveHelper(input, input.size() - 1);
    }

    private static List<List<Integer>> getPowerSetsRecursiveHelper(List<Integer> input, int index) {
        if (index < 0) {
            List<List<Integer>> powerSets = new ArrayList<>();
            List<Integer> emptyPowerSet = new ArrayList<>();
            powerSets.add(emptyPowerSet);
            return powerSets;
        }
        int currentElement = input.get(index);
        List<List<Integer>> powerSets = getPowerSetsRecursiveHelper(input, index - 1);
        int powerSetsLength = powerSets.size();
        for (int i = 0; i < powerSetsLength; i++) {
            List<Integer> powerSet = new ArrayList<>(powerSets.get(i));
            powerSet.add(currentElement);
            powerSets.add(powerSet);
        }
        return powerSets;
    }

}
