package com.rohit.learn.datastructures.recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class PermutationsProgram {
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        return getPermutationsHelper(array, new ArrayList<>(), permutations);
    }

    private static List<List<Integer>> getPermutationsHelper(List<Integer> originalArray,
                                                             ArrayList<Integer> currentPermutation,
                                                             List<List<Integer>> permutations) {
        if (originalArray.isEmpty() && !currentPermutation.isEmpty()) {
            permutations.add(currentPermutation);
        } else {
            for (int i = 0; i < originalArray.size(); i++) {
                List<Integer> originalArrayUpdated = new ArrayList<>(originalArray);
                ArrayList<Integer> currentPermutationUpdated = new ArrayList<>(currentPermutation);
                currentPermutationUpdated.add(originalArray.get(i));
                originalArrayUpdated.remove(i);
                getPermutationsHelper(originalArrayUpdated, currentPermutationUpdated, permutations);
            }
        }
        return permutations;
    }
}
