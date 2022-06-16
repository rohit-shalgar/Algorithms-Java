package com.rohit.learnings.Java.Algorithms.linkedlist;

import java.util.Objects;

public class RemoveKthNode {

    private final LinkedList firstLinkedList;
    private final LinkedList secondLinkedList;
    private final LinkedList headToBeReturned;

    public RemoveKthNode(LinkedList linkedList) {
        firstLinkedList = linkedList;
        secondLinkedList = linkedList;
        headToBeReturned = linkedList;
    }

    public LinkedList removeNode(int kthNode) {
        int linkedListLength = getLinkedListSize(firstLinkedList);
        if (headNeedsToBeShifted(linkedListLength, headToBeReturned, kthNode)) {
            return headToBeReturned;
        }
        removeKthNode(linkedListLength, secondLinkedList, kthNode);
        return headToBeReturned;
    }

    private int getLinkedListSize(LinkedList traverse) {
        int counter = 0;
        while (traverse != null) {
            counter++;
            traverse = traverse.next;
        }
        return counter;
    }

    private boolean headNeedsToBeShifted(int linkedListLength, LinkedList linkedList, int k) {
        if (linkedListLength == k) {
            linkedList.value = linkedList.next.value;
            linkedList.next = linkedList.next.next;
            return true;
        }
        return false;
    }

    private void removeKthNode(int linkedListLength, LinkedList nextNode, int k) {
        linkedListLength = linkedListLength - k - 1;
        while (linkedListLength > 0) {
            linkedListLength--;
            nextNode = nextNode.next;
        }
        nextNode.next = nextNode.next.next;
    }

    public LinkedList removeNodeTwoPointers(int kthNode) {
        int counter = 1;
        iterateTillKthNode(counter, kthNode, secondLinkedList);
        if (headNeedsToBeShifted(secondLinkedList, headToBeReturned)) {
            return headToBeReturned;
        }
        removeKthNode(secondLinkedList, headToBeReturned);
        return headToBeReturned;
    }

    private void iterateTillKthNode(int counter, int k, LinkedList secondPointer) {
        while (counter <= k) {
            secondPointer = secondPointer.next;
            counter++;
        }
    }

    private boolean headNeedsToBeShifted(LinkedList secondPointer, LinkedList linkedList) {
        if (Objects.isNull(secondPointer)) {
            linkedList.value = linkedList.next.value;
            linkedList.next = linkedList.next.next;
            return true;
        }
        return false;
    }

    private void removeKthNode(LinkedList secondPointer, LinkedList firstPointer) {
        while (secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        firstPointer.next = firstPointer.next.next;
    }


}
