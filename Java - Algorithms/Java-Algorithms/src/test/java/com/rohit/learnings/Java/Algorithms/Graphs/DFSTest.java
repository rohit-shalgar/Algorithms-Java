package com.rohit.learnings.Java.Algorithms.Graphs;

import com.rohit.learnings.Java.Algorithms.graphs.Programs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DFSTest {

    @Test
    public void testcase1() {
        Programs.Node graph = new Programs.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(2).children.get(0).addChild("K");
        String[] expected = {"A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"};
        List<String> inputArray = new ArrayList<>();
        Assertions.assertTrue(
                compare(
                        graph.depthFirstSearch(inputArray),
                        expected
                )
        );

    }

    private boolean compare(List<String> depthFirstSearch, String[] expected) {
        if (depthFirstSearch.size() != expected.length) return false;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != depthFirstSearch.get(i)) return false;
        }
        return true;
    }
}
