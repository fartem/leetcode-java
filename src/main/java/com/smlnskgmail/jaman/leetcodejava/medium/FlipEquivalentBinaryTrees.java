package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/flip-equivalent-binary-trees/
public class FlipEquivalentBinaryTrees {

    private final TreeNode root1;
    private final TreeNode root2;

    public FlipEquivalentBinaryTrees(TreeNode root1, TreeNode root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public boolean solution() {
        return countFlipEquivalents(root1, root2);
    }

    private boolean countFlipEquivalents(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        boolean original = countFlipEquivalents(root1.right, root2.right) && countFlipEquivalents(root1.left, root2.left);
        boolean switched = countFlipEquivalents(root1.right, root2.left) && countFlipEquivalents(root1.left, root2.right);
        return original || switched;
    }

}
