package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class DistributeCoinsInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new DistributeCoinsInBinaryTree(new TreeNode(3, new TreeNode(0), new TreeNode(0)))
                        .solution());
    }
}
