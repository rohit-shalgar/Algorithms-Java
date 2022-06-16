package com.rohit.learnings.Java.Algorithms.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RemoveDuplicateNodesTest {

    @Test
    public void testcase1_addNodesAndPrintThem() {
        LinkedList linkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(1), List.of(1, 2, 3, 3, 4, 5, 5, 5));
        LinkedList actualLinkedListOutput = RemoveDuplicateNodes.remove(linkedList);
        List<Integer> expectedNodeValues = List.of(1, 2, 3, 4, 5);
        List<Integer> actualNodeValues = SinglyLinkedListUtilities.getNodeValuesFromLinkedList(actualLinkedListOutput);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);
    }
}
