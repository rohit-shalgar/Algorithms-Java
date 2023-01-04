package com.rohit.learnings.Java.Algorithms.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        branchSumsHelper(root, 0, sums);
        return sums;
    }

    private static void branchSumsHelper(BinaryTree treeNode, int sum, List<Integer> totalSums) {
        if (treeNode == null) return;
        int newRunningSum = sum + treeNode.value;
        if (treeNode.left == null && treeNode.right == null) {
            totalSums.add(newRunningSum);
            return;
        }
        branchSumsHelper(treeNode.left, newRunningSum, totalSums);
        branchSumsHelper(treeNode.right, newRunningSum, totalSums);
    }
}
