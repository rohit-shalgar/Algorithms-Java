package com.rohit.learnings.Java.Algorithms.arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] difference = new int[]{0, 0};
        int closest = Integer.MAX_VALUE;
        for (int ele1 : arrayOne) {
            for (int ele2 : arrayTwo) {
                int diff = Math.abs(ele1 - ele2);
                if (diff < closest) {
                    closest = diff;
                    difference[0] = ele1;
                    difference[1] = ele2;
                }
            }
        }
        return difference;
    }
}
