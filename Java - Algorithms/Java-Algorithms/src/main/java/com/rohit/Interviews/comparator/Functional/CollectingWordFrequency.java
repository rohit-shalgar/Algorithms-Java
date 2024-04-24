package com.rohit.Interviews.comparator.Functional;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingWordFrequency {
    //Collect the word frequency count in an given string
    public static Map<String, Integer> getEachWordCount() {

        String str = "orem Ipsum is simply \n" +
                "    Ipsum Lorem not simply Ipsum";

        return Stream.of(str)
                .map(s -> s.split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toMap(String::toString, s -> 1, Integer::sum));

    }

    public static void main(String[] args) {
        System.out.println(getEachWordCount().keySet());
    }
}

