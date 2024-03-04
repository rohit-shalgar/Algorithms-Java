package com.rohit.learn.ds.strings;

import com.rohit.learn.datastructures.strings.GroupAnagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void testAnagrams() {
        var input = List.of("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        var expected = List.of(
                List.of("yo", "oy"),
                List.of("flop", "olfp"),
                List.of("act", "tac", "cat"),
                List.of("foo")
        );
        var actual = GroupAnagrams.groupAnagrams(input);
        var actualOptm = GroupAnagrams.groupAnagramsOptm(input);
        for (List list : actual) {
            Assertions.assertTrue(expected.contains(list));
        }
        for (List list : actualOptm) {
            Assertions.assertTrue(expected.contains(list));
        }
    }
}
