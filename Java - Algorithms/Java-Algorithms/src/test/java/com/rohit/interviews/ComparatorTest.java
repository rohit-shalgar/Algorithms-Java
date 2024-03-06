package com.rohit.interviews;

import com.rohit.Interviews.comparator.Checker;
import com.rohit.Interviews.comparator.Players;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

    @Test
    public void comparatorTest() {
        var checkerObj = new Checker();
        var player1 = new Players(200, "Rohit");
        var player2 = new Players(200, "Andrea");
        var player3 = new Players(2300, "zndrea");
        Players[] players = new Players[]{player1, player2, player3};
        System.out.println(players[0]);
        //Arrays.sort(players, checkerObj);
        Comparator<Players> comparator = (Players p1, Players p2) ->
                Comparator.comparing((Players player) -> player.score)
                        .reversed()
                        .thenComparing((Players player) -> player.name)
                        .compare(p1, p2);
        Arrays.sort(players, comparator);
        Runnable runner = () -> {
            Thread current = Thread.currentThread();

        };
        System.out.println(players[0]);

    }
}
