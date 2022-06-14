/*
    Singly linked list implementation
 */
package com.rohit.learnings.Java.Algorithms.linkedlist;

public class LinkedList {

    public int value;
    public LinkedList next;

    public LinkedList(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

}
