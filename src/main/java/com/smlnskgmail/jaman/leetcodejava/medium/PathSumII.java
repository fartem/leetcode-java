package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/path-sum-ii
public class PathSumII {

    private final TreeNode root;
    private final int targetSum;

    private final List<List<Integer>> paths = new ArrayList<>();

    public PathSumII(TreeNode root, int targetSum) {
        this.root = root;
        this.targetSum = targetSum;
    }

    public List<List<Integer>> solution() {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        dfs(root, result, path, targetSum - root.val);
        return result;
    }

    private void dfs(TreeNode node, List<List<Integer>> paths, List<Integer> path, int sum) {
        if (sum == 0 && node.left == null && node.right == null) {
            List<Integer> targetPath = new ArrayList<>(path);
            paths.add(targetPath);
        }
        if (node.left != null) {
            path.add(node.left.val);
            dfs(node.left, paths, path, sum - node.left.val);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            path.add(node.right.val);
            dfs(node.right, paths, path, sum - node.right.val);
            path.remove(path.size() - 1);
        }
    }
}
