package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInABinarySearchTreeTest {

    @Test
    public void defaultTest() {
        TreeNode solution = new SearchInABinarySearchTree(
                new TreeNode(
                        4,
                        new TreeNode(
                                2,
                                new TreeNode(1),
                                new TreeNode(3)
                        ),
                        new TreeNode(7)
                ),
                2
        ).solution();

        assertEquals(2, solution.val);
        assertEquals(1, solution.left.val);
        assertEquals(3, solution.right.val);
    }

}
