package com.rohit.learnings.Java.Algorithms.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateNodesTest {

    //create a linked list for given integer array
    public LinkedList addNodes(LinkedList linkedList, List<Integer> values) {
        LinkedList current = linkedList;
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public List<Integer> getNodeValuesFromLinkedList(LinkedList linkedList) {
        List<Integer> allNodeValues = new ArrayList<>();
        LinkedList current = linkedList;
        while (current != null) {
            allNodeValues.add(current.value);
            current = current.next;
        }
        return allNodeValues;
    }

    @Test
    public void testcase1_addNodesAndPrintThem() {
        LinkedList linkedList = addNodes(new LinkedList(1), List.of(1, 2, 3, 3, 4, 5, 5, 5));
        LinkedList actualLinkedListOutput = RemoveDuplicateNodes.remove(linkedList);
        List<Integer> expectedNodeValues = List.of(1, 2, 3, 4, 5);
        List<Integer> actualNodeValues = getNodeValuesFromLinkedList(actualLinkedListOutput);
        Assertions.assertThat(actualNodeValues).isEqualTo(expectedNodeValues);
    }
}
