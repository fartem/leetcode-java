package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new MaximumWidthOfBinaryTree(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        3,
                                        new TreeNode(5),
                                        new TreeNode(3)
                                ),
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(9)
                                )
                        )
                ).solution()
        );
    }

}
