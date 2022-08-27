package com.rohit.learnings.Java.Algorithms.binarysearch;

public class FindThreeLargestNumbers {

    public static int[] find(int[] input) {
        int[] threeLargestNumbers = new int[]{
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        };
        for (int num : input) {
            if (num > threeLargestNumbers[2]) shiftAndUpdate(threeLargestNumbers, num, 2);
            else if (num > threeLargestNumbers[1]) shiftAndUpdate(threeLargestNumbers, num, 1);
            else if (num > threeLargestNumbers[0]) shiftAndUpdate(threeLargestNumbers, num, 0);
        }
        return threeLargestNumbers;
    }

    private static void shiftAndUpdate(int[] threeLargestNumbers, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                threeLargestNumbers[i] = num;
            } else {
                threeLargestNumbers[i] = threeLargestNumbers[i + 1];
            }
        }
    }
}
