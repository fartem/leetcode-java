package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

// https://leetcode.com/problems/root-equals-sum-of-children/
public class RootEqualsSumOfChildren {

    private final TreeNode input;

    public RootEqualsSumOfChildren(TreeNode input) {
        this.input = input;
    }

    public boolean solution() {
        return input.val == input.left.val + input.right.val;
    }

}
