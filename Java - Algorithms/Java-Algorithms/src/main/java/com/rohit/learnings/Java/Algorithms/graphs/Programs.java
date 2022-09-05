package com.rohit.learnings.Java.Algorithms.graphs;

import java.util.ArrayList;
import java.util.List;

public class Programs {

    public static class Node {
        String name;
        public List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node children = new Node(name);
            this.children.add(children);
            return this;
        }

        public List<String> depthFirstSearch(List<String> inputArray) {
            inputArray.add(this.name);
            for (Node child : children) {
                child.depthFirstSearch(inputArray);
            }
            return inputArray;
        }

    }


}
