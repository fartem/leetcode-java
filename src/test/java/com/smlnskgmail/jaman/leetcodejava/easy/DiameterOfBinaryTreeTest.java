package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiameterOfBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new DiameterOfBinaryTree(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(5)
                                ),
                                new TreeNode(3)
                        )
                ).solution()
        );
    }

}
