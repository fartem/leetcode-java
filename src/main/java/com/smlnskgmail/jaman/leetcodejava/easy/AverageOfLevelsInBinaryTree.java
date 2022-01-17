package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/average-of-levels-in-binary-tree
public class AverageOfLevelsInBinaryTree {

    private final TreeNode input;

    public AverageOfLevelsInBinaryTree(TreeNode input) {
        this.input = input;
    }

    public List<Double> solution() {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(input);
        while (!queue.isEmpty()) {
            long sum = 0;
            int size = queue.size();
            int count = size;
            while (size > 0) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                sum += node.val;
                size--;
            }
            result.add(sum * 1.0 / count);
        }
        return result;
    }
}
