package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void defaultTest() {
        TreeNode solution =
                new TreeNode(
                        1,
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(5, null, new TreeNode(6)));
        new FlattenBinaryTreeToLinkedList(solution).solution();
        assertTrue(
                TreeNode.areEqual(
                        new TreeNode(
                                1,
                                null,
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(
                                                3,
                                                null,
                                                new TreeNode(
                                                        4,
                                                        null,
                                                        new TreeNode(5, null, new TreeNode(6)))))),
                        solution));
    }
}
