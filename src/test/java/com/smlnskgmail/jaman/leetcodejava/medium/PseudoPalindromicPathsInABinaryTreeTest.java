package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoPalindromicPathsInABinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new PseudoPalindromicPathsInABinaryTree(
                        new TreeNode(
                                2,
                                new TreeNode(
                                        3,
                                        new TreeNode(3),
                                        new TreeNode(1)
                                ),
                                new TreeNode(
                                        1,
                                        null,
                                        new TreeNode(1)
                                )
                        )
                ).solution()
        );
    }

}
