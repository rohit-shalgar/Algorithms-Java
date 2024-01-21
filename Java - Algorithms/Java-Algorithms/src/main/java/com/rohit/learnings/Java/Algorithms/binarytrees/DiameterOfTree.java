package com.rohit.learnings.Java.Algorithms.binarytrees;

public class DiameterOfTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        return binaryTreeDiameterHelper(tree, 0, 0);
    }

    private int binaryTreeDiameterHelper(BinaryTree tree, int currentLongestPath, int longestPath) {
        if (tree == null) return currentLongestPath;
        int leftLongestPath = binaryTreeDiameterHelper(tree.left, currentLongestPath + 1, longestPath);
        int rightLongestPath = binaryTreeDiameterHelper(tree.right, currentLongestPath + 1, longestPath);
        return Math.max(leftLongestPath + rightLongestPath, longestPath);
    }
}
