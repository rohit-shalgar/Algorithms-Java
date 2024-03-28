package com.rohit.learn.datastructures.strings.ReverseWords;

public class ReverseWords {
    public static String reverseWordsInString(String string) {
        char[] reversed = reverseString(string.toCharArray(), 0, string.length() - 1);
        int start = 0;
        while (start < reversed.length) {
            int end = start;
            while (end < reversed.length && reversed[end] != ' ') {
                end++;
            }
            reverseString(reversed, start, end - 1);
            start = end + 1;
        }
        return new String(reversed);
    }

    private static char[] reverseString(char[] string, int start, int end) {
        while (start < end) {
            char temp = string[end];
            string[end] = string[start];
            string[start] = temp;
            end--;
            start++;
        }
        return string;
    }
}
