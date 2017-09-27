package com.company;

public class Prob92ReverseSingleLinkedListTwo {

    private static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode beforeM = null;
        ListNode previous = null;
        ListNode following = null;
        ListNode mPosition = null;
        ListNode current = head;
        for (int i = 1; i <= n; i++) {
            if (i == m - 1) {
                beforeM = current;
            }
            following = current.next;
            if (i == m) {
                mPosition = current;
            }
            if (i >= m) {
                current.next = previous;
                previous = current;
            }
            current = following;
        }
        mPosition.next = current;
        if (beforeM == null) {
            head = previous;
        } else {
            beforeM.next = previous;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    private static ListNode prepareTest(){
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        head.next = node;
        return head;
    }

    public static void main(String[] args) {
        reverseBetween(prepareTest(), 2, 2);
    }


}
