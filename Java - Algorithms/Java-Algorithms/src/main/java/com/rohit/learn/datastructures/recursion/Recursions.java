package com.rohit.learn.datastructures.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recursions {

    public static int productSum(List<Object> array) {
        return productSumHelper(array, 1);
    }

    private static int productSumHelper(List<Object> array, int depth) {
        int sum = 0;
        for (Object o : array) {
            if (o instanceof ArrayList) {
                ArrayList<Object> internalArray = (ArrayList<Object>) o;
                sum += productSumHelper(internalArray, depth + 1);
            } else {
                sum += (int) o;
            }
        }
        return sum * depth;
    }

    public static int fibonacciSeries(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static int fibonacciSeriesOpt(int n) {
        HashMap<Integer, Integer> compute = new HashMap<>();
        compute.put(1, 0);
        compute.put(2, 1);
        if (!compute.containsKey(n)) {
            compute.put(n, fibonacciSeriesOpt(n - 1) + fibonacciSeriesOpt(n - 2));
        }
        return compute.get(n);
    }

    public static int fibonacciSeriesOptAdvanced(int n) {
        int[] lastTwo = new int[]{0, 1};
        int count = 3;
        if (count >= n) {
            int combined = lastTwo[1] + lastTwo[0];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = combined;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    public static List<List<Integer>> powerSet(List<Integer> array) {
        return powerSetHelper(array, array.size() - 1);
    }

    private static List<List<Integer>> powerSetHelper(List<Integer> array, int index) {
        if (index < 0) {
            List<List<Integer>> subsets = new ArrayList<>();
            subsets.add(new ArrayList<>());
            return subsets;
        }
        int element = array.get(index);
        List<List<Integer>> powerSets = powerSetHelper(array, index - 1);
        int length = powerSets.size();
        for (int i = 0; i < length; i++) {
            List<Integer> current = new ArrayList<>(powerSets.get(i));
            current.add(element);
            powerSets.add(current);
        }
        return powerSets;
    }
}
