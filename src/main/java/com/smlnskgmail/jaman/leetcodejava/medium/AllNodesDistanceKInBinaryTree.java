package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class AllNodesDistanceKInBinaryTree {

    private final Map<TreeNode, TreeNode> parent = new HashMap<>();

    private final TreeNode root;
    private final TreeNode target;
    private final int k;

    public AllNodesDistanceKInBinaryTree(TreeNode root, TreeNode target, int k) {
        this.root = root;
        this.target = target;
        this.k = k;
    }

    public List<Integer> solution() {
        dfs(root, null);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(null);
        q.add(target);

        Set<TreeNode> seen = new HashSet<>();
        seen.add(target);
        seen.add(null);

        int distance = 0;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                if (distance == k) {
                    List<Integer> result = new ArrayList<>();
                    for (TreeNode n : q) {
                        result.add(n.val);
                    }
                    return result;
                }
                q.offer(null);
                distance++;
            } else {
                if (!seen.contains(node.left)) {
                    seen.add(node.left);
                    q.offer(node.left);
                }
                if (!seen.contains(node.right)) {
                    seen.add(node.right);
                    q.offer(node.right);
                }
                TreeNode p = parent.get(node);
                if (!seen.contains(p)) {
                    seen.add(p);
                    q.offer(p);
                }
            }
        }
        return Collections.emptyList();
    }

    private void dfs(TreeNode n, TreeNode p) {
        if (n != null) {
            parent.put(n, p);
            dfs(n.left, n);
            dfs(n.right, n);
        }
    }
}
