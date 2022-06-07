package com.rohit.learnings.Java.Algorithms.Recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PhoneNumberCalculatorTest {

    @Test
    public void testCase1_getPhoneNumbers(){
        List<String> phoneNumbers = PhoneNumberCalculator.getPhoneNumbers("1905");
        Assertions.assertThat(phoneNumbers.size()).isEqualTo(12);
        Assertions.assertThat(phoneNumbers.contains("1W0J")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1X0J")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Y0J")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Z0J")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1W0K")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1X0K")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Y0K")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Z0K")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1W0L")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1X0L")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Y0L")).isTrue();
        Assertions.assertThat(phoneNumbers.contains("1Z0L")).isTrue();


    }
}
