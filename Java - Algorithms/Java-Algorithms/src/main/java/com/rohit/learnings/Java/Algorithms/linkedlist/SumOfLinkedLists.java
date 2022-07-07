package com.rohit.learnings.Java.Algorithms.linkedlist;


import java.util.Objects;
import java.util.function.Predicate;

/*
    Brute force
 */
public class SumOfLinkedLists {
    private static String total = "";

    public static LinkedList sum(LinkedList linkedList1, LinkedList linkedList2) {
        int sum1 = getReversedNumber(linkedList1);
        int sum2 = getReversedNumber(linkedList2);
        total = calculateTotalSum(sum1, sum2);
        return constructLinkedList();
    }

    private static int getReversedNumber(LinkedList linkedList) {
        StringBuilder builder = new StringBuilder();
        while (linkedList != null) {
            builder.append(linkedList.value);
            linkedList = linkedList.next;
        }
        return Integer.parseInt(builder.reverse().toString());
    }

    private static String calculateTotalSum(int sum1, int sum2) {
        return String.valueOf(sum1 + sum2);
    }

    private static LinkedList constructLinkedList() {
        int length = total.length();
        int headValue = getNodeValue(length - 1);
        LinkedList head = new LinkedList(headValue);
        LinkedList current = head;
        for (int i = length - 2; i >= 0; i--) {
            current.next = new LinkedList(getNodeValue(i));
            current = current.next;
        }
        return head;
    }

    private static int getNodeValue(int i) {
        return total.charAt(i) - '0';
    }

    /*
        Optimized.
     */
    static class SumOfLinkedListOptimized {

        private final static LinkedList dummy = new LinkedList(0);
        private static LinkedList current = dummy;

        static Predicate<LinkedList> nodePredicate = Objects::nonNull;

        public static LinkedList sum(LinkedList linkedList1, LinkedList linkedList2) {
            LinkedList node1 = linkedList1;
            LinkedList node2 = linkedList2;
            int carry = 0;
            while (nodePredicate.test(node1) || nodePredicate.test(node2)) {
                int value1 = 0, value2 = 0;
                if (nodePredicate.test(node1)) {
                    value1 = node1.value;
                    node1 = node1.next;
                }
                if (nodePredicate.test(node2)) {
                    value2 = node2.value;
                    node2 = node2.next;
                }
                int sumOfValues = value1 + value2 + carry;
                setNextNode(sumOfValues);
                carry = sumOfValues / 10;

            }
            return dummy.next;
        }


        private static void setNextNode(int sumOfValues) {
            int nodeValue = sumOfValues % 10;
            current.next = new LinkedList(nodeValue);
            current = current.next;
        }

    }

}
