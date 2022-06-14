package com.rohit.learnings.Java.Algorithms.strings;

import java.util.*;

public class Anagram {

    private final String array1;
    private final String array2;
    private final int[] characterOccurrences;

    public Anagram(String arr1, String arr2) {
        this.array1 = arr1;
        this.array2 = arr2;
        characterOccurrences = new int[26];
    }


    public boolean isValidAnagram() {
        if (array1.length() != array2.length()) {
            return false;
        }
        setCharacterOccurrenceValues(characterOccurrences, array1, array2);
        return checkForAnagrams();
    }

    public static List<Integer> getAllAnagrams(String input, String subString) {
        List<Integer> anagrams = new ArrayList<>();
        int lengthOfAnagram = subString.length();
        for (int i = 0; i <= input.length() - lengthOfAnagram; i++) {
            int[] characters = new int[26];
            String sliced = input.substring(i, i + lengthOfAnagram);
            setCharacterOccurrenceValues(characters, sliced, subString);
            if (checkForAnagrams(characters)) {
                anagrams.add(i);
            }
        }
        return anagrams;
    }

    private static void setCharacterOccurrenceValues(int[] characterOccurrences,
                                                     String inputArray1, String inputArray2) {
        for (int i = 0; i < inputArray1.length(); i++) {
            final char c1 = inputArray1.charAt(i);
            final char c2 = inputArray2.charAt(i);
            characterOccurrences[c1 - 'a']++;
            characterOccurrences[c2 - 'a']--;
        }
    }

    private boolean checkForAnagrams() {
        for (int i = 0; i < 26; i++) {
            if (characterOccurrences[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkForAnagrams(int[] characterOccurrences) {
        for (int i = 0; i < 26; i++) {
            if (characterOccurrences[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(List<String> anagrams) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> computeAnagramPairs = new HashMap<>();
        for (String possibleAnagram : anagrams) {
            char[] sortedPossibleAnagram = possibleAnagram.toCharArray();
            Arrays.sort(sortedPossibleAnagram);
            String anagram = String.valueOf(sortedPossibleAnagram);
            if (computeAnagramPairs.containsKey(anagram)) {
                computeAnagramPairs.get(anagram).add(possibleAnagram);
            } else {
                computeAnagramPairs.put(anagram, new ArrayList<>(Collections.singleton(possibleAnagram)));
            }
        }
        for (Map.Entry<String, List<String>> entry : computeAnagramPairs.entrySet()) {
            groupedAnagrams.add(entry.getValue());
        }
        return groupedAnagrams;
    }

}
