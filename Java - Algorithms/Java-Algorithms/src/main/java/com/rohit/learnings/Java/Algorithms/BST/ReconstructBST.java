package com.rohit.learnings.Java.Algorithms.BST;

import java.util.ArrayList;

public class ReconstructBST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        return constructBSTHelper(null, preOrderTraversalValues, 0);
    }

    private BST constructBSTHelper(
            BST currentTree,
            ArrayList<Integer> preOrderTraversalValues,
            int currentNodeIndex
    ) {
        if (currentNodeIndex >= preOrderTraversalValues.size()) return currentTree;
        int nodeValue = preOrderTraversalValues.get(currentNodeIndex);
        if (currentTree == null) {
            currentTree = new BST(nodeValue);
        } else {
            if (nodeValue < currentTree.value) {
                currentTree.left = new BST(nodeValue);
                currentTree = currentTree.left;
            } else {
                currentTree.right = new BST(nodeValue);
                currentTree = currentTree.right;
            }
        }
        constructBSTHelper(currentTree, preOrderTraversalValues, currentNodeIndex++);
        return currentTree;
    }
}
