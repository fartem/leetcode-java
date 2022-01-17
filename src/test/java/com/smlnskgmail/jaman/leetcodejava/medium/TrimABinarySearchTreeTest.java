package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class TrimABinarySearchTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(1, null, new TreeNode(2)),
                        new TrimABinarySearchTree(
                                        new TreeNode(1, new TreeNode(0), new TreeNode(2)), 1, 2)
                                .solution()));
    }
}
