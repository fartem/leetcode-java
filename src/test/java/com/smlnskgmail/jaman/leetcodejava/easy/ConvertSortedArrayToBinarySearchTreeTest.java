package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct =
                new TreeNode(
                        0,
                        new TreeNode(-10, null, new TreeNode(-3)),
                        new TreeNode(5, null, new TreeNode(9)));
        TreeNode solution =
                new ConvertSortedArrayToBinarySearchTree(new int[] {-10, -3, 0, 5, 9}).solution();
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
