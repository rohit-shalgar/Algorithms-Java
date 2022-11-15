package com.rohit.learnings.Java.Algorithms.BST;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructBSTTest {


    @Test
    public void TestCase1() {
        var root = new ConstructBST.BST(10);
        root.left = new ConstructBST.BST(5);
        root.left.left = new ConstructBST.BST(2);
        root.left.left.left = new ConstructBST.BST(1);
        root.left.right = new ConstructBST.BST(5);
        root.right = new ConstructBST.BST(15);
        root.right.left = new ConstructBST.BST(13);
        root.right.left.right = new ConstructBST.BST(14);
        root.right.right = new ConstructBST.BST(22);

        root.insert(12);
        Assertions.assertTrue(root.right.left.left.value == 12);
        Assertions.assertTrue(root.contains(15));
    }
}

