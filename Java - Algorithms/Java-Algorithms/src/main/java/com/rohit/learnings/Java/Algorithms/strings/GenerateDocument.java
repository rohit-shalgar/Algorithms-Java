package com.rohit.learnings.Java.Algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateDocument {

    public static boolean documentCanBeGeneratedBF
            (String characters, String documentToBeGenerated) {
        //O(m * (m+n))
        for (int i = 0; i < documentToBeGenerated.length(); i++) {
            char c = documentToBeGenerated.charAt(i);
            int charFreq = calculateCharacterFrequency(characters, c);
            int documentCharFreq = calculateCharacterFrequency(documentToBeGenerated, c);
            if (documentCharFreq > charFreq) {
                return false;
            }
        }
        return true;
    }

    private static int calculateCharacterFrequency(String characters, char c) {
        int frequency = 0;
        for (int i = 0; i < characters.length(); i++) {
            if (characters.charAt(i) == c) frequency++;
        }
        return frequency;
    }

    public static boolean documentCanBeGenerated
            (String characters, String documentToBeGenerated) {
        Map<Character, Long> characterFreq = buildCharacterMap(characters);
        Map<Character, Long> docCharFeq = buildCharacterMap(documentToBeGenerated);
        return checkIfDocumentCanBeGenerated(characterFreq, docCharFeq);
    }

    private static Map<Character, Long> buildCharacterMap(String characters) {
        return characters.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    private static boolean checkIfDocumentCanBeGenerated
            (Map<Character, Long> characterFreq, Map<Character, Long> docCharFeq) {
        for (Map.Entry<Character, Long> entry : docCharFeq.entrySet()) {
            if (!characterFreq.containsKey(entry.getKey())) {
                return false;
            }
            if (characterFreq.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean documentCanBeGeneratedOptimized
            (String characters, String documentToBeGenerated) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : documentToBeGenerated.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c : characters.toCharArray()) {
            if (!charFrequencyMap.containsKey(c) || charFrequencyMap.get(c) == 0) {
                return false;
            }
            charFrequencyMap.put(c, charFrequencyMap.get(c) - 1);
        }
        return true;
    }

}
