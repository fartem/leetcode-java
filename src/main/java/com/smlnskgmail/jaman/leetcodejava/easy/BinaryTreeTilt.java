package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

public class BinaryTreeTilt {

    private final TreeNode input;

    public BinaryTreeTilt(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        Tilt tilt = new Tilt();
        calcTilt(input, tilt);
        return tilt.val;
    }

    private int calcTilt(TreeNode node, Tilt tilt) {
        if (node == null) {
            return 0;
        }
        int l = calcTilt(node.left, tilt);
        int r = calcTilt(node.right, tilt);
        tilt.val += Math.abs(l - r);
        return l + r + node.val;
    }

    private static class Tilt {
        int val;
    }
}
