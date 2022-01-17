package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/cousins-in-binary-tree
public class CousinsInBinaryTree {

    private final TreeNode root;
    private final int x;
    private final int y;

    public CousinsInBinaryTree(TreeNode root, int x, int y) {
        this.root = root;
        this.x = x;
        this.y = y;
    }

    public boolean solution() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int found = 0;
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
                found = 0;
                continue;
            }
            TreeNode left = curr.left;
            TreeNode right = curr.right;
            if (left != null && (left.val == x || left.val == y)) {
                found++;
            } else if (right != null && (right.val == x || right.val == y)) {
                found++;
            }
            if (found == 2) {
                return true;
            }
            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
        }
        return false;
    }
}
