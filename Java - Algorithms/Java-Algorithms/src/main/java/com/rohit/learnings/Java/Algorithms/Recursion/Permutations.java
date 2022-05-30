/*
    Create all the possible permutations of the given input array -
    [1,2,3] = [123],[132],[213],[231],[312],[321]
 */

package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> getPermutations(List<Integer> input) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutationsHelper(input,new ArrayList<>(),permutations);
        return permutations;
    }

    private static void getPermutationsHelper(
            List<Integer> input, List<Integer> currentPermutation, List<List<Integer>> permutations)
    {
        if(input.size() == 0 && currentPermutation.size() > 0){
            permutations.add(currentPermutation);
        }
        else {
            for(int i = 0; i < input.size();i++){
                List<Integer> newArray = new ArrayList<>(input);
                newArray.remove(i);
                List<Integer>permutation = new ArrayList<>(currentPermutation);
                permutation.add(input.get(i));
                getPermutationsHelper(newArray,permutation,permutations);
            }

        }
    }
}
