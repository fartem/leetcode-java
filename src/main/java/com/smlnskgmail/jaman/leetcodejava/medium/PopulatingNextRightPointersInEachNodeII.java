package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.NextTreeNode;

import java.util.*;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
public class PopulatingNextRightPointersInEachNodeII {

    private final NextTreeNode root;

    public PopulatingNextRightPointersInEachNodeII(NextTreeNode input) {
        this.root = input;
    }

    public NextTreeNode solution() {
        if (root == null) {
            return null;
        }
        LinkedList<NextTreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<NextTreeNode> level = new ArrayList<>();
            while (size-- != 0) {
                NextTreeNode node = nodes.removeFirst();
                if (node.left != null) {
                    level.add(node.left);
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    level.add(node.right);
                    nodes.addLast(node.right);
                }
            }
            for (int i = 0; i < level.size() - 1; i++) {
                level.get(i).next = level.get(i + 1);
            }
        }
        return root;
    }

}
