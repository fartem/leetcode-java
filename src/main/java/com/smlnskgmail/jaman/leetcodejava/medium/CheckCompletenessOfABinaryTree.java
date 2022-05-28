package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/check-completeness-of-a-binary-tree/
public class CheckCompletenessOfABinaryTree {

    private final TreeNode input;

    public CheckCompletenessOfABinaryTree(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        boolean isEnd = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(input);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                isEnd = true;
            } else {
                if (isEnd) {
                    return false;
                }
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
        }
        return true;
    }

}
