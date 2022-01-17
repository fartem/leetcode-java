package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal
public class ConstructBinarySearchTreeFromPreorderTraversal {

    private final int[] input;

    public ConstructBinarySearchTreeFromPreorderTraversal(int[] input) {
        this.input = input;
    }

    public TreeNode solution() {
        return constructBST(input, 0, input.length - 1);
    }

    private TreeNode constructBST(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[start]);
        int index;
        for (index = start; index <= end; index++) {
            if (preorder[index] > node.val) {
                break;
            }
        }
        node.left = constructBST(preorder, start + 1, index - 1);
        node.right = constructBST(preorder, index, end);
        return node;
    }
}
