package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConstructBinaryTreeFromPreorderAndPostorderTraversalTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(5)
                                ),
                                new TreeNode(
                                        3,
                                        new TreeNode(6),
                                        new TreeNode(7)
                                )
                        ),
                        new ConstructBinaryTreeFromPreorderAndPostorderTraversal(
                                new int[]{1, 2, 4, 5, 3, 6, 7},
                                new int[]{4, 5, 2, 6, 7, 3, 1}
                        ).solution()
                )
        );
    }

}
