package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class UnivaluedBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new UnivaluedBinaryTree(
                                new TreeNode(
                                        1,
                                        new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                                        new TreeNode(1, null, new TreeNode(1))))
                        .solution());
    }
}
