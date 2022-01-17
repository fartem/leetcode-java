package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class LinkedListInBinaryTreeTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new LinkedListInBinaryTree(
                                new ListNode(4, new ListNode(2, new ListNode(8))),
                                new TreeNode(
                                        1,
                                        new TreeNode(
                                                4, null, new TreeNode(2, new TreeNode(1), null)),
                                        new TreeNode(
                                                4,
                                                new TreeNode(
                                                        2,
                                                        new TreeNode(6),
                                                        new TreeNode(
                                                                8,
                                                                new TreeNode(1),
                                                                new TreeNode(3))),
                                                null)))
                        .solution());
    }
}
