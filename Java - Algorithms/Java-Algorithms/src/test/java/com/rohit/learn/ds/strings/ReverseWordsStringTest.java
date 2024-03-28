package com.rohit.learn.ds.strings;

import com.rohit.learn.datastructures.strings.ReverseWords.ReverseWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsStringTest {

    @Test
    public void testReverse() {
        var expected = "best! the  is AlgoExpert";
        var actual = ReverseWords.reverseWordsInString(
                "AlgoExpert is  the best!"
        );
        Assertions.assertEquals(expected, actual);
    }
}
