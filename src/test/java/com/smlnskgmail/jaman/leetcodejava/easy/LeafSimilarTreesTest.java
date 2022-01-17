package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import com.smlnskgmail.jaman.leetcodejava.support.TreeNode;
import org.junit.Test;

public class LeafSimilarTreesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new LeafSimilarTrees(
                                new TreeNode(
                                        3,
                                        new TreeNode(
                                                5,
                                                new TreeNode(6),
                                                new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                                        new TreeNode(1, new TreeNode(9), new TreeNode(8))),
                                new TreeNode(
                                        3,
                                        new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                                        new TreeNode(
                                                1,
                                                new TreeNode(4),
                                                new TreeNode(2, new TreeNode(9), new TreeNode(8)))))
                        .solution());
    }
}
