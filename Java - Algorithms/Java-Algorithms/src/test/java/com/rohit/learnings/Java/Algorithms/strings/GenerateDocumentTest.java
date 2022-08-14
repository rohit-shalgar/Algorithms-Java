package com.rohit.learnings.Java.Algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateDocumentTest {

    @Test
    public void testcase1_emptyString() {
        final String characters = "abc";
        final String documentToBeGenerated = "";
        final boolean expectedResult = true;
        final boolean actual = GenerateDocument.documentCanBeGenerated(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }

    @Test
    public void testcase2_withSomeLongString() {
        final String characters = "Bste!hetsi ogEAxpelrt x ";
        final String documentToBeGenerated = "AlgoExpert is the Best!";
        final boolean expectedResult = true;
        final boolean actual = GenerateDocument.documentCanBeGenerated(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }

    @Test
    public void testcase3_negativeScenario() {
        final String characters = "abcabc";
        final String documentToBeGenerated = "aabbccc";
        final boolean expectedResult = false;
        final boolean actual = GenerateDocument.documentCanBeGenerated(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }

    @Test
    public void testcase4_negativeScenario2_characterIsNotThere() {
        final String characters = "a";
        final String documentToBeGenerated = "A";
        final boolean expectedResult = false;
        final boolean actual = GenerateDocument.documentCanBeGenerated(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }

    @Test
    public void testcase5_negativeScenario2_characterIsNotThereBF() {
        final String characters = "a";
        final String documentToBeGenerated = "A";
        final boolean expectedResult = false;
        final boolean actual = GenerateDocument.documentCanBeGeneratedBF(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }

    @Test
    public void testcase5_negativeScenario2_characterIsNotThereOptimized() {
        final String characters = "a";
        final String documentToBeGenerated = "A";
        final boolean expectedResult = false;
        final boolean actual = GenerateDocument.documentCanBeGeneratedOptimized(
                characters, documentToBeGenerated
        );

        Assertions.assertThat(actual).isEqualTo(expectedResult);
    }
}
