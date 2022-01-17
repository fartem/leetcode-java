package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new LowestCommonAncestorOfABinarySearchTree(
                                new TreeNode(
                                        6,
                                        new TreeNode(
                                                2,
                                                new TreeNode(0),
                                                new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                                        new TreeNode(8, new TreeNode(7), new TreeNode(9))),
                                new TreeNode(2),
                                new TreeNode(8))
                        .solution()
                        .val);
    }
}
