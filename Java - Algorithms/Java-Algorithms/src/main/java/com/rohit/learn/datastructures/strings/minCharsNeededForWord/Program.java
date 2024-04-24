package com.rohit.learn.datastructures.strings.minCharsNeededForWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public char[] minimumCharactersForWords(String[] words) {
        HashMap<Character, Integer> maxFrequency = new HashMap<>();
        for (String word : words) {
            HashMap<Character, Integer> chars = new HashMap<>();
            for (char c : word.toCharArray()) {
                chars.put(c, chars.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();
                if (maxFrequency.containsKey(key)) {
                    maxFrequency.put(key, Math.max(value, maxFrequency.get(key)));
                }
                maxFrequency.put(key, value);
            }
        }
        return minCharsNeeded(maxFrequency);
    }

    private char[] minCharsNeeded(HashMap<Character, Integer> maxFrequency) {
        ArrayList<Character> resultList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : maxFrequency.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            while (value > 0) {
                resultList.add(key);
                value--;
            }
        }
        char[] minChars = new char[resultList.size()];
        for (int i = 0; i < minChars.length; i++) {
            minChars[i] = resultList.get(i);
            System.out.println(minChars[i]);
        }
        return minChars;
    }
}
