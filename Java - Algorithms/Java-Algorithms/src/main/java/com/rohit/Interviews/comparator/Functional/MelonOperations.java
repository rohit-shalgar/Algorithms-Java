package com.rohit.Interviews.comparator.Functional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MelonOperations {

    public Integer getMaxWeightMelon(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .reduce(Integer::max)
                .orElse(1);
    }

    public Integer totalMelonWeight(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .reduce(0, Integer::sum);
    }

    public Collection getMelonHeavyThan1Kg(List<Melon> melons) {
        return melons.stream()
                .map(Melon::getWeight)
                .filter(w -> w > 1000)
                .collect(Collectors.toList());
    }


}
