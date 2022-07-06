package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {

    private final int[] preorder;
    private final int[] postorder;

    public ConstructBinaryTreeFromPreorderAndPostorderTraversal(
            int[] preorder,
            int[] postorder
    ) {
        this.preorder = preorder;
        this.postorder = postorder;
    }

    public TreeNode solution() {
        return buildFullBT(
                preorder,
                postorder,
                0,
                preorder.length - 1,
                0,
                postorder.length - 1
        );
    }

    private TreeNode buildFullBT(
            int[] pre,
            int[] post,
            int preStart,
            int preEnd,
            int postStart,
            int postEnd
    ) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(pre[preStart]);
        }
        TreeNode node = new TreeNode(pre[preStart]);
        int rootIndex = findRoot(
                post,
                postStart,
                postEnd,
                pre[preStart + 1]
        );
        node.left = buildFullBT(
                pre,
                post,
                preStart + 1,
                preStart + rootIndex - postStart + 1,
                postStart,
                rootIndex
        );
        node.right = buildFullBT(
                pre,
                post,
                preEnd - postEnd + rootIndex + 2,
                preEnd,
                rootIndex + 1,
                postEnd - 1
        );
        return node;
    }

    private int findRoot(int[] post, int s, int e, int root) {
        for (int i = s; i <= e; i++) {
            if (post[i] == root) {
                return i;
            }
        }
        return -1;
    }

}
