package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/design-linked-list
public class DesignLinkedList {

    private ListNode head;

    private int length = 0;

    public DesignLinkedList() {

    }

    public int get(int index) {
        if (isValidIndex(index)) {
            return getNodeAtIndex(index).val;
        }
        return -1;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < length;
    }

    private ListNode getNodeAtIndex(int index) {
        if (index == 0) {
            return head;
        }
        ListNode target = head;
        int position = 0;
        while (position != index) {
            target = target.next;
            position++;
        }
        return target;
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        if (head == null) {
            head = newHead;
        } else {
            ListNode prev = head;
            head = newHead;
            newHead.next = prev;
        }
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new ListNode(val);
        } else {
            ListNode tail = getNodeAtIndex(length - 1);
            tail.next = new ListNode(val);
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (isValidIndex(index)) {
            if (index == 0) {
                addAtHead(val);
            } else {
                ListNode prev = getNodeAtIndex(index - 1);
                ListNode next = getNodeAtIndex(index);
                ListNode newNode = new ListNode(val);
                prev.next = newNode;
                newNode.next = next;
            }
            length++;
        } else if (index == length) {
            addAtTail(val);
        }
    }

    public void deleteAtIndex(int index) {
        if (isValidIndex(index)) {
            if (index == 0) {
                if (head != null) {
                    head = head.next;
                    length--;
                }
            } else {
                ListNode prev = getNodeAtIndex(index - 1);
                prev.next = prev.next == null ? null : prev.next.next;
                length--;
            }
        }
    }

}
