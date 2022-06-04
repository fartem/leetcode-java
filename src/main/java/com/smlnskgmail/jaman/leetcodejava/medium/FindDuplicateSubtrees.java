package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/find-duplicate-subtrees/
public class FindDuplicateSubtrees {

    private final Set<TreeNode> duplicates = new HashSet<>();
    private final Map<String, TreeNode> nodes = new HashMap<>();

    private final TreeNode input;

    public FindDuplicateSubtrees(TreeNode input) {
        this.input = input;
    }

    public List<TreeNode> solution() {
        traverse(input);
        return new ArrayList<>(duplicates);
    }

    private String traverse(TreeNode node) {
        if (node == null) {
            return "";
        }
        String left = traverse(node.left);
        String right = traverse(node.right);
        String curr = left + " " + right + " " + node.val;
        if (nodes.containsKey(curr)) {
            duplicates.add(nodes.get(curr));
        } else {
            nodes.put(curr, node);
        }
        return curr;
    }

}
