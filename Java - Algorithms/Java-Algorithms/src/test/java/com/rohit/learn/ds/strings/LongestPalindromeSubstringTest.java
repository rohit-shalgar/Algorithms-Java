package com.rohit.learn.ds.strings;

import com.rohit.learn.datastructures.strings.LongestPalindromeSubstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeSubstringTest {
    @Test
    public void test_palindrome_substring() {
        var expected = "xyzzyx";
        var actual = LongestPalindromeSubstring.longestPalindrome("abaxyzzyx");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_palindrome_substring_opt() {
        var expected = "xyzzyx";
        var actual = LongestPalindromeSubstring.longestPalindromeOpt("abaxyzzyx");
        Assertions.assertEquals(expected, actual);
    }
}
