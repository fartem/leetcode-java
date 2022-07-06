package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/complete-binary-tree-inserter/
public class CompleteBinaryTreeInserter {

    private final TreeNode root;
    private final Deque<TreeNode> deq = new LinkedList<>();

    public CompleteBinaryTreeInserter(TreeNode root) {
        this.root = root;

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            var node = que.poll();
            if (node.left == null || node.right == null) {
                deq.offerLast(node);
            }
            if (node.left != null) {
                que.offer(node.left);
            }
            if (node.right != null) {
                que.offer(node.right);
            }
        }
    }

    public int insert(int val) {
        var node = deq.peekFirst();
        deq.offerLast(new TreeNode(val));
        if (node.left == null) {
            node.left = deq.peekLast();
        } else {
            node.right = deq.peekLast();
            deq.pollFirst();
        }
        return node.val;
    }

    public TreeNode getRoot() {
        return root;
    }

}
