package com.rohit.learnings.Java.Algorithms.BST;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MinHeightBstTest {

    @Test
    public void testcase1_minHeightBSTHappyPath() {
        var inputlist = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
        MinHeightBST.BST output = MinHeightBST.BST.minHeightBst(inputlist);
        Assertions.assertThat(getHeight(output)).isEqualTo(4);

    }

    private int getHeight(MinHeightBST.BST output) {
        return getBSTHeight(output, 0);
    }

    private int getBSTHeight(MinHeightBST.BST tree, int height) {
        if (tree == null) return height;
        int leftHeight = getBSTHeight(tree.left, height + 1);
        int rightHeight = getBSTHeight(tree.right, height + 1);
        return Math.max(leftHeight, rightHeight);
    }
}
