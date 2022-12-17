package com.rohit.learnings.Java.Algorithms.BST;

import java.util.ArrayList;
import java.util.List;

public class KthHighestValue {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> inOrderTree = new ArrayList<>();
        inOrderTraversalHelper(tree, inOrderTree);
        return inOrderTree.get(k - 1);
    }

    private void inOrderTraversalHelper(BST tree, List<Integer> inOrderTree) {
        if (tree.right != null) inOrderTraversalHelper(tree.right, inOrderTree);
        inOrderTree.add(tree.value);
        if (tree.left != null) inOrderTraversalHelper(tree.left, inOrderTree);
    }
}
