package com.rohit.learnings.Java.Algorithms.linkedlist;

public class RemoveKthNode {

    public static LinkedList removeNode(LinkedList linkedList, int k) {
        LinkedList traverse = linkedList;
        LinkedList nextNode = linkedList;
        int linkedListLength = getLinkedListSize(traverse);
        if (headNeedsToBeShifted(linkedListLength, linkedList, k)) {
            return linkedList;
        }
        removeKthNode(linkedListLength, nextNode, k);
        return linkedList;
    }

    private static int getLinkedListSize(LinkedList traverse) {
        int counter = 0;
        while (traverse != null) {
            counter++;
            traverse = traverse.next;
        }
        return counter;
    }


    private static boolean headNeedsToBeShifted(int linkedListLength, LinkedList linkedList, int k) {
        if (linkedListLength == k) {
            linkedList.value = linkedList.next.value;
            linkedList.next = linkedList.next.next;
            return true;
        }
        return false;
    }

    private static void removeKthNode(int linkedListLength, LinkedList nextNode, int k) {
        linkedListLength = linkedListLength - k - 1;
        while (linkedListLength > 0) {
            linkedListLength--;
            nextNode = nextNode.next;
        }
        nextNode.next = nextNode.next.next;
    }

}
