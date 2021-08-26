package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InvertBinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode root = new TreeNode(
                4,
                new TreeNode(
                        2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(
                        7,
                        new TreeNode(6),
                        new TreeNode(9)
                )
        );
        TreeNode correct = new TreeNode(
                4,
                new TreeNode(
                        7,
                        new TreeNode(9),
                        new TreeNode(6)
                ),
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(1)
                )
        );
        TreeNode solution = new InvertBinaryTree(root).solution();
        assertTrue(check(correct, solution));
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            boolean lCorrect = check(left.left, right.left);
            boolean rCorrect = check(left.right, right.right);
            return lCorrect && rCorrect;
        }
        return left == null && right == null;
    }

}
