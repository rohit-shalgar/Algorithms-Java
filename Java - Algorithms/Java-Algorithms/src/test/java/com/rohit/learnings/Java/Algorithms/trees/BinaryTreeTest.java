package com.rohit.learnings.Java.Algorithms.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeTest extends Trees.BinaryTree {

    BinaryTreeTest(int value) {
        super(value);
    }

    BinaryTreeTest insert(List<Integer> values) {
        return insert(values, 0);
    }

    BinaryTreeTest insert(List<Integer> values, int i) {
        if (i >= values.size()) return null;

        List<BinaryTreeTest> queue = new ArrayList<BinaryTreeTest>();
        queue.add(this);
        while (queue.size() > 0) {
            BinaryTreeTest current = queue.get(0);
            queue.remove(0);
            if (current.left == null) {
                current.left = new BinaryTreeTest(values.get(i));
                break;
            }
            queue.add((BinaryTreeTest) current.left);
            if (current.right == null) {
                current.right = new BinaryTreeTest(values.get(i));
                break;
            }
            queue.add((BinaryTreeTest) current.right);
        }
        insert(values, i + 1);
        return this;
    }


    @Test
    public void TestCase1() {
        BinaryTreeTest tree = new BinaryTreeTest(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = new ArrayList<>(Arrays.asList(15, 16, 18, 10, 11));
        Assertions.assertTrue(Trees.branchSums(tree).equals(expected));
    }
}
