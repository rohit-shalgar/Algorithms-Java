package com.rohit.Interviews.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Players> {

    @Override
    public int compare(Players p1, Players p2) {
        return p1.score == p2.score ? p1.name.compareTo(p2.name) :
                p2.score - p1.score;
    }
}
