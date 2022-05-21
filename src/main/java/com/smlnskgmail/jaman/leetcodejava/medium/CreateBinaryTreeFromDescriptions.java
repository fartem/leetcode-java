package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/create-binary-tree-from-descriptions/
public class CreateBinaryTreeFromDescriptions {

    private final int[][] descriptions;

    public CreateBinaryTreeFromDescriptions(int[][] input) {
        this.descriptions = input;
    }

    public TreeNode solution() {
        Map<Integer, TreeNode> values = new HashMap<>();
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        for (int[] description : descriptions) {
            int parent = description[0];
            values.putIfAbsent(parent, new TreeNode(parent));
            TreeNode root = values.get(parent);

            int child = description[1];
            values.putIfAbsent(child, new TreeNode(child));
            TreeNode node = values.get(child);

            if (description[2] == 1) {
                root.left = node;
            } else {
                root.right = node;
            }
            parents.put(node, root);
        }
        for (Map.Entry<Integer, TreeNode> node : values.entrySet()) {
            if (!parents.containsKey(node.getValue())) {
                return node.getValue();
            }
        }
        return null;
    }

}
