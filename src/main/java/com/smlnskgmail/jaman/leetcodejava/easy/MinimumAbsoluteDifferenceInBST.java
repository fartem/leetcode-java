package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

//  https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class MinimumAbsoluteDifferenceInBST {

    private final TreeNode input;

    public MinimumAbsoluteDifferenceInBST(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        List<Integer> nums = new ArrayList<>();
        fillNums(input, nums);
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < nums.size(); i++) {
            int diff = nums.get(i) - nums.get(i - 1);
            if (diff < result) {
                result = diff;
            }
        }
        return result;
    }

    private void fillNums(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        fillNums(node.left, nums);
        nums.add(node.val);
        fillNums(node.right, nums);
    }

}
