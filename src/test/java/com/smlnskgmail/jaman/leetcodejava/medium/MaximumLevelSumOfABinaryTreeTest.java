package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLevelSumOfABinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new MaximumLevelSumOfABinaryTree(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        7,
                                        new TreeNode(7),
                                        new TreeNode(-8)
                                ),
                                new TreeNode(0)
                        )
                ).solution()
        );
    }

}
