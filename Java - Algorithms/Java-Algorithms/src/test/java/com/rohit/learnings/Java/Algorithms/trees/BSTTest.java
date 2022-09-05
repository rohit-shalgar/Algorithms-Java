package com.rohit.learnings.Java.Algorithms.trees;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTTest {

    @Test
    public void testCase1() {
        Trees.BST root = new Trees.BST(10);
        root.left = new Trees.BST(5);
        root.left.left = new Trees.BST(2);
        root.left.left.left = new Trees.BST(1);
        root.left.right = new Trees.BST(5);
        root.right = new Trees.BST(15);
        root.right.left = new Trees.BST(13);
        root.right.left.right = new Trees.BST(14);
        root.right.right = new Trees.BST(22);

        var expected = 13;
        var actual = Trees.findClosestValueInBst(root, 12);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
