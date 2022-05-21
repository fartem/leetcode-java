package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/delete-nodes-and-return-forest/
public class DeleteNodesAndReturnForest {

    private final TreeNode root;
    private final int[] toDelete;

    public DeleteNodesAndReturnForest(TreeNode root, int[] toDelete) {
        this.root = root;
        this.toDelete = toDelete;
    }

    public List<TreeNode> solution() {
        Set<Integer> deleteValues = new HashSet<>();
        for (int num : toDelete) {
            deleteValues.add(num);
        }
        List<TreeNode> result = new ArrayList<>();
        TreeNode node = collectNodes(root, result, deleteValues);
        if (node != null) {
            result.add(root);
        }
        return result;
    }

    private TreeNode collectNodes(TreeNode node, List<TreeNode> nodes, Set<Integer> deleteValues) {
        if (node != null) {
            node.left = collectNodes(node.left, nodes, deleteValues);
            node.right = collectNodes(node.right, nodes, deleteValues);
            if (deleteValues.contains(node.val)) {
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
                return null;
            }
            return node;
        }
        return null;
    }

}
