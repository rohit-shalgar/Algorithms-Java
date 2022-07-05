package com.rohit.learnings.Java.Algorithms.linkedlist;

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


}
