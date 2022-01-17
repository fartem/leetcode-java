package com.smlnskgmail.jaman.leetcodejava.medium;

import static com.smlnskgmail.jaman.leetcodejava.support.TreeNode.areEqual;
import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class InsertIntoABinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode correct =
                new TreeNode(
                        4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(5), null));
        TreeNode solution =
                new InsertIntoABinarySearchTree(
                                new TreeNode(
                                        4,
                                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                                        new TreeNode(7)),
                                5)
                        .solution();
        assertTrue(areEqual(correct, solution));
    }
}
