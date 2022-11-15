package com.rohit.learnings.Java.Algorithms.BST;

public class ConstructBST {
    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (this.left == null) this.left = new BST(value);
                else this.left.insert(value);
            } else {
                if (this.right == null) this.right = new BST(value);
                else this.right.insert(value);
            }
            return this;
        }

        public boolean contains(int value) {
            if (value < this.value) {
                if (this.left == null) return false;
                else return this.left.contains(value);
            } else if (value > this.value) {
                if (this.right == null) return false;
                else return this.right.contains(value);
            } else
                return true;
        }
    }
}
