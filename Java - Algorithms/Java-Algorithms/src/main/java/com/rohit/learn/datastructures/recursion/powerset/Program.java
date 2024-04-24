package com.rohit.learn.datastructures.recursion.powerset;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> powersets = new ArrayList<>();
        powersets.add(new ArrayList<>());
        for (int e : array) {
            int length = powersets.size();
            for (int i = 0; i < length; i++) {
                List<Integer> current = new ArrayList<Integer>(powersets.get(i));
                current.add(e);
                powersets.add(current);
            }
        }
        return powersets;
    }
}
