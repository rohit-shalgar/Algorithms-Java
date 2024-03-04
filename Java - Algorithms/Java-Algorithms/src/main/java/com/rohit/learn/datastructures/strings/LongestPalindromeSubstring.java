package com.rohit.learn.datastructures.strings;

public class LongestPalindromeSubstring {
    public static String longestPalindrome(String string) {
        String longest = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                String substring = string.substring(i, j + 1);
                if (substring.length() > longest.length() &&
                        isPalindrome(substring)) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    public static String longestPalindromeOpt(String string) {
        int[] currentIndexes = new int[]{0, 0};
        for (int i = 1; i < string.length() - 1; i++) {
            int[] oddPalindrome = getPalindromeIndexes(string, i - 1, i + 1);
            int[] evenPalindrome = getPalindromeIndexes(string, i, i - 1);
            int[] currentLongestIndex = oddPalindrome[1] - oddPalindrome[0] >
                    evenPalindrome[1] - evenPalindrome[0] ? oddPalindrome : evenPalindrome;
            currentIndexes = currentLongestIndex[1] - currentLongestIndex[0] >
                    currentIndexes[1] - currentIndexes[0] ?
                    currentLongestIndex : currentIndexes;
        }
        return string.substring(currentIndexes[0], currentIndexes[1]);
    }

    private static int[] getPalindromeIndexes(String string, int start, int end) {
        while (start >= 0 && end < string.length()) {
            if (string.charAt(start) != string.charAt(end)) {
                break;
            }
            start--;
            end++;

        }
        return new int[]{start + 1, end};
    }

    public static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;
        while (start <= end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
