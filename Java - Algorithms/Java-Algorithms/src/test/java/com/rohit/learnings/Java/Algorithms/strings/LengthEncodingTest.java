package com.rohit.learnings.Java.Algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthEncodingTest {

    @Test
    public void testcase1_plain_string_input() {
        String input = "AAAAAAAAAAAAABBCCCCDD";
        String expectedEncoding = "9A4A2B4C2D";
        String actualEncodedString = LengthEncoding.getEncodedString(input);
        Assertions.assertThat(actualEncodedString).isEqualTo(expectedEncoding);
    }

    @Test
    public void testcase2_mixed_string_input() {
        String input = "aA";
        String expectedEncoding = "1a1A";
        String actualEncodedString = LengthEncoding.getEncodedString(input);
        Assertions.assertThat(actualEncodedString).isEqualTo(expectedEncoding);
    }

    @Test
    public void testcase3_same_character_string_input() {
        String input = "AAAAAAAAAAA";
        String expectedEncoding = "9A2A";
        String actualEncodedString = LengthEncoding.getEncodedString(input);
        Assertions.assertThat(actualEncodedString).isEqualTo(expectedEncoding);
    }

    @Test
    public void testcase4_numeric_characters_string_input() {
        String input = "AAA123";
        String expectedEncoding = "3A111213";
        String actualEncodedString = LengthEncoding.getEncodedString(input);
        Assertions.assertThat(actualEncodedString).isEqualTo(expectedEncoding);
    }


}
