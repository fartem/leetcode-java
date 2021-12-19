package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryTreePruningTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                1,
                null,
                new TreeNode(
                        0,
                        null,
                        new TreeNode(1)
                )
        );
        TreeNode solution = new BinaryTreePruning(
                new TreeNode(
                        1,
                        null,
                        new TreeNode(
                                0,
                                new TreeNode(0),
                                new TreeNode(1)
                        )
                )
        ).solution();
        assertTrue(areEqual(correct, solution));
    }

    private boolean areEqual(TreeNode n1, TreeNode n2) {
        if (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            return areEqual(n1.left, n2.left) && areEqual(n1.right, n2.right);
        }
        return n1 == null && n2 == null;
    }

}
