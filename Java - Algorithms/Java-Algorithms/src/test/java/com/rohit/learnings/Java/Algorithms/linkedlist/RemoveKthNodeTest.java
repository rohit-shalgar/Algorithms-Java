package com.rohit.learnings.Java.Algorithms.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RemoveKthNodeTest {

    private RemoveKthNode removeKthNode;

    @BeforeEach
    public void setup() {
        LinkedList linkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(0), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        removeKthNode = new RemoveKthNode(linkedList);
    }

    @Test
    public void testcase1_removeFourthElementFromTheEnd() {

        LinkedList actualLinkedList = removeKthNode.removeNode(4);
        List<Integer> expectedNodeValues = List.of(0, 1, 2, 3, 4, 5, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

    @Test
    public void testcase2_removeHeadElement() {

        LinkedList actualLinkedList = removeKthNode.removeNode(10);
        List<Integer> expectedNodeValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }


    @Test
    public void testcase3_removeLastElement() {

        LinkedList actualLinkedList = removeKthNode.removeNode(1);
        List<Integer> expectedNodeValues = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

    @Test
    public void testcase4_removeHeadElement_twoPointerMethod() {

        LinkedList actualLinkedList = removeKthNode.removeNodeTwoPointers(10);
        List<Integer> expectedNodeValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

    @Test
    public void testcase5_removeLastElement_twoPointerMethod() {

        LinkedList actualLinkedList = removeKthNode.removeNodeTwoPointers(1);
        List<Integer> expectedNodeValues = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

    @Test
    public void testcase6_removeFourthElementFromTheEnd_twoPointerMethod() {

        LinkedList actualLinkedList = removeKthNode.removeNodeTwoPointers(4);
        List<Integer> expectedNodeValues = List.of(0, 1, 2, 3, 4, 5, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

}
