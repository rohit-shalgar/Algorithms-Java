package com.rohit.learnings.Java.Algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringEncryptorTest {

    @Test
    public void testcase1_encryptor() {
        String actual = StringEncryptor.encryptString("xyz", 2);
        Assertions.assertThat(actual).isEqualTo("zab");
    }

    @Test
    public void testcase2_encryptor_with_really_high_key() {
        String actual = StringEncryptor.encryptString("abc", 52);
        Assertions.assertThat(actual).isEqualTo("abc");
    }
}
