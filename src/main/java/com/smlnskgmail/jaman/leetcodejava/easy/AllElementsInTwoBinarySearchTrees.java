package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public class AllElementsInTwoBinarySearchTrees {

    private final TreeNode root1;
    private final TreeNode root2;

    public AllElementsInTwoBinarySearchTrees(TreeNode root1, TreeNode root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public List<Integer> solution() {
        List<Integer> f = new ArrayList<>();
        traverse(root1, f);
        List<Integer> s = new ArrayList<>();
        traverse(root2, s);
        return merge(f, s);
    }

    private void traverse(TreeNode node, List<Integer> values) {
        if (node != null) {
            traverse(node.left, values);
            values.add(node.val);
            traverse(node.right, values);
        }
    }

    private List<Integer> merge(List<Integer> f, List<Integer> s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = 0; i < f.size() || j < s.size(); ) {
            if (i >= f.size()) {
                for (int k = j; k < s.size(); k++) {
                    result.add(s.get(k));
                }
                break;
            } else if (j >= s.size()) {
                for (int k = i; k < f.size(); k++) {
                    result.add(f.get(k));
                }
                break;
            }
            int a = f.get(i);
            int b = s.get(j);
            if (a < b) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }
        return result;
    }

}
