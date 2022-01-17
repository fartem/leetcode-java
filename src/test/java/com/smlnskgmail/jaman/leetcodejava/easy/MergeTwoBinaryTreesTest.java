package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class MergeTwoBinaryTreesTest {

    @Test
    public void defaultTest() {
        TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        TreeNode root2 =
                new TreeNode(
                        2,
                        new TreeNode(1, null, new TreeNode(4)),
                        new TreeNode(3, null, new TreeNode(7)));
        TreeNode correct =
                new TreeNode(
                        3,
                        new TreeNode(4, new TreeNode(5), new TreeNode(4)),
                        new TreeNode(5, null, new TreeNode(7)));
        TreeNode solution = new MergeTwoBinaryTrees(root1, root2).solution();
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
