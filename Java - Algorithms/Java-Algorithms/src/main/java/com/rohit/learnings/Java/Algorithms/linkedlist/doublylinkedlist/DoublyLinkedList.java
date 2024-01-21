/*package com.rohit.learnings.Java.Algorithms.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void setHead(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        insertBefore(head, node);
    }

    public void setTails(Node node) {
        if (head == null) {
            setHead(node);
        }
        insertAfter(node, tail);

    }

    public void insertBefore(Node toBeInsertedBefore, Node node) {
        toBeInsertedBefore.prev = node.prev;
        toBeInsertedBefore.next = node.next;
        if (node.prev == null) {
            head = toBeInsertedBefore;
        } else {
            node.prev.next = toBeInsertedBefore;
        }
        node.prev = toBeInsertedBefore;
    }

    public void insertAfter(Node nodeToBeInsertedAfter, Node tail) {
        nodeToBeInsertedAfter.next = null;
        nodeToBeInsertedAfter.prev = tail;
        if (tail.next == null) {
            tail = nodeToBeInsertedAfter;
        } else {
            tail.prev.next = nodeToBeInsertedAfter;
        }
        tail.next = nodeToBeInsertedAfter;
    }

    public void insertAtPosition(Node nodeToBeInserted, int position) {
        if (position == 1) {
            setHead(nodeToBeInserted);
        }
        Node node = head;
        int currentPosition = 1;
        while (node != null && currentPosition++ < position) {
            node = node.next;
        }
        if (node != null) {
            insertAfter(nodeToBeInserted, node);
        } else {
            setTails(nodeToBeInserted);
        }
    }

    public void removeNodesWithValues(int value) {
        Node node = head;
        while (node != null) {
            Node nodeToRemove = node;
            node = node.next;
            if (nodeToRemove.value == value) {
                remove(nodeToRemove);
            }
        }
    }

    private void remove(Node nodeToRemove) {
        if (nodeToRemove == head) head = head.next;
        if (nodeToRemove == tail) tail = tail.prev;
        removeNodeBindings(nodeToRemove);
    }

    private void removeNodeBindings(Node nodeToRemove) {
        if (nodeToRemove.prev != null) nodeToRemove.prev.next = nodeToRemove.next;
        if (nodeToRemove.next != null) nodeToRemove.next.prev = nodeToRemove.prev;
        nodeToRemove.prev = null;
        nodeToRemove.next = null;
    }

    public boolean containsValue(int value) {
        Node node = head;
        while (node != null && value != node.value) {
            node = node.next;
        }
        return node != null;
    }
}
*/