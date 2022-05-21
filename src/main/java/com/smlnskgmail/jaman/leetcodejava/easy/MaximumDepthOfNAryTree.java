package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
public class MaximumDepthOfNAryTree {

    private final Node input;

    public MaximumDepthOfNAryTree(Node input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        if (input == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(input);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node parent = queue.remove();
                queue.addAll(parent.children);
                size--;
            }
            result++;
        }
        return result;
    }

}
