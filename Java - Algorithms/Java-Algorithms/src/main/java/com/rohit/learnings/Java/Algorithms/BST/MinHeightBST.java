package com.rohit.learnings.Java.Algorithms.BST;

import java.util.List;

public class MinHeightBST {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public static BST minHeightBst(List<Integer> array) {
            return constructBSTHelper(array, 0, array.size() - 1, null);
        }

        private static BST constructBSTHelper(
                List<Integer> array,
                int startIdx,
                int endIdx,
                BST bst
        ) {
            if (startIdx > endIdx) return bst;
            int rootIdx = (startIdx + endIdx) / 2;
            int currentBSTValue = array.get(rootIdx);
            if (bst == null) {
                bst = new BST(currentBSTValue);
            } else bst.insert(currentBSTValue);
            constructBSTHelper(array, startIdx, rootIdx - 1, bst);
            constructBSTHelper(array, rootIdx + 1, endIdx, bst);
            return bst;
        }
    }
}
