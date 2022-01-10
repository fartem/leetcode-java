package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/add-one-row-to-tree
public class AddOneRowToTree {

    private final TreeNode root;
    private final int val;
    private final int depth;

    public AddOneRowToTree(TreeNode root, int val, int depth) {
        this.root = root;
        this.val = val;
        this.depth = depth;
    }

    public TreeNode solution() {
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        int level = 1;
        Deque<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            if (level + 1 == depth) {
                while (size != 0) {
                    TreeNode node = nodes.pop();
                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    node.left = new TreeNode(val, left, null);
                    node.right = new TreeNode(val, null, right);
                    size--;
                }
                break;
            } else {
                while (size != 0) {
                    TreeNode node = nodes.pop();
                    if (node.left != null) {
                        nodes.addLast(node.left);
                    }
                    if (node.right != null) {
                        nodes.addLast(node.right);
                    }
                    size--;
                }
            }
            level++;
        }
        return root;
    }

}
