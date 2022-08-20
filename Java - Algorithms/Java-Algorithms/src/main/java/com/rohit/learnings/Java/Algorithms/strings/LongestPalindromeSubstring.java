package com.rohit.learnings.Java.Algorithms.strings;

public class LongestPalindromeSubstring {

    public static String getLongestPalindromeOpt(String str) {
        int[] currentLongest = new int[]{0, 1};
        for (int i = 1; i < str.length(); i++) {
            int[] oddLengthPalindrome = getLongestPossiblePalindrome(str, i - 1, i + 1);
            int[] evenLengthPalindrome = getLongestPossiblePalindrome(str, i - 1, i);
            int[] possibleCurrentLongest = getCurrentLongestPossible(oddLengthPalindrome,
                    evenLengthPalindrome);
            currentLongest = getCurrentLongestPossible(possibleCurrentLongest, currentLongest);
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    private static int[] getCurrentLongestPossible(
            int[] leftPalindromeArray,
            int[] rightPalindromeArray) {
        return leftPalindromeArray[1] - leftPalindromeArray[0] >
                rightPalindromeArray[1] - rightPalindromeArray[0] ?
                leftPalindromeArray : rightPalindromeArray;
    }

    private static int[] getLongestPossiblePalindrome(
            String str,
            int leftIndx,
            int rightIndx) {
        while (leftIndx >= 0 && rightIndx < str.length()) {
            if (str.charAt(leftIndx) != str.charAt(rightIndx)) {
                break;
            }
            leftIndx--;
            rightIndx++;
        }
        return new int[]{leftIndx + 1, rightIndx};
    }


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
