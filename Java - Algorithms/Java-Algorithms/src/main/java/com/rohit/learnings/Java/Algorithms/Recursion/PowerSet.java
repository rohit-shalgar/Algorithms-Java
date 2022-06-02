/*
    GIVEN AN INPUT ARRAY OF INTEGERS - [1,2,3]
    the function should return output as - [[],[1],[1,2],[2],[3],[2,3],[1,2,3],[1,3]]
    2^n * n
 */

package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> getPowerSetsIterative(List<Integer> input){
        List<List<Integer>> powerSets = new ArrayList<>();
        List<Integer> emptyPowerSet = new ArrayList<>();
        powerSets.add(emptyPowerSet);
        return getPowerSetsHelper(powerSets,input);
    }

    private static List<List<Integer>> getPowerSetsHelper(List<List<Integer>> powerSets, List<Integer> input) {
        for(Integer number:input){
            int existingPowerSetsLength = powerSets.size();
            for(int i= 0; i < existingPowerSetsLength; i++){
                List<Integer> existingPowerSet = new ArrayList<>(powerSets.get(i));
                existingPowerSet.add(number);
                powerSets.add(existingPowerSet);
            }

        }
        return powerSets;
    }
}
