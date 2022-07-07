package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    private final int[] preorder;
    private final int[] inorder;

    private int preIndex;
    private final Map<Integer, Integer> inIndex = new HashMap<>();

    public ConstructBinaryTreeFromPreorderAndInorderTraversal(
            int[] preorder,
            int[] inorder
    ) {
        this.preorder = preorder;
        this.inorder = inorder;
    }

    public TreeNode solution() {
        for (int i = 0; i < inorder.length; i++) {
            inIndex.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode arrayToTree(int[] pre, int l, int r) {
        if (l > r) {
            return null;
        }
        int val = pre[preIndex++];
        TreeNode root = new TreeNode(val);
        root.left = arrayToTree(pre, l, inIndex.get(val) - 1);
        root.right = arrayToTree(pre, inIndex.get(val) + 1, r);
        return root;
    }

}
