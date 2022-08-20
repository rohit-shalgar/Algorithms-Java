package com.rohit.learnings.Java.Algorithms.binarysearch;

public class BinarySearchIterative {
    public static int binarySearch(int[] input, int target) {
        int left = 0;
        int right = input.length - 1;
        int middle = getMiddle(left, right);
        while (left <= right) {
            int middleElement = input[middle];
            if (middleElement == target) return middle;
            else if (middleElement > target) {
                right = middle - 1;
            } else left = middle + 1;
            middle = getMiddle(left, right);
        }
        return -1;
    }

    private static int getMiddle(int left, int right) {
        return (left + right) / 2;
    }
}
