package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal
public class NAryTreePreorderTraversal {

    private final Node input;

    public NAryTreePreorderTraversal(Node input) {
        this.input = input;
    }

    public List<Integer> solution() {
        if (input == null) {
            return Collections.emptyList();
        }
        List<Integer> nums = new ArrayList<>();
        apply(input, nums);
        return nums;
    }

    private void apply(Node node, List<Integer> nums) {
        nums.add(node.val);
        for (int i = 0; i < node.children.size(); i++) {
            apply(node.children.get(i), nums);
        }
    }
}
