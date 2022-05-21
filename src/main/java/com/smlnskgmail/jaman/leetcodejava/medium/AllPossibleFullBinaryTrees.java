package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/all-possible-full-binary-trees/
public class AllPossibleFullBinaryTrees {

    private static final Map<Integer, List<TreeNode>> VALUES = new HashMap<>();

    private final int input;

    public AllPossibleFullBinaryTrees(int input) {
        this.input = input;
    }

    public List<TreeNode> solution() {
        return allPossibleFBT(input);
    }

    private List<TreeNode> allPossibleFBT(int n) {
        if (!VALUES.containsKey(n)) {
            List<TreeNode> nodes = new ArrayList<>();
            if (n == 1) {
                nodes.add(new TreeNode(0));
            } else if (n % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    int j = n - 1 - i;
                    for (TreeNode left : allPossibleFBT(i)) {
                        for (TreeNode right : allPossibleFBT(j)) {
                            TreeNode node = new TreeNode(0, left, right);
                            nodes.add(node);
                        }
                    }
                }
            }
            VALUES.put(n, nodes);
        }
        return VALUES.get(n);
    }

}
