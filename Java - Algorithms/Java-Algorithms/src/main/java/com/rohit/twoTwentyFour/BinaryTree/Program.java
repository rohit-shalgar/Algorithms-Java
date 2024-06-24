package com.rohit.twoTwentyFour.BinaryTree;

import java.util.*;

class Program {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class TreeInfo {
        int height;
        int longestPath;

        public TreeInfo(int height, int longestPath) {
            this.height = height;
            this.longestPath = longestPath;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        return getTreeInfo(tree).longestPath;
    }

    public TreeInfo getTreeInfo(BinaryTree tree) {
        if (tree == null) return new TreeInfo(0, 0);

        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPath = Math.max(leftTreeInfo.longestPath, rightTreeInfo.longestPath);
        int diameterThroughRoot = leftTreeInfo.height + rightTreeInfo.height;
        int currentLongestPath = Math.max(longestPath, diameterThroughRoot);

        int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentHeight, currentLongestPath);
    }
}

