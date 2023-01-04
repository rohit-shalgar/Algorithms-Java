package com.rohit.learnings.Java.Algorithms.binarytrees;

import java.util.List;

public class NodeDepth {
    public static int nodeDepths(BinaryTree root) {
        return nodeDepthsCalculator(root, 0);
    }
    private static int nodeDepthsCalculator(BinaryTree node, int depth) {
        if (node == null) return 0;
        return depth + nodeDepthsCalculator(node.left, depth + 1) + nodeDepthsCalculator(node.right, depth + 1);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
