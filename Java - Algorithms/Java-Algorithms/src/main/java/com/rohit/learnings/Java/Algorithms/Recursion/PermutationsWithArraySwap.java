package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithArraySwap {

    public static List<List<Integer>> getPermutations(List<Integer> inputArray) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutationsHelper(0,inputArray,permutations);
        return permutations;
    }

    private static void getPermutationsHelper(
            int index, List<Integer> currentPermutation, List<List<Integer>> permutations)
    {
        if(index == currentPermutation.size() - 1){
            permutations.add(new ArrayList<>(currentPermutation));
        }
        else {
            for(int j = index; j < currentPermutation.size();j++){
               swap(currentPermutation,index,j);
               getPermutationsHelper(index+1,currentPermutation,permutations);
               swap(currentPermutation,index,j);
            }

        }
    }

    private static void swap(List<Integer> currentPermutation, int source, int destination) {

        int temp = currentPermutation.get(source);
        currentPermutation.set(source,currentPermutation.get(destination));
        currentPermutation.set(destination,temp);

    }
}
