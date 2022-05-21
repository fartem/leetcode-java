package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNodeWithRandom;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
public class CopyListWithRandomPointer {

    private final ListNodeWithRandom input;

    public CopyListWithRandomPointer(ListNodeWithRandom input) {
        this.input = input;
    }

    public ListNodeWithRandom solution() {
        Map<ListNodeWithRandom, ListNodeWithRandom> nodes = new HashMap<>();
        var p = input;
        while (p != null) {
            nodes.put(p, new ListNodeWithRandom(p.val));
            p = p.next;
        }
        p = input;
        while (p != null) {
            var node = nodes.get(p);
            node.next = nodes.get(p.next);
            node.random = nodes.get(p.random);
            p = p.next;
        }
        return nodes.get(input);
    }

}
