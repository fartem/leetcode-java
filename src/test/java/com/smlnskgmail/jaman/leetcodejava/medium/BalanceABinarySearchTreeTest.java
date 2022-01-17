package com.smlnskgmail.jaman.leetcodejava.medium;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class BalanceABinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct = new TreeNode(2, new TreeNode(1), new TreeNode(3, null, new TreeNode(4)));
        TreeNode solution =
                new BalanceABinarySearchTree(
                                new TreeNode(
                                        1,
                                        null,
                                        new TreeNode(
                                                2, null, new TreeNode(3, null, new TreeNode(4)))))
                        .solution();
        assertTrue(areEqual(correct, solution));
    }
}
