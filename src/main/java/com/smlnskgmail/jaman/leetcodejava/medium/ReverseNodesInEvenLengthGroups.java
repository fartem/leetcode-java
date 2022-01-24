package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reverse-nodes-in-even-length-groups
public class ReverseNodesInEvenLengthGroups {

    private final ListNode input;

    public ReverseNodesInEvenLengthGroups(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        List<ListNode> nodes = new ArrayList<>();
        ListNode p = input;
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }
        int counter = 1;
        int length = nodes.size();
        int index = 0;
        while (length > 0) {
            int count = Math.min(counter, length);
            if (count % 2 == 0) {
                int upperLimit = count + index - 1;
                for (int i = index, j = 0; j < count / 2; i++, j++) {
                    ListNode a = nodes.get(i);
                    ListNode b = nodes.get(upperLimit - j);
                    int temp = a.val;
                    a.val = b.val;
                    b.val = temp;
                }
            }
            length -= counter;
            index += counter;
            counter++;
        }
        return input;
    }

}
