package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(
                0,
                new TreeNode(
                        -3,
                        new TreeNode(-10),
                        null
                ),
                new TreeNode(
                        9,
                        new TreeNode(5),
                        null
                )
        );
        TreeNode solution = new ConvertSortedListToBinarySearchTree(
                ListNode.fromNumbers(-10, -3, 0, 5, 9)
        ).solution();
        assertTrue(TreeNode.areEqual(correct, solution));
    }

}
