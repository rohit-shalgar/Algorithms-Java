package com.rohit.learn.ds.strings;

import com.rohit.learn.datastructures.strings.minCharsNeededForWord.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinCharsNeededTest {
    @Test
    public void TestCase1() {
        String[] words = new String[]{"this", "that", "did", "deed", "them!", "a"};
        char[] expected =
                new char[]{'t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'};
        var actual = new Program().minimumCharactersForWords(words);
        int result = Arrays.compare(expected, actual);
        Assertions.assertTrue(result == 0);
    }
}

