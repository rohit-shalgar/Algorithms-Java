package com.rohit.learnings.Java.Algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramTest {

    private Anagram anagram;

    @BeforeEach
    public void setup() {
        anagram = new Anagram("anagram", "naaramg");
    }

    @Test
    public void check_if_two_strings_are_valid_anagrams() {
        Assertions.assertThat(anagram.isValidAnagram()).isTrue();
    }

    @Test
    public void invalid_anagrams_return_false() {
        anagram = new Anagram("rat", "cat");
        Assertions.assertThat(anagram.isValidAnagram()).isFalse();
    }

    @Test
    public void checkForAnagrams() {
        System.out.println(Anagram.getAllAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void TestCase1() {
        List<String> words =
                new ArrayList<String>(
                        Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
        expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
        expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
        expected.add(new ArrayList<String>(List.of("foo")));
        List<List<String>> output = Anagram.groupAnagrams(words);
        System.out.println(output);
        for (List<String> innerList : output) {
            Collections.sort(innerList);
        }
        org.junit.jupiter.api.Assertions.assertTrue(compare(expected, output));
    }

    public boolean compare(List<List<String>> expected, List<List<String>> output) {
        if (expected.size() != output.size()) return false;

        for (List<String> group : expected) {
            Collections.sort(group);
            if (!output.contains(group)) return false;
        }

        return true;
    }
}
