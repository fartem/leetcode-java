package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/
public class StepByStepDirectionsFromABinaryTreeNodeToAnother {

    private final TreeNode root;
    private final int startValue;
    private final int destValue;

    private final List<String> paths = new ArrayList<>();

    public StepByStepDirectionsFromABinaryTreeNodeToAnother(
            TreeNode root,
            int startValue,
            int destValue
    ) {
        this.root = root;
        this.startValue = startValue;
        this.destValue = destValue;
    }

    public String solution() {
        TreeNode lca = lca(root, startValue, destValue);
        pathFor(lca, startValue, new StringBuilder());
        pathFor(lca, destValue, new StringBuilder());
        StringBuilder result = new StringBuilder();
        result.append("U".repeat(paths.get(0).length()));
        result.append(paths.get(1));
        return result.toString();
    }

    private TreeNode lca(TreeNode node, int startValue, int destValue) {
        if (node != null) {
            if (node.val == startValue || node.val == destValue) {
                return node;
            }
            TreeNode left = lca(node.left, startValue, destValue);
            TreeNode right = lca(node.right, startValue, destValue);
            if (left != null && right != null) {
                return node;
            }
            return left != null ? left : right;
        }
        return null;
    }

    private void pathFor(TreeNode node, int val, StringBuilder path) {
        if (node != null) {
            if (node.val == val) {
                paths.add(path.toString());
            } else {
                if (node.left != null) {
                    pathFor(node.left, val, path.append('L'));
                }
                if (node.right != null) {
                    pathFor(node.right, val, path.append('R'));
                }
                path.deleteCharAt(path.length() - 1);
            }
        }
    }

}
