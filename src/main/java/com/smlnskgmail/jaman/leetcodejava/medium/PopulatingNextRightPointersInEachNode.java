package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NextTreeNode;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class PopulatingNextRightPointersInEachNode {

    private final NextTreeNode input;

    public PopulatingNextRightPointersInEachNode(NextTreeNode input) {
        this.input = input;
    }

    public NextTreeNode solution() {
        return connect(input);
    }

    private NextTreeNode connect(NextTreeNode root) {
        if (root != null) {
            if (root.left != null) {
                root.left.next = root.right;
                connect(root.left);
                root.right.next = root.next != null ? root.next.left : null;
                connect(root.right);
            }
            return root;
        }
        return null;
    }
}
