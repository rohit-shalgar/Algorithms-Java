package com.rohit.learnings.Java.Algorithms.arrays;

public class SubsequenceValidation {
    public static boolean isValidSequence(int[] array, int[] subsequence) {
        int i = 0;
        int count = 0;
        for (int element : subsequence) {
            for (; i < array.length; i++) {
                if (element == array[i]) {
                    count += 1;
                    i++;
                    break;
                }
            }
        }
        return count == subsequence.length;
    }


    public static boolean isValidSequenceOptimized(int[] array, int[] subsequence) {
        int arrayIndex = 0, sequenceIndex = 0;
        while (arrayIndex < array.length && sequenceIndex < subsequence.length) {
            int currentArrayElement = array[arrayIndex];
            int currentSequenceElement = subsequence[sequenceIndex];
            if (isASequenceElement(currentArrayElement, currentSequenceElement)) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == subsequence.length;
    }

    private static boolean isASequenceElement(int arrayElement, int sequenceElement) {
        return arrayElement == sequenceElement;
    }
}
