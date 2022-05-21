package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class SwappingNodesInALinkedList {

    private final ListNode head;
    private final int k;

    public SwappingNodesInALinkedList(ListNode head, int k) {
        this.head = head;
        this.k = k;
    }

    public ListNode solution() {
        List<ListNode> nodes = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }
        ListNode f = nodes.get(k - 1);
        ListNode s = nodes.get(nodes.size() - k);
        int temp = f.val;
        f.val = s.val;
        s.val = temp;
        return head;
    }

}
