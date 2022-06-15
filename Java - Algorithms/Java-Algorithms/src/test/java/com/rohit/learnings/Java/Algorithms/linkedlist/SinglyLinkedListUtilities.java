package com.rohit.learnings.Java.Algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedListUtilities {

    public static LinkedList addNodes(LinkedList linkedList, List<Integer> values) {
        LinkedList current = linkedList;
        for (int value : values) {
            current.next = new LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public static List<Integer> getNodeValuesFromLinkedList(LinkedList linkedList) {
        List<Integer> allNodeValues = new ArrayList<>();
        LinkedList current = linkedList;
        while (current != null) {
            allNodeValues.add(current.value);
            current = current.next;
        }
        return allNodeValues;
    }
}
