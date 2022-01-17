package com.smlnskgmail.jaman.leetcodejava.medium;

import static junit.framework.TestCase.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class MaximumBinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct =
                new TreeNode(
                        6,
                        new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))),
                        new TreeNode(5, new TreeNode(0), null));
        TreeNode solution = new MaximumBinaryTree(new int[] {3, 2, 1, 6, 0, 5}).solution();
        assertTrue(assertNodes(correct, solution));
    }

    private boolean assertNodes(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            return assertNodes(n1.left, n2.left) && assertNodes(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }
}
