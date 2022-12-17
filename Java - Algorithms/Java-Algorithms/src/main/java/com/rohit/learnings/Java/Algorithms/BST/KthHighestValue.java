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

    static class TreeInfo {
        int noOfNodesVisited;
        int lastVisitedNodeValue;

        public TreeInfo(int noOfNodesVisited, int lastVisitedNodeValue) {
            this.noOfNodesVisited = noOfNodesVisited;
            this.lastVisitedNodeValue = lastVisitedNodeValue;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> inOrderTree = new ArrayList<>();
        inOrderTraversalHelper(tree, inOrderTree);
        return inOrderTree.get(k - 1);
    }

    public int findKthLargestValueInBstOpt(BST tree, int k) {
        TreeInfo treeInfo = new TreeInfo(0, -1);
        inOrderTraversalHelper(tree, treeInfo, k);
        return treeInfo.lastVisitedNodeValue;
    }

    private void inOrderTraversalHelper(BST tree, TreeInfo treeInfo, int k) {
        if (tree == null || treeInfo.noOfNodesVisited >= k) return;
        inOrderTraversalHelper(tree.right, treeInfo, k);
        if (treeInfo.noOfNodesVisited < k) {
            treeInfo.noOfNodesVisited += 1;
            treeInfo.lastVisitedNodeValue = tree.value;
        }
        inOrderTraversalHelper(tree.left, treeInfo, k);
    }

    private void inOrderTraversalHelper(BST tree, List<Integer> inOrderTree) {
        if (tree.right != null) inOrderTraversalHelper(tree.right, inOrderTree);
        inOrderTree.add(tree.value);
        if (tree.left != null) inOrderTraversalHelper(tree.left, inOrderTree);
    }
}
