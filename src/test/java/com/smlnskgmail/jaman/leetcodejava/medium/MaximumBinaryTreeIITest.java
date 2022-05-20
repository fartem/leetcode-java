package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaximumBinaryTreeIITest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                5,
                                new TreeNode(
                                        4,
                                        new TreeNode(1),
                                        new TreeNode(
                                                3,
                                                new TreeNode(2),
                                                null
                                        )
                                ),
                                null
                        ),
                        new MaximumBinaryTreeII(
                                new TreeNode(
                                        4,
                                        new TreeNode(1),
                                        new TreeNode(
                                                3,
                                                new TreeNode(2),
                                                null
                                        )
                                ),
                                5
                        ).solution()
                )
        );
    }

}
