package com.smlnskgmail.jaman.leetcodejava.support;

import java.util.Objects;

public class ListNode {

    public static boolean areEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    public static ListNode fromNumbers(int... numbers) {
        if (numbers.length == 0) {
            return null;
        }
        ListNode head = new ListNode(numbers[0]);
        ListNode p = head;
        for (int i = 1; i < numbers.length; i++) {
            p.next = new ListNode(numbers[i]);
            p = p.next;
        }
        return head;
    }

    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

}
