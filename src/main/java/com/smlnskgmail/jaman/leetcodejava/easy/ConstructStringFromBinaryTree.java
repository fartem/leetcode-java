package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/construct-string-from-binary-tree/
public class ConstructStringFromBinaryTree {

    private final TreeNode input;

    public ConstructStringFromBinaryTree(TreeNode input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        result.append(input.val);
        apply(input, result);
        return result.toString();
    }

    private void apply(TreeNode node, StringBuilder part) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            part.append('(');
            part.append(node.left.val);
            apply(node.left, part);
            part.append(')');
        }
        if (node.right != null) {
            if (node.left == null) {
                part.append("()");
            }
            part.append('(');
            part.append(node.right.val);
            apply(node.right, part);
            part.append(')');
        }
    }

}
