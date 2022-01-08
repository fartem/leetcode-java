package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree
public class MaximumLevelSumOfABinaryTree {

    private final TreeNode input;

    public MaximumLevelSumOfABinaryTree(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        Deque<TreeNode> nodes = new LinkedList<>();
        nodes.add(input);
        int max = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int sum = 0;
            while (size != 0) {
                TreeNode node = nodes.pop();
                sum += node.val;
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
                size--;
            }
            if (sum > max) {
                max = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }

}
