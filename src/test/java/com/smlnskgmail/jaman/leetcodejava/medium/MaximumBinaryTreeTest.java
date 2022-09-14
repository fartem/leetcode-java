package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MaximumBinaryTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                6,
                new TreeNode(
                        3,
                        null,
                        new TreeNode(
                                2,
                                null,
                                new TreeNode(1)
                        )
                ),
                new TreeNode(
                        5,
                        new TreeNode(0),
                        null
                )
        );
        TreeNode solution = new MaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5}).solution();
        assertTrue(TreeNode.areEqual(correct, solution));
    }

}
