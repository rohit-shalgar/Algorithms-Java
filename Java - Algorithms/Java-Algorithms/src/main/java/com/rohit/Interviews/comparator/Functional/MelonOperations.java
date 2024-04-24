package com.rohit.Interviews.comparator.Functional;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MelonOperations {

    public Integer getMaxWeightMelon(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .reduce(Integer::max)
                .orElse(-1);
    }

    public Integer getMaxWeightMelonUsingMax(List<Melon> melons) {
        return melons.stream().max(Comparator.comparingInt(Melon::getWeight)).orElse(new Melon("Empty",1)).getWeight();
    }

    public Integer totalMelonWeight(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .reduce(Integer::sum)
                .orElse(-1);
    }

    public Collection getMelonHeavyThan1Kg(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .filter(weight -> weight > 1000)
                .collect(Collectors.toList());
    }


}
