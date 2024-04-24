package com.rohit.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingProblems {
    //Reverse string in java without using reverse() function
    public static String reverseString(String input) {
        int length = input.length();
        char[] reversedChars = new char[length];
        int charArrIndex = 0;
        int index = length - 1;
        while (index >= 0 && charArrIndex < length) {
            reversedChars[charArrIndex] = input.charAt(index);
            charArrIndex++;
            index--;
        }
        return new String(reversedChars);
    }

    //swap two numbers without using third one
    public static int[] swap(int[] input) {
        input[1] = input[1] + input[0];
        input[0] = input[1] - input[0];
        input[1] = input[1] - input[0];
        return input;
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou]*.");
    }

    public static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        if (input == 3 || input == 2) {
            return true;
        }
        if (input % 2 == 0 || input % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= input / 5; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    public static int fibonacci(int input) {
        HashMap<Integer, Integer> compute = new HashMap<>();
        compute.put(0, 0);
        compute.put(1, 1);
        if (!compute.containsKey(input)) {
            compute.put(input, fibonacci(input - 2) + fibonacci(input - 1));
        }
        return compute.get(input);
    }

    public static int fibonacci2(int input) {
        int[] lastTwo = new int[]{0, 1};
        int counter = 3;
        while (counter >= input) {
            int last = lastTwo[1] + lastTwo[0];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = last;
            counter++;
        }
        return input > 1 ? lastTwo[1] : lastTwo[0];
    }

    public static boolean containsOdd(List<Integer> input) {
        return input.parallelStream()
                .noneMatch(x -> x % 2 == 0);
    }

    public static int reverseInt(int input) {
        int result = 0;
        while (input > 0) {
            int remainder = input % 10;
            result = result * 10 + remainder;
            input = input / 10;

        }
        return result;
    }

    public static int stringToInt(String input) {
        int length = input.length();
        if (length == 0) return 0;
        int result = 0;
        boolean isNegative = false;
        int index = 0;
        if (input.charAt(0) == '-') {
            isNegative = true;
            index = 1;
        }
        while (index < length) {
            int value = input.charAt(index) - '0';
            result = result * 10 + value;
            index++;
        }
        if (isNegative) {
            result = -result;
        }
        return result;
    }

    public static String intToString(int input) {
        if (input == 0) return "0";
        StringBuilder stringBuilder = new StringBuilder();
        boolean isNegative = input < 0;
        int absInput = Math.abs(input);
        while (absInput > 1) {
            int value = absInput % 10;
            stringBuilder.append((char) value + '0');
            absInput = absInput / 10;
        }
        return stringBuilder.reverse().toString();
    }
}
