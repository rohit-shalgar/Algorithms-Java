package com.rohit.learnings.Java.Algorithms.BST;

import com.rohit.learnings.Java.Algorithms.trees.Trees;

import java.util.List;

public class Traversal {
    public static List<Integer> inOrderTraverse(Trees.BST tree, List<Integer> array) {
        if (tree.left != null) inOrderTraverse(tree.left, array);
        array.add(tree.value);
        if (tree.right != null) inOrderTraverse(tree.right, array);
        return array;
    }

    public static List<Integer> preOrderTraverse(Trees.BST tree, List<Integer> array) {
        array.add(tree.value);
        if (tree.left != null) preOrderTraverse(tree.left, array);
        if (tree.right != null) preOrderTraverse(tree.right, array);
        return array;
    }

    public static List<Integer> postOrderTraverse(Trees.BST tree, List<Integer> array) {
        if (tree.left != null) postOrderTraverse(tree.left, array);
        if (tree.right != null) postOrderTraverse(tree.right, array);
        array.add(tree.value);
        return array;
    }
}
