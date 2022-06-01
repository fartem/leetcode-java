package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/unique-binary-search-trees-ii/
public class UniqueBinarySearchTreesII {

    private final int input;

    public UniqueBinarySearchTreesII(int input) {
        this.input = input;
    }

    public List<TreeNode> solution() {
        return generate(1, input);
    }

    private List<TreeNode> generate(int i, int j) {
        List<TreeNode> nodes = new ArrayList<>();
        if (i > j) {
            nodes.add(null);
        } else {
            for (int mid = i; mid <= j; mid++) {
                List<TreeNode> left = generate(i, mid - 1);
                List<TreeNode> right = generate(mid + 1, j);
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        TreeNode node = new TreeNode(mid);
                        node.left = l;
                        node.right = r;
                        nodes.add(node);
                    }
                }
            }
        }
        return nodes;
    }

}
