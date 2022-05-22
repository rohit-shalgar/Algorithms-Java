package com.rohit.learnings.Java.Algorithms.Recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {


    @Test
    public void testFibonacci(){

        Assertions.assertThat(377).isEqualTo(Fibonacci.getNthFibNormal(15));
        Assertions.assertThat(1).isNotEqualTo(Fibonacci.getNthFibNormal(1));
        Assertions.assertThat(377).isEqualTo(Fibonacci.getNthFib(15));
        Assertions.assertThat(1).isNotEqualTo(Fibonacci.getNthFib(1));
        Assertions.assertThat(377).isEqualTo(Fibonacci.getNthFibIterative(15));
        Assertions.assertThat(1).isNotEqualTo(Fibonacci.getNthFibIterative(1));

    }

}
