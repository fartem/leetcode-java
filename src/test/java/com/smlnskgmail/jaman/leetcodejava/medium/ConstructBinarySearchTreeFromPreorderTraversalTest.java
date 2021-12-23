package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertTrue;

public class ConstructBinarySearchTreeFromPreorderTraversalTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                8,
                new TreeNode(
                        5,
                        new TreeNode(1),
                        new TreeNode(7)
                ),
                new TreeNode(
                        10,
                        null,
                        new TreeNode(12)
                )
        );
        TreeNode solution = new ConstructBinarySearchTreeFromPreorderTraversal(
                new int[]{8, 5, 1, 7, 10, 12}
        ).solution();
        assertTrue(areEqual(correct, solution));
    }

}
