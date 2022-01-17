package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class CousinsInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new CousinsInBinaryTree(
                                new TreeNode(
                                        1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3)),
                                4,
                                3)
                        .solution());
    }
}
