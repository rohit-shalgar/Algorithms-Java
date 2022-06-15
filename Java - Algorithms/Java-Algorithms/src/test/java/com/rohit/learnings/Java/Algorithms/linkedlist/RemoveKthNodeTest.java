package com.rohit.learnings.Java.Algorithms.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RemoveKthNodeTest {

    @Test
    public void testcase1_removeFourthElementFromTheEnd() {

        LinkedList linkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(0), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList actualLinkedList = RemoveKthNode.removeNode(linkedList, 4);
        List<Integer> expectedNodeValues = List.of(0, 1, 2, 3, 4, 5, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }

    @Test
    public void testcase2_removeHeadElement() {

        LinkedList linkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(0), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList actualLinkedList = RemoveKthNode.removeNode(linkedList, 10);
        List<Integer> expectedNodeValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }


    @Test
    public void testcase3_removeLastElement() {

        LinkedList linkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(0), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList actualLinkedList = RemoveKthNode.removeNode(linkedList, 1);
        List<Integer> expectedNodeValues = List.of(0,1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedList);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);

    }
}
