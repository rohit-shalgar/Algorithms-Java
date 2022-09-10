package com.rohit.learnings.Java.Algorithms.arrays;

import java.util.List;

public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start = 0;
        int end = array.size() - 1;
        while (start < array.size() && end >= 0 &&
                end > start) {
            if (array.get(start) == toMove) {
                while (array.get(end) == toMove) end--;
                swap(array, start, end);
            }
            start++;
        }
        return array;
    }

    private static void swap(List<Integer> array, int start, int end) {
        int temp = array.get(start);
        array.set(start, array.get(end));
        array.set(end, temp);

    }
}
