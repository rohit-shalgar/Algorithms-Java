package com.rohit.learnings.Java.Algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeSubstringTest {

    @Test
    public void testcase1_getLongestPalindromeSubstring() {
        String expected = "xyzzyx";
        String input = "abaxyzzyxf";
        String actual = LongestPalindromeSubstring.getLongestPlaindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase1_getLongestPalindromeSubstringOpt() {
        String expected = "xyzzyx";
        String input = "abaxyzzyxf";
        String actual = LongestPalindromeSubstring.getLongestPalindromeOpt(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2_noPalindromeExists() {
        String expected = "";
        String input = "ab";
        String actual = LongestPalindromeSubstring.getLongestPlaindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3_singleCharacter() {
        String expected = "a";
        String input = "a";
        String actual = LongestPalindromeSubstring.getLongestPlaindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
