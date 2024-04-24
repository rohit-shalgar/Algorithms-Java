package com.rohit;

import com.rohit.questions.CodingProblems;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CodingProblemsTest {
    @Test
    public void reverseString() {
        var expected = "cba";
        var actual = CodingProblems.reverseString("abc");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void swap() {
        var expected = new int[]{5, 3};
        var actual = CodingProblems.swap(new int[]{3, 5});
        Assertions.assertEquals(expected[1], actual[1]);
        Assertions.assertEquals(expected[0], actual[0]);
    }

    @Test
    public void containsVowel() {
        Assertions.assertTrue(CodingProblems.stringContainsVowels("Hello"));
    }

    @Test
    public void isPrime() {
        Assertions.assertTrue(CodingProblems.isPrime(7));
        Assertions.assertFalse(CodingProblems.isPrime(49));
    }

    @Test
    public void odds() {
        Assertions.assertFalse(CodingProblems.containsOdd(List.of(1,2,3,4)));
    }

    @Test
    public void reverseNumber(){
        Assertions.assertEquals(CodingProblems.reverseInt(153),351);
    }

}
