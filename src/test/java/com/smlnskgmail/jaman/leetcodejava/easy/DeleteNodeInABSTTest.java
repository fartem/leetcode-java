package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class DeleteNodeInABSTTest {

    @Test
    public void defaultTest() {
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                5,
                                new TreeNode(4, new TreeNode(2), null),
                                new TreeNode(6, null, new TreeNode(7))),
                        new DeleteNodeInABST(
                                        new TreeNode(
                                                5,
                                                new TreeNode(4, new TreeNode(2), null),
                                                new TreeNode(6, null, new TreeNode(7))),
                                        3)
                                .solution()));
    }
}
