package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class PathSumTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new PathSum(
                                new TreeNode(
                                        5,
                                        new TreeNode(
                                                4,
                                                new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                                                null),
                                        new TreeNode(
                                                8,
                                                new TreeNode(13),
                                                new TreeNode(4, null, new TreeNode(1)))),
                                22)
                        .solution());
    }
}
