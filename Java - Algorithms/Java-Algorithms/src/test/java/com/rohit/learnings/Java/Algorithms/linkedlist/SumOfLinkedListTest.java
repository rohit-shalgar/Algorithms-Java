package com.rohit.learnings.Java.Algorithms.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SumOfLinkedListTest {

    @Test
    public void testcase1_happyPath() {
        var linkedList1 = SinglyLinkedListUtilities.addNodes(new LinkedList(2),
                List.of(4, 7, 1));
        var linkedList2 = SinglyLinkedListUtilities.addNodes(new LinkedList(9),
                List.of(4, 5));
        var outputLinkedList = SumOfLinkedLists.sum(linkedList1, linkedList2);
        var expectedLinkedList = SinglyLinkedListUtilities.addNodes(new LinkedList(1),
                List.of(9, 2, 2));

        Assertions.assertThat(SinglyLinkedListUtilities.getNodeValuesFromLinkedList(outputLinkedList)).
                isEqualTo(SinglyLinkedListUtilities.getNodeValuesFromLinkedList(expectedLinkedList));

    }

}
