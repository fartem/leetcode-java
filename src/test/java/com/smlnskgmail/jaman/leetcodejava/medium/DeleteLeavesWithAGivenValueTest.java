package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DeleteLeavesWithAGivenValueTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                1,
                null,
                new TreeNode(
                        3,
                        null,
                        new TreeNode(4)
                )
        );
        TreeNode solution = new DeleteLeavesWithAGivenValue(
                new TreeNode(
                        1,
                        new TreeNode(
                                2,
                                new TreeNode(2),
                                null
                        ),
                        new TreeNode(
                                3,
                                new TreeNode(2),
                                new TreeNode(4)
                        )
                ),
                2
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
