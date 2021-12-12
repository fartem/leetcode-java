package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

public class SumOfNodesWithEvenValuedGrandparent {

    private final TreeNode input;

    private int sum;

    public SumOfNodesWithEvenValuedGrandparent(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        sum(input, null, null);
        return sum;
    }

    private void sum(TreeNode curr, TreeNode p, TreeNode gP) {
        if (curr != null) {
            if (gP != null && gP.val % 2 == 0) {
                sum += curr.val;
            }
            sum(curr.left, curr, p);
            sum(curr.right, curr, p);
        }
    }

}
