package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlipEquivalentBinaryTreesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new FlipEquivalentBinaryTrees(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(
                                                5,
                                                new TreeNode(7),
                                                new TreeNode(8)
                                        )
                                ),
                                new TreeNode(
                                        3,
                                        new TreeNode(6),
                                        null
                                )
                        ),
                        new TreeNode(
                                1,
                                new TreeNode(
                                        3,
                                        null,
                                        new TreeNode(6)
                                ),
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(
                                                5,
                                                new TreeNode(8),
                                                new TreeNode(7)
                                        )
                                )
                        )
                ).solution()
        );
    }

}
