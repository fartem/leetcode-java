package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTreeToGreaterSumTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                30,
                new TreeNode(
                        36,
                        new TreeNode(36),
                        new TreeNode(
                                35,
                                null,
                                new TreeNode(33)
                        )
                ),
                new TreeNode(
                        21,
                        new TreeNode(26),
                        new TreeNode(
                                15,
                                null,
                                new TreeNode(8)
                        )
                )
        );
        TreeNode solution = new BinarySearchTreeToGreaterSumTree(
                new TreeNode(
                        4,
                        new TreeNode(
                                1,
                                new TreeNode(0),
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(3)
                                )
                        ),
                        new TreeNode(
                                6,
                                new TreeNode(5),
                                new TreeNode(
                                        7,
                                        null,
                                        new TreeNode(8)
                                )
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
