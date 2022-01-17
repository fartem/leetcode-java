package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class FindModeInBinarySearchTreeTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2},
                new FindModeInBinarySearchTree(
                                new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null)))
                        .solution());
    }
}
