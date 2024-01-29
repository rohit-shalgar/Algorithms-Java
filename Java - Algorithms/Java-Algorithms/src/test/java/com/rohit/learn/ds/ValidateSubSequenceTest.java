package com.rohit.learn.ds;

import java.util.*;

import com.rohit.learn.datastructures.arrays.arraysubsequence.ValidateSubSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProgramTest {
    @Test
    public void TestCase1() {
        var validate = new ValidateSubSequence();
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        Assertions.assertEquals(true, validate.validateSequence(array, sequence));
    }
}

