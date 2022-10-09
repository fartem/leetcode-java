package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/binary-tree-cameras/
public class BinaryTreeCameras {

    private final TreeNode input;
    private int result;

    public BinaryTreeCameras(TreeNode input) {
        this.input = input;
    }

    public int solution() {
        Set<TreeNode> cov = new HashSet<>();
        cov.add(null);
        dfs(cov, input, null);
        return result;
    }

    private void dfs(Set<TreeNode> cov, TreeNode node, TreeNode par) {
        if (node != null) {
            dfs(cov, node.left, node);
            dfs(cov, node.right, node);
            if (par == null && !cov.contains(node)
                    || !cov.contains(node.left)
                    || !cov.contains(node.right)) {
                result++;
                cov.add(node);
                cov.add(par);
                cov.add(node.left);
                cov.add(node.right);
            }
        }
    }

}
