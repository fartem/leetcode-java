package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private final int[] inorder;
    private final int[] postorder;

    public ConstructBinaryTreeFromInorderAndPostorderTraversal(
            int[] inorder,
            int[] postorder
    ) {
        this.inorder = inorder;
        this.postorder = postorder;
    }

    public TreeNode solution() {
        Map<Integer, Integer> values = new HashMap<>();
        int length = inorder.length;
        for (int i = 0; i < length; i++) {
            values.put(inorder[i], i);
        }
        return build(inorder, 0, length - 1, postorder, 0, length - 1, values);
    }

    private TreeNode build(
            int[] in,
            int iS,
            int iE,
            int[] post,
            int pS,
            int pE,
            Map<Integer, Integer> values
    ) {
        if (pS > pE || iS > iE) {
            return null;
        }
        TreeNode root = new TreeNode(post[pE]);
        int index = values.get(post[pE]);
        root.left = build(in, iS, index - 1, post, pS, pS + index - iS - 1, values);
        root.right = build(in, index + 1, iE, post, pS + index - iS, pE - 1, values);
        return root;
    }

}
