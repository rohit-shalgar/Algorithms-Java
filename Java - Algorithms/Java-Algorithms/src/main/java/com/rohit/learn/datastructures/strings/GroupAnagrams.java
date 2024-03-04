package com.rohit.learn.datastructures.strings;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> compute = new HashMap<>();
        for (String word : words) {
            char[] key = word.toCharArray();
            Arrays.sort(key);
            String sortedMapkey = String.valueOf(key);
            if (!compute.containsKey(sortedMapkey)) {
                compute.put(sortedMapkey, new ArrayList<String>());
            }
            compute.get(sortedMapkey).add(word);
        }
        return new ArrayList<>(compute.values());
    }

    public static List<List<String>> groupAnagramsOptm(List<String> words) {
        Map<String, List<String>> compute = new HashMap<>();
        int[] keyBuilder = new int[26];
        for (String word : words) {
            Arrays.fill(keyBuilder, 0);
            for (Character c : word.toCharArray()) {
                keyBuilder[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i : keyBuilder) {
                key.append("X");
                key.append(i);
            }
            String sortedMapkey = String.valueOf(key);
            if (!compute.containsKey(sortedMapkey)) {
                compute.put(sortedMapkey, new ArrayList<String>());
            }
            compute.get(sortedMapkey).add(word);
        }
        return new ArrayList<>(compute.values());
    }
}
