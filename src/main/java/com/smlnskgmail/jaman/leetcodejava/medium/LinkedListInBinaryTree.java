package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/linked-list-in-binary-tree/
public class LinkedListInBinaryTree {

    private final ListNode head;
    private final TreeNode root;

    public LinkedListInBinaryTree(ListNode head, TreeNode root) {
        this.head = head;
        this.root = root;
    }

    public boolean solution() {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.remove();
            if (node.val == head.val) {
                boolean isSubPath = dfs(head, node);
                if (isSubPath) {
                    return true;
                }
            }
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        return false;
    }

    private boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null || root.val != head.val) {
            return false;
        }
        boolean left = dfs(head.next, root.left);
        boolean right = dfs(head.next, root.right);
        return left || right;
    }

}
