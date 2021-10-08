package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subtree-of-another-tree
public class SubtreeOfAnotherTree {

    private final TreeNode root;
    private final TreeNode subRoot;

    public SubtreeOfAnotherTree(
            TreeNode root,
            TreeNode subRoot
    ) {
        this.root = root;
        this.subRoot = subRoot;
    }

    public boolean solution() {
        List<TreeNode> nodes = new ArrayList<>();
        findNodes(root, subRoot, nodes);
        for (TreeNode node : nodes) {
            if (areIdentical(node, subRoot)) {
                return true;
            }
        }
        return false;
    }

    private void findNodes(
            TreeNode node,
            TreeNode target,
            List<TreeNode> nodes
    ) {
        if (node == null) {
            return;
        }
        if (node.val == target.val) {
            nodes.add(node);
        }
        findNodes(node.left, target, nodes);
        findNodes(node.right, target, nodes);
    }

    private boolean areIdentical(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            return n1.val == n2.val
                    && areIdentical(n1.left, n2.left)
                    && areIdentical(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }
}
