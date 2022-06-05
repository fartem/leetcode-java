package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/
public class NumberOfGoodLeafNodesPairs {

    private final TreeNode root;
    private final int distance;

    private int result;

    public NumberOfGoodLeafNodesPairs(TreeNode root, int distance) {
        this.root = root;
        this.distance = distance;
    }

    public int solution() {
        calculate(root, distance);
        return result;
    }

    private List<Integer> calculate(TreeNode node, int distance) {
        if (node == null) {
            return Collections.emptyList();
        }
        if (node.left == null && node.right == null) {
            return Collections.singletonList(1);
        }
        List<Integer> left = calculate(node.left, distance);
        List<Integer> right = calculate(node.right, distance);
        for (int l : left) {
            for (int r : right) {
                if (l + r <= distance) {
                    result++;
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        for (int l : left) {
            if (l + 1 < distance) {
                path.add(l + 1);
            }
        }
        for (int r : right) {
            if (r + 1 < distance) {
                path.add(r + 1);
            }
        }
        return path;
    }

}
