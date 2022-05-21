package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class SumOfRootToLeafBinaryNumbers {

    private final TreeNode input;

    public SumOfRootToLeafBinaryNumbers(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        List<Integer> values = new ArrayList<>();
        fillValues(input, values, 0);
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    private void fillValues(TreeNode root, List<Integer> values, int curr) {
        if (root != null) {
            curr = (curr << 1) | root.val;
            if (root.left == null && root.right == null) {
                values.add(curr);
            } else {
                fillValues(root.left, values, curr);
                fillValues(root.right, values, curr);
            }
        }
    }

}
