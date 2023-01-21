package com.smlnskgmail.jaman.leetcodejava.support;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

    public static boolean areEqual(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            return areEqual(n1.left, n2.left) && areEqual(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }

    public static TreeNode perfectFromArray(int... tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            assert node != null;
            if (node.left == null) {
                node.left = new TreeNode(tree[i]);
                q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(tree[i]);
                q.add(node.right);
                q.remove();
            }
        }
        return root;
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
