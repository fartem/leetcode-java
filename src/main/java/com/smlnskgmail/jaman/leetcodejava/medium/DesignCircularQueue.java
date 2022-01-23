package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/design-circular-queue
public class DesignCircularQueue {

    private final int size;
    private int actualSize;

    private final ListNode head = new ListNode();
    private ListNode tail;

    public DesignCircularQueue(int k) {
        this.size = k;
    }

    public boolean enQueue(int value) {
        if (actualSize != size) {
            if (tail == null) {
                tail = new ListNode(value);
                head.next = tail;
            } else {
                tail.next = new ListNode(value);
                tail = tail.next;
            }
            tail.next = head;
            actualSize++;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            head.next = head.next.next;
            actualSize--;
            return true;
        }
        return false;
    }

    public int Front() {
        return isEmpty() ? -1 : head.next.val;
    }

    public int Rear() {
        return isEmpty() ? -1 : tail.val;
    }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public boolean isFull() {
        return actualSize == size;
    }

}
