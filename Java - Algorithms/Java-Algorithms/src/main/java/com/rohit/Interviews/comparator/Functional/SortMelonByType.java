package com.rohit.Interviews.comparator.Functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortMelonByType {

    Function<List<Melon>, String> melonSorterByType =
            melons ->
                    melons.stream().map(Melon::getType)
                            .sorted()
                            .collect(Collectors.joining(",", "Melons are -", ""));

    public static void main(String[] args) {
        var melons = List.of(
                new Melon("Musk", 200),
                new Melon("Heavy", 2000)
        );
        var sorter = new SortMelonByType();
        int[] ints = new int[]{1, 2, 3, 4, 5};

        melons.stream().map(Melon::getWeight).reduce(Integer::max);
        melons.stream().max(Comparator.comparingInt(Melon::getWeight));




        Arrays.stream(ints).reduce(0, Integer::sum);//max , min etc in int array
        melons.stream().max(Comparator.comparingInt(Melon::getWeight));//One melon with max weight
        System.out.println(sorter.melonSorterByType.apply(melons));
    }
}

