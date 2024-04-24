package com.rohit.Interviews.comparator.Functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MelonFunctions {
    Comparator<Melon> melonComparator = (Melon m1, Melon m2) ->
            Comparator.comparing(Melon::getWeight).compare(m2, m1);

    public static void main(String[] args) {
        // var melonComparator = new MelonFunctions().melonComparator;
        Comparator<Melon> melonComparator = (Melon m1, Melon m2) ->
                Comparator.comparing(Melon::getWeight)
                        .compare(m2, m1);

        Melon melon1 = new Melon("Gac", 3000);
        Melon melon2 = new Melon("Hemi", 1600);
        Melon melon4 = new Melon("Apollo", 2000);
        Melon melon5 = new Melon("Horned", 1700);
        List<Melon> melons = Arrays.asList(melon1, melon2, melon4, melon5);

        Comparator<Melon> melonComprator = (m1, m2) -> {
            return m2.getWeight() - m1.getWeight();
        };
        List<Melon> sortedMelonsDesc = melons.stream().sorted(melonComprator).collect(Collectors.toList());
        sortedMelonsDesc.forEach(System.out::println);
    }
}
