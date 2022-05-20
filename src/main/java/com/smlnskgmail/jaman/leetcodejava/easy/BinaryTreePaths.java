package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-paths/
public class BinaryTreePaths {

    private final TreeNode input;

    public BinaryTreePaths(TreeNode input) {
        this.input = input;
    }

    public List<String> solution() {
        List<String> result = new ArrayList<>();
        fillPaths(input, "", result);
        return result;
    }

    private void fillPaths(
            TreeNode node,
            String path,
            List<String> paths
    ) {
        if (node == null) {
            return;
        }
        String curr = path.length() > 0
                ? path + "->" + node.val
                : String.valueOf(node.val);
        if (node.left == null && node.right == null) {
            paths.add(curr);
        } else {
            fillPaths(node.left, curr, paths);
            fillPaths(node.right, curr, paths);
        }
    }

}
