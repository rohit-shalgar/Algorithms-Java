package com.rohit.functionalCodeTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    public void queries() {
        var strings = List.of("ab", "ab", "abc");
        var queries = List.of("ab", "abc", "bac");
        var expected = List.of(2, 1, 0);
        var results = new ArrayList<>();
        queries.forEach(q ->
                {
                    long count = strings.stream().filter(s -> s.equals(q)).count();
                    results.add((int) count);
                }

        );
        for (int i = 0; i < 3; i++) {
            Assertions.assertEquals(results.get(i), expected.get(i));
        }
    }
}
