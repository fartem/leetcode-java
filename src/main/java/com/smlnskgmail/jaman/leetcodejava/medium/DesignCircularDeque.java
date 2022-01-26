package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.Objects;

// https://leetcode.com/problems/design-circular-deque
public class DesignCircularDeque {

    private final int size;
    private int actualSize;

    private final ListNode head = new ListNode();
    private ListNode tail;

    public DesignCircularDeque(int size) {
        this.size = size;
    }

    public boolean insertFront(int value) {
        if (actualSize < size) {
            ListNode newHead = new ListNode(value);
            if (tail == null) {
                tail = newHead;
                head.next = tail;
                tail.next = head;
            } else {
                newHead.next = head.next;
                head.next = newHead;
            }
            actualSize++;
            return true;
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (actualSize < size) {
            ListNode newTail = new ListNode(value);
            Objects.requireNonNullElse(tail, head).next = newTail;
            newTail.next = head;
            tail = newTail;
            actualSize++;
            return true;
        }
        return false;
    }

    public boolean deleteFront() {
        if (actualSize != 0) {
            head.next = head.next.next;
            if (actualSize == 1) {
                tail = null;
            }
            actualSize--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (actualSize != 0) {
            if (actualSize == 1) {
                head.next = null;
                tail = null;
            } else {
                ListNode newTail = head.next;
                while (newTail.next != tail) {
                    newTail = newTail.next;
                }
                newTail.next = head;
                tail = newTail;
            }
            actualSize--;
            return true;
        }
        return false;
    }

    public int getFront() {
        if (actualSize != 0) {
            return head.next.val;
        }
        return -1;
    }

    public int getRear() {
        if (actualSize != 0) {
            return tail.val;
        }
        return -1;
    }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public boolean isFull() {
        return actualSize == size;
    }

}
