package com.rohit.hackerRank;

import java.util.List;

public class SublistsAndINts {

    public static int subSectionsAndSum(List<Integer> s, int bDate, int month) {
        int counter = 0;
        for (int i = 0; i < s.size() - month; i++) {
            List<Integer> sublist = s.subList(i, month);
            if (sublist.stream().mapToInt(Integer::intValue).sum() == bDate) {
                counter++;
            }
        }
        return counter;
    }

}
