package com.rohit.learnings.Java.Algorithms.strings;

public class LongestPalindromeSubstring {
    public static String getLongestPlaindrome(String input) {
        if (input.length() == 1) return input;
        String palindrome = "";
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)
                        && isPalindrome(input.substring(i, j + 1))) {
                    int newPalindromeLength = j - i + 1;
                    if (newPalindromeLength > palindrome.length()) {
                        palindrome = input.substring(i, j + 1);
                    }
                }
            }
        }
        return palindrome;
    }

    private static boolean isPalindrome(String substring) {
        int i = 0, j = substring.length() - 1;
        while (i <= j) {
            if (substring.charAt(i) != substring.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
