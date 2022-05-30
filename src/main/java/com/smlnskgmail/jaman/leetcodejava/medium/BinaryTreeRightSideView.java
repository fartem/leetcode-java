package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;

import java.util.*;

// https://leetcode.com/problems/binary-tree-right-side-view/
public class BinaryTreeRightSideView {

    private final TreeNode input;

    public BinaryTreeRightSideView(TreeNode input) {
        this.input = input;
    }

    public List<Integer> solution() {
        if (input == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(input);
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size != 0) {
                TreeNode node = deque.poll();
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
                if (size == 1) {
                    result.add(node.val);
                }
                size--;
            }
        }
        return result;
    }

}
