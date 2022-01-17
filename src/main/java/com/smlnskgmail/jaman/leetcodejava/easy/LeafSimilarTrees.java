package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/leaf-similar-trees
public class LeafSimilarTrees {

    private final TreeNode root1;
    private final TreeNode root2;

    public LeafSimilarTrees(TreeNode root1, TreeNode root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public boolean solution() {
        List<Integer> f = new ArrayList<>();
        fillLeafs(root1, f);
        List<Integer> s = new ArrayList<>();
        fillLeafs(root2, s);
        if (f.size() != s.size()) {
            return false;
        }
        for (int i = 0; i < f.size(); i++) {
            int fV = f.get(i);
            int sV = s.get(i);
            if (fV != sV) {
                return false;
            }
        }
        return true;
    }

    private void fillLeafs(TreeNode root, List<Integer> leafs) {
        if (root == null) {
            return;
        }
        fillLeafs(root.left, leafs);
        if (isLeaf(root)) {
            leafs.add(root.val);
        }
        fillLeafs(root.right, leafs);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
