/*
    Based on the values of the map calculate all the possible phone numbers from
    the given input string.
    ex - 19 - ["1w","1x","1y","1z"]
 */

package com.rohit.learnings.Java.Algorithms.Recursion;

import java.util.*;

public class PhoneNumberCalculator {

    private static final Map<Character, String[]> PHONE_NUMBERS_DATA = new HashMap<>();

    static {
        PHONE_NUMBERS_DATA.put('0', new String[]{"0"});
        PHONE_NUMBERS_DATA.put('1', new String[]{"1"});
        PHONE_NUMBERS_DATA.put('2', new String[]{"A", "B", "C"});
        PHONE_NUMBERS_DATA.put('3', new String[]{"D", "E", "F"});
        PHONE_NUMBERS_DATA.put('4', new String[]{"G", "H", "I"});
        PHONE_NUMBERS_DATA.put('5', new String[]{"J", "K", "L"});
        PHONE_NUMBERS_DATA.put('6', new String[]{"M", "N", "O"});
        PHONE_NUMBERS_DATA.put('7', new String[]{"P", "Q", "R", "S"});
        PHONE_NUMBERS_DATA.put('8', new String[]{"T", "U", "V"});
        PHONE_NUMBERS_DATA.put('9', new String[]{"W", "X", "Y", "Z"});
    }

    public static List<String> getPhoneNumbers(String input) {
        List<String> phoneNumbers = new ArrayList<>();
        int inputLength = input.length();
        String[] currentPhoneNumber = new String[inputLength];
        Arrays.fill(currentPhoneNumber, "0");
        getPhoneNumbersHelper(0, input, currentPhoneNumber, phoneNumbers);

        return phoneNumbers;
    }

    private static void getPhoneNumbersHelper(int currentIndex, String input, String[] currentPhoneNumber, List<String> phoneNumbers) {
        if(currentIndex == input.length()){
            String finalPhoneNumber = String.join("",currentPhoneNumber);
            phoneNumbers.add(finalPhoneNumber);
        }
        else {
            char currentCharacter = input.charAt(currentIndex);
            String[] phone_numbers = PHONE_NUMBERS_DATA.get(currentCharacter);
            for(String letter: phone_numbers){
                currentPhoneNumber[currentIndex] = letter;
                getPhoneNumbersHelper(currentIndex+1,input,currentPhoneNumber,phoneNumbers);
            }
        }
    }
}
