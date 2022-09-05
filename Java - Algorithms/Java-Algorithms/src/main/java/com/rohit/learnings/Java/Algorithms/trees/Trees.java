package com.rohit.learnings.Java.Algorithms.trees;

public class Trees {

    static int closest = Integer.MAX_VALUE;

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    //O(log(n)) as we only traverse half tree
    // worst case scenario - o(n) as tree may have only1 branch
    // o(n) space in worst case. or o(d)
    public static int findClosestValueInBst(BST tree, int target) {
        if (tree != null) {
            int currentDiff = Math.abs(tree.value - target);
            int currentClosest = Math.abs(closest - target);
            if (currentDiff < currentClosest) closest = tree.value;
            if (target < tree.value) return findClosestValueInBst(tree.left, target);
            else return findClosestValueInBst(tree.right, target);
        }
        return closest;
    }

    public static int findClosestValueInBstItr(BST tree, int target) {
        BST currentTreeNode = tree;
        while (currentTreeNode != null) {
            if (Math.abs(currentTreeNode.value - target) < Math.abs(closest - target)) {
                closest = currentTreeNode.value;
            }
            if (target < currentTreeNode.value) currentTreeNode = currentTreeNode.left;
            else if (target > currentTreeNode.value) currentTreeNode = currentTreeNode.right;
            else return currentTreeNode.value;
        }
        return closest;
    }
}
