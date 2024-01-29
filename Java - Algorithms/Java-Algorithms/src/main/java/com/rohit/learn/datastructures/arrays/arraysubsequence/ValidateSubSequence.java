package com.rohit.learn.datastructures.arrays.arraysubsequence;

import java.util.List;

public class ValidateSubSequence {
    public boolean validateSequence(List<Integer> array, List<Integer> subSequence) {
        int count = 0;
        int index = 0;
        for (int i : subSequence) {
            while (index < array.size()) {
                int currentArrayElement = array.get(index);
                index++;
                if (currentArrayElement == i) {
                    count++;
                    break;
                }
            }
        }
        return count == subSequence.size();
    }
}
