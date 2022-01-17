package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class CountGoodNodesInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new CountGoodNodesInBinaryTree(
                                new TreeNode(
                                        3,
                                        new TreeNode(1, new TreeNode(3), null),
                                        new TreeNode(4, new TreeNode(1), new TreeNode(5))))
                        .solution());
    }
}
