package com.rohit.learnings.Java.Algorithms.binarytrees;

public class InvertBinaryTrees {
    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) return;
        if (tree.left != null || tree.right != null) {
            BinaryTree temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;
        }
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
