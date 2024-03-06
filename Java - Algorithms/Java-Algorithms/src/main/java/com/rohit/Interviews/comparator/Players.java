package com.rohit.Interviews.comparator;

public class Players {
    public int score;
    public String name;

    @Override
    public String toString() {
        return "Players{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    public Players(int score, String name) {
        this.score = score;
        this.name = name;
    }
}
