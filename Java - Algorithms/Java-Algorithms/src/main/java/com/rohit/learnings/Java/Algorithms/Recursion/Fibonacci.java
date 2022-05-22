package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.HashMap;
import java.util.Map;

/*

Fibonacci series - 0,1,1,2,3,5,8,13
Formula for fib series - fib(3) = fib(2)+ fib(1) - fib(n) = fib(n-1)+fib(n-2)
getNthFibNormal - 2^n space - o(n)
getNthFib - o(n) as each fib is calculated only once, space - o(n)
getNthFibIterative - 0(n) space -o(1)

 */
public class Fibonacci {

    public static int getNthFibNormal(int n) {
        // Write your code here.
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getNthFibNormal(n - 1) + getNthFibNormal(n - 2);
    }

    public static int getNthFib(int n) {
        // Write your code here.
        Map<Integer, Integer> fibonacciStore = new HashMap<>();
        fibonacciStore.put(2, 1);
        fibonacciStore.put(1, 0);
        return getNthFib(n, fibonacciStore);
    }

    public static int getNthFib(int n, Map<Integer, Integer> fibonacciStore) {
        if (fibonacciStore.containsKey(n)) {
            return fibonacciStore.get(n);
        } else {
            fibonacciStore.put(n, getNthFib(n - 1, fibonacciStore) + getNthFib(n - 2, fibonacciStore));
            return fibonacciStore.get(n);
        }
    }

    public static int getNthFibIterative(int n) {
        int[] fibIntial = new int[]{0, 1};
        int counter = 3;
        while (counter <= n) {
            int temp = fibIntial[1];
            fibIntial[1] = fibIntial[0] + fibIntial[1];
            fibIntial[0] = temp;
            counter++;
        }
        return n > 1 ? fibIntial[1] : fibIntial[0];
    }
}
