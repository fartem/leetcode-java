package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IncreasingOrderSearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode root = new TreeNode(
                5,
                new TreeNode(
                        3,
                        new TreeNode(
                                2,
                                new TreeNode(1),
                                null
                        ),
                        new TreeNode(4)
                ),
                new TreeNode(
                        6,
                        null,
                        new TreeNode(
                                8,
                                new TreeNode(7),
                                new TreeNode(9)
                        )
                )
        );
        TreeNode correct = new TreeNode(
                1,
                null,
                new TreeNode(
                        2,
                        null,
                        new TreeNode(
                                3,
                                null,
                                new TreeNode(
                                        4,
                                        null,
                                        new TreeNode(
                                                5,
                                                null,
                                                new TreeNode(
                                                        6,
                                                        null,
                                                        new TreeNode(
                                                                7,
                                                                null,
                                                                new TreeNode(
                                                                        8,
                                                                        null,
                                                                        new TreeNode(9)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        TreeNode solution = new IncreasingOrderSearchTree(root).solution();
        assertTrue(isEquals(correct, solution));
    }

    private boolean isEquals(TreeNode a, TreeNode b) {
        if (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            return isEquals(a.right, b.right);
        }
        return a == null && b == null;
    }

}
