package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class ConvertSortedListToBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct =
                new TreeNode(
                        0,
                        new TreeNode(-3, new TreeNode(-10), null),
                        new TreeNode(9, new TreeNode(5), null));
        TreeNode solution =
                new ConvertSortedListToBinarySearchTree(
                                new ListNode(
                                        -10,
                                        new ListNode(
                                                -3,
                                                new ListNode(0, new ListNode(5, new ListNode(9))))))
                        .solution();
        assertTrue(isEquals(correct, solution));
    }

    private boolean isEquals(TreeNode a, TreeNode b) {
        if (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            return isEquals(a.right, b.right);
        }
        return a == null && b == null;
    }
}
