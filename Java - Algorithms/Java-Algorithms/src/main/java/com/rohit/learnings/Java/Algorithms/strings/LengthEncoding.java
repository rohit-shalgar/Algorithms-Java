package com.rohit.learnings.Java.Algorithms.strings;

public class LengthEncoding {
    public static String getEncodedString(String input) {
        StringBuilder encodedStringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            char previousCharacter = input.charAt(i - 1);
            if (currentCharacter != previousCharacter
                    || count == 9) {
                encodedStringBuilder.append(count);
                encodedStringBuilder.append(previousCharacter);
                count = 0;
            }
            count += 1;
        }
        encodedStringBuilder.append(count);
        encodedStringBuilder.append(input.charAt(input.length() - 1));
        return encodedStringBuilder.toString();
    }
}
