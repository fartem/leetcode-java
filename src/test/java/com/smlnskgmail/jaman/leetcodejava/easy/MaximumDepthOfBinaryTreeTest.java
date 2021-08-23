package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MaximumDepthOfBinaryTree(
                        new TreeNode(
                                3,
                                new TreeNode(9),
                                new TreeNode(
                                        20,
                                        new TreeNode(15),
                                        new TreeNode(7)
                                )
                        )
                ).solution()
        );
    }

}
