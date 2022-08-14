package com.rohit.learnings.Java.Algorithms.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class GenerateDocument {
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

}
