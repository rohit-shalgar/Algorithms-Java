package com.rohit.learnings.Java.Algorithms.strings;

public class StringEncryptor {
    public static String encryptString(String input, int key) {
        char[] encrypted = new char[input.length()];
        int internalKey = key % 26;
        for (int i = 0; i < encrypted.length; i++) {
            encrypted[i] = getEncryptedCharacter(input.charAt(i), internalKey);
        }
        return new String(encrypted);
    }

    private static char getEncryptedCharacter(
            char nonEncryptedChar,
            int internalKey
    ) {
        int newLetterCode = nonEncryptedChar + internalKey;
        return (char) (newLetterCode > 122 ?
                96 + newLetterCode % 122 : newLetterCode);
    }
}
