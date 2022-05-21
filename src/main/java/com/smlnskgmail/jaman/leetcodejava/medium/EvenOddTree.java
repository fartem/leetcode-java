package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/even-odd-tree/
public class EvenOddTree {

    private final TreeNode input;

    public EvenOddTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(input);
        int level = 0;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int prev = -1;
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                int val = node.val;
                if (level % 2 == 0) {
                    if (val % 2 == 0 || (prev != -1 && prev >= val)) {
                        return false;
                    }
                } else {
                    if (val % 2 != 0 || (prev != -1 && prev <= val)) {
                        return false;
                    }
                }
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
                prev = val;
            }
            level++;
        }
        return true;
    }

}
