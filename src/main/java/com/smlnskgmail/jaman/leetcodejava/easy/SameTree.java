package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/same-tree/
public class SameTree {

    private final TreeNode p;
    private final TreeNode q;

    public SameTree(TreeNode p, TreeNode q) {
        this.p = p;
        this.q = q;
    }

    public boolean solution() {
        return isSame(p, q);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            boolean leftSame = isSame(p.left, q.left);
            boolean rightSame = isSame(p.right, q.right);
            return leftSame && rightSame;
        }
        return p == null && q == null;
    }

}
