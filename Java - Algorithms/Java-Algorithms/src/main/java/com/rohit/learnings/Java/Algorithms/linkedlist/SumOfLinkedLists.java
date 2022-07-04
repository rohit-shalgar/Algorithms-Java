package com.rohit.learnings.Java.Algorithms.linkedlist;

public class SumOfLinkedLists {
    public static LinkedList sum(LinkedList linkedList1, LinkedList linkedList2) {
        int sum1 = getReversedNumber(linkedList1);
        int sum2 = getReversedNumber(linkedList2);
        String total = calculateTotalSum(sum1, sum2);
        return constructLinkedList(total);
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

    private static LinkedList constructLinkedList(String total) {
        int length = total.length();
        int headValue = total.charAt(length - 1) - '0';
        LinkedList head = new LinkedList(headValue);
        LinkedList current = head;
        for (int i = length - 2; i >= 0; i--) {
            int value = total.charAt(i) - '0';
            current.next = new LinkedList(value);
            current = current.next;
        }
        return head;
    }


}
