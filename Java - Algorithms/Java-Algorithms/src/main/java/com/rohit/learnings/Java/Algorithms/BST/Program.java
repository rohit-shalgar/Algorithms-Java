package com.rohit.learnings.Java.Algorithms.BST;

import com.rohit.learnings.Java.Algorithms.trees.Trees;

public class Program {

    public static int FindClosestValueInBst(ConstructBST.BST tree, int target) {
        return findClosestValueInBt(tree, target, tree.value);
    }

    private static int findClosestValueInBt(ConstructBST.BST tree, int target, int closestValue) {
        if (Math.abs(tree.value - target) < Math.abs(closestValue - target)) {
            closestValue = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBt(tree.left, target, closestValue);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBt(tree.right, target, closestValue);
        } else return closestValue;


    }

    public static boolean validateBst(Trees.BST tree) {
        return validateBstHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBstHelper(Trees.BST tree, int min, int max) {
        if (tree == null) return true;
        if (tree.value < min || tree.value >= max) return false;
        boolean leftValidTree = validateBstHelper(tree.left, min, tree.value);
        return leftValidTree && validateBstHelper(tree.right, tree.value, max);
    }
}
