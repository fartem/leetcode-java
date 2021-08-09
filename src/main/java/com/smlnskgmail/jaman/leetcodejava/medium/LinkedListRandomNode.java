package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// https://leetcode.com/problems/linked-list-random-node
public class LinkedListRandomNode {

    private final ListNode input;
    private final List<ListNode> nodes = new ArrayList<>();
    private final Random random = new Random();

    public LinkedListRandomNode(ListNode input) {
        this.input = input;
    }

    public int solution() {
        if (nodes.isEmpty()) {
            ListNode p = input;
            while (p != null) {
                nodes.add(p);
                p = p.next;
            }
        }
        int index = random.nextInt(nodes.size());
        return nodes.get(index).val;
    }

}
